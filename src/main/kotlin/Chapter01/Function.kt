package chapter1

/*
* Each code block /* Code */ in this file is a complete one example.
* Unblock one at a time and execute or call each function in main() and execute.
*/


// Simplest form of Function
fun hello(): Unit {
    println("Hello from Kotlin")
}


fun hello(name: String): Unit {
    println("Hello from $name")
}


fun add(a: Int, b: Int) {
    println("Result of $a + $b is ${a + b}")
}


fun myFun(message: String): String {
    return "Hello from $message"
}


fun addValues(i: Int, j: Int): Int {
    val k = i + j
    return k
}


fun areaOfCircle(radius: Double): Double {
    val area = Math.PI * radius * radius
    return area
}

// function as an expression
fun addValuesEx(a: Int, b: Int) = a + b


fun getMax(x: Int, y: Int): Int {

    if (x >= y) {
        return x
    } else {
        return y
    }
}

fun getMaxEx(x: Int, y: Int) =
        if (x >= y) {
            x
        } else {
            y
        }

/*
fun getMaxEx(x: Int, y: Int) : Int =
        if(x >= y){
            x
            "Scary"
        } else {
            y
            "Yes it is"
        }
*/

// Function with default arguments
fun hello_(message: String = "Kotlin"): Unit {
    println("Hello $message")
}

fun currencyExchange(dollar: Double, currencyRate: Double, charges: Double = 5.0): Double {

    var total = dollar * currencyRate

    var fees = total * charges / 100

    total = total - fees

    return total
}

// collection as a parameter
fun displayCollection(list: List<String>): Unit {

    for (item in list) {
        println(item)
    }
}

fun addItems(list: List<Int>): Unit {

    var total = 0
    for (item in list) {
        total += item
    }
    println("Total $total")
}

// vararg parameter
fun varargString(vararg list: String) {

    for (item in list) {
        println(item)
    }
}

fun addVararg(vararg list: Int) {

    var total = 0
    for (item in list) {
        total += item
    }

    println("Total $total")
}

// vararg with other parameters
fun trickyVararg01(a: Int, b: Int, vararg list: Int) {

    var total = 0

    for (item in list) {
        total += item
    }

    println("Total $total")
    println("a = $a , b = $b")
}

// vararg declaration
fun trickyVararg02(vararg list: Int, a: Int, b: Int) {

    var total = 0

    for (item in list) {
        total += item
    }

    println("Total $total")
    println("a = $a , b = $b")
}

/*
fun main (args: Array<String>) {

    trickyVararg02(1,2,3,a=4, b=5)
}
*/



// vararg list of different data types
fun mixedVariables01(vararg list: Any) {

    for (item in list) {
        if (item is String) println("$item is String")
        else if (item is Int) println("$item is Integer")
        else if (item is Float) println("$item is Float")
        else if (item is Double) println("$item is Double")
        else println("$item is Alian")
    }
}


fun mixedVariables02(vararg list: Any) {

    for (item in list) {

        when (item)
        {
            1 -> println("$item is One")
            in 2..7 -> println("$item is Between 2 and 7")

            is Double ->println("$item is Double type")
            is String ->println("$item is String type")

            is Float ->println("$item is Float type")
            else -> println("$item is Alian")
        }

    }
}



/*
fun main(args: Array<String>) {
    mixedVariables01(1.1, 2, "Three", 8.0F,1, "Five", 6)
    mixedVariables02(1.1, 2, "Three", 8.0F,1, "Five", 6)
}
*/



// Pairs
fun timeConversion(seconds: Int): Pair<Int,Int> {

    val hour = seconds/3600
    val minutes = (seconds % 3600) / 60

    return Pair(hour,minutes)
}

/*
fun main(args: Array<String>) {

    val myPair : Pair<Int,Int> = timeConversion(5000)
    println("${myPair.first} Hour(s) ${myPair.second} Minute(s)")

    val (hh,min) = timeConversion(5000)
    println("$hh Hour(s) $min Minute(s)")
}
*/


// Triple
fun timeConversionTriple(seconds: Int): Triple<Int,Int,Int> {

    val hour = seconds/3600
    val minutes = (seconds % 3600) / 60
    val sec =  seconds % 60

    return Triple(hour,minutes, sec)
}

fun display(myTriple: Triple<Int,Int,Int>) {

    println("${myTriple.first} Hour(s) ${myTriple.second} Minute(s) ${myTriple.third} Second(s)")
}


fun main(args: Array<String>) {

    val myTriple = timeConversionTriple(5000)
    display(myTriple)
}






