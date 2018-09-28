package Chapter3MultiplueInterface

interface IAdd {
    fun add(a : Int, b : Int)
}

interface ISubtract {
    fun subtract(a : Int, b : Int)
}

interface IMultiply {
    fun multiply(a : Int, b : Int)
}

interface IDivide{
    fun divide(a : Int, b : Int)
}

interface InterfaceBasicCalculator : IAdd, ISubtract, IMultiply, IDivide {
    fun displayMessage()
}

class Calculator() : InterfaceBasicCalculator {
    override fun multiply(a: Int, b: Int) {
    }

    override fun divide(a: Int, b: Int) {
    }

    override fun displayMessage() {
        println("All functions are implemented")
    }

    override fun subtract(a: Int, b: Int) {
        println("$a - $b = ${a-b}")
    }

    override fun add(a: Int, b: Int) {
        println("$a + $b = ${a+b}")
    }
}

fun main(args: Array<String>) {
    val calc = Calculator()
    calc.add(5, 4)
    calc.subtract(5, 4)
}
