package Chapter4Interface

interface buttonInterface {
    fun clickMe()
}

object MyButton : buttonInterface {

    var count = 0
    override fun clickMe() {
        println("I am clicked ${++count} times")
    }
}

open class Parent {
    open fun callMySingleton(){
        println("Parent class is called")
    }
}

object MySingleton : Parent() {

    override fun callMySingleton(){
        super.callMySingleton()
        println("my Singleton class is called")
    }
}


fun main(args: Array<String>) {
    MyButton.clickMe()

    MySingleton.callMySingleton()
}

