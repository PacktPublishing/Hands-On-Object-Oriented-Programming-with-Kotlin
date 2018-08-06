package chapter7.patterns.structural

import java.util.prefs.Preferences

data class User(
        private val preferences: Preferences = Preferences.userRoot().node(User::class.java.simpleName),
        val id: Int = preferences.getInt(User::id.name, 0),
        val firstName: String = preferences.get(User::firstName.name, ""),
        val lastName: String = preferences.get(User::lastName.name, "")
) {
    init {
        with(preferences) {
            putInt(User::id.name, id)
            put(User::firstName.name, firstName)
            put(User::lastName.name, lastName)
        }
    }
}

fun main(args: Array<String>) {
    User(id = 1, firstName = "Igor", lastName = "Kucherenko").apply {
        println(this)
    }
    println(User())
}