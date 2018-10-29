package chapter1.Util

fun hello() = println("Hello from Package chapter1.Util")

val PI = 3.1415926535

// Calculate power of given number
fun myPow(base : Double, exp: Double) : Double {

    var result = 1.0

    var counter = exp

    while (counter > 0) {

        result*= base

        counter--
    }

    return result
}

// Calculate area of a circle
fun areaOfCircle(radius : Double) : Double{

    return PI * 2 * radius
}

// Generate random number within given range
fun myRandom(range: IntRange) : Int{

    return range.shuffled().last()
}




