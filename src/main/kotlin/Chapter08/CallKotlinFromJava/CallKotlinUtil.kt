@file:JvmName("KotlinUtil")
package Chapter08.CallKotlinFromJava


fun addition (a: Int, b : Int){

    println("Result of $a + $b is ${a+b}")

}



@JvmName ("addDouble")
fun addition (a: Double, b : Double){

    println("Result of $a + $b is ${a+b}")

}



object Singleton {

    fun happy() {
        println("I am Happy")
    }

    @JvmStatic fun excited() {
        println("I am very Excited")
    }

}

