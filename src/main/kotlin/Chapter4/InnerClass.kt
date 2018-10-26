package Chapter4Inner

class Outer {

    val out = "Outer class"
    var counter = 0

    fun info() {
        println("I am out class function")
    }

    inner class Nested {

        val nest = "Nested class"
        var counter = 0

        fun info() {
            // this@Outer.info()
            println("I am nested class function")
        }

        fun incrementCounter(){
            this@Outer.counter++
        }
    }
}

fun main(args: Array<String>) {

    val outerObj = Outer()

    val nestedObj = outerObj.Nested()

    println("Outer class counter before increment = "+ outerObj.counter)
    nestedObj.incrementCounter()
    println("Outer class counter after increment = "+ outerObj.counter)
}

