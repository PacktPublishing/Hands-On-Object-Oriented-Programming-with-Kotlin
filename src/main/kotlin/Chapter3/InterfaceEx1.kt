package Chapter3

interface IPrintable{
    fun print()
}

class Invoice : IPrintable {
    override fun print() {
        println("Invoice is printed")
    }
}

interface IClickable{
    fun click()
}

class Button : IClickable {
    override fun click() {
        println("Button is clicked")
    }
}

fun main(args: Array<String>) {
    var invoice = Invoice()
    invoice.print()

    var button = Button()
    button.click()
}