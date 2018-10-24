package chapter11

import chapter10.ToDo
import chapter10.ToDoAlreadyExistException
import chapter10.ToDoStorage
import io.kotlintest.shouldThrow
import junit.framework.TestCase.assertEquals
import org.jetbrains.spek.api.*
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith



@RunWith(JUnitPlatform::class)
object ToDoSpek : Spek({
    given("A storage") {
        val storage = ToDoStorage()
        on("set a todo with with args: name and context") {
            val todo = ToDo("name", "content")
            val result = storage.set("name", todo)
            it("returns true") {
                assert(result)
            }
        }
        on("""get a todo by "name" key""") {
            val todo = storage["name"]
            it("""returns a todo with "content" """) {
                assertEquals("content", todo?.content)
            }
        }
        on("""set a todo with a key that already stored""") {
            it ("should throw ToDoAlreadyExistException") {
                shouldThrow<ToDoAlreadyExistException> {
                    val todo = ToDo("name", "content")
                    storage.set("name", todo)
                }
            }
        }
    }
})

@RunWith(JUnitPlatform::class)
object DescribeStyleToDoSpek : Spek({
    describe("a storage") {
        val storage = ToDoStorage()
        on("set a todo with with args: name and context") {
            val todo = ToDo("name", "content")
            val result = storage.set("name", todo)
            it("returns true") {
                assert(result)
            }
        }
        on("""get a todo by "name" key""") {
            val todo = storage["name"]
            it("""returns a todo with "content" """) {
                assertEquals("content", todo?.content)
            }
        }
        describe("a non-empty storage") {
            on("""set a todo with a key that already stored""") {
                it ("should throw ToDoAlreadyExistException") {
                    shouldThrow<ToDoAlreadyExistException> {
                        val todo = ToDo("name", "content")
                        storage.set("name", todo)
                    }
                }
            }
        }
    }
})