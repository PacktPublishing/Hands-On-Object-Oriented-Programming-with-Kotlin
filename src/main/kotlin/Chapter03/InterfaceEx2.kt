package Chapter3

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

// More than one interfaces can be extended
class Calculator() : IAdd, ISubtract {

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
