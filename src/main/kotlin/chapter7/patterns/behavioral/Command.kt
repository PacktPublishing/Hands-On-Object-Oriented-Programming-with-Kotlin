package chapter7.patterns.behavioral

import java.util.*

data class User(val firstName: String, val lastName: String)

interface UserCommand {
    val user: User
    fun execute()
}

class CreateUserCommand(override val user: User) : UserCommand {
    override fun execute() {
        println("Creating...")
    }
}

class DeleteUserCommand(override val user: User) : UserCommand {
    override fun execute() {
        println("Deleting...")
    }
}

class Executor {
    private val queue = LinkedList<UserCommand>()

    fun addCommand(command: UserCommand) {
        queue.add(command)
    }

    fun execute() {
        queue.forEach { it.execute() }
    }
}

fun main(args: Array<String>) {
    val executor = Executor()
    val user = User("Igor", "Kucherenko")
    //..........
    executor.addCommand(CreateUserCommand(user))
    //..........
    executor.addCommand(DeleteUserCommand(user))

    executor.execute()
}