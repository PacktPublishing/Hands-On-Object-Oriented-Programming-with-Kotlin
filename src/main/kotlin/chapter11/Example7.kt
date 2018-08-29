package chapter11

class ToDo(val name: String, val content: String)

class ToDoAlreadyExistException(
        message: String? = null,
        cause: Throwable? = null,
        enableSuppression: Boolean = true,
        writableStackTrace: Boolean = true
) : Exception(message, cause, enableSuppression, writableStackTrace)


class ToDoStorage {
    private val todos = HashMap<String, ToDo>()

    operator fun get(name: String) = todos[name]

    operator fun set(name: String, todo: ToDo) {
        if (todos.contains(name)) {
            throw ToDoAlreadyExistException()
        }
        todos[name] = todo
    }
}

fun main(args: Array<String>) {
    val storage = ToDoStorage()
    val todo = ToDo("name", "content")
    storage[todo.name] = todo
    storage[todo.name] = todo
}

