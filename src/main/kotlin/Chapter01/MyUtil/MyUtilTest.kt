package chapter1.MyUtil

import chapter1.Util.*

fun main(args: Array<String>) {

    hello()

    println("Power Function")
    println(myPow(5.0,3.0))

    println("Random number generator")
    var range = 5..50

    for (i in 1..5) {
        println(myRandom(range))
    }

    println("value of PI is ${PI}" )
    println("Area of circle " + areaOfCircle(4.0))

}