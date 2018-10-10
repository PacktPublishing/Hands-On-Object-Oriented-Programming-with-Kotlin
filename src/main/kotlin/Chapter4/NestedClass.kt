package Chapter4

class Outer{

    val out = "Outer class"

    fun info() {
        println("I am out class function")
    }

    fun getNestedClass() : Nested{

        return Nested()
    }

    class Nested {

        val nest = "Nested class"

        fun info() {
            println("I am nested class function")
        }
    }
}

fun main(args: Array<String>){

    val outerObj = Outer()
    println(outerObj.out)
    outerObj.info()

    var nestedObj = Outer.Nested()
    println(nestedObj.nest)
    nestedObj.info()

    nestedObj = outerObj.getNestedClass()
    println(nestedObj.nest)
    nestedObj.info()
}
