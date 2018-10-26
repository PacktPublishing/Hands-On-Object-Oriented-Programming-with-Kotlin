package Chapter4

object MyButton {

    var count = 0

    fun clickMe() {
        println("I am clicked ${++count} times")
    }
}

fun click03() {
    MyButton.clickMe()
}

fun click04() {
    MyButton.clickMe()
}

fun main(args: Array<String>) {

    MyButton.clickMe()
    MyButton.clickMe()

    click03()
    click04()
}