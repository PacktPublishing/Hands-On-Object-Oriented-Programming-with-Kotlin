package chapter7.patterns.behavioral

import kotlin.properties.Delegates

typealias TextChangeListener = (text: String?) -> Unit

class TextInput {
    var text by Delegates.observable<String?>(null) { _, _, newValue ->
        textChangeListener?.invoke(newValue)
    }
    var textChangeListener: TextChangeListener? = null
}

fun main(args: Array<String>) {
    val textInput = TextInput().apply {
        this.textChangeListener = {println(it)}
    }
    textInput.text = "Typing"
}