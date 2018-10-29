package chapter6.patterns.creational

class User private constructor(
        var firstName: String? = null,
        var lastName: String? = null
) {
    companion object {
        private val user by lazy {User()}
        fun getInstance(): User = user
    }
}

fun main(args: Array<String>) {
    with(User.getInstance()) {
        firstName = "Ihor"
        lastName = "Kucherenko"
    }
}

