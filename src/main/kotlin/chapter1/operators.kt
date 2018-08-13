package chapter1

/*
* Each code block /* Code */ in this file is a complete one example.
* Unblock one at a time and execute.
*/



// Arithmetic operators
/*
fun main(args: Array<String>) {

    var i = 10
    var j = 15

    var k = i + j
    println("$i + $j = $k")

    k = i.plus(j)
    println("$i + $j = $k")
}
*/



// Compound operators
/*
fun main(args: Array<String>) {

    var i = 10
    var j = 15

    i = i + j
    println("Value of i = $i")

    i+=j
    println("Value of i = $i")
}
*/



// Compound operators
/*
fun main(args: Array<String>) {

    var i = 1

    i += 1
    println("Value of i = $i")

    i -= 1
    println("Value of i = $i")

    i++
    println("Value of i = $i")

    i--
    println("Value of i = $i")

}
*/



// Increment operator
/*
fun main(args: Array<String>) {

    var j = 0
    var i = 1

    j = i++
    println("Value of i = $i")
    println("Value of j = $j")

    i = 1

    j = ++i
    println("Value of i = $i")
    println("Value of j = $j")

    i.inc()
    j.inc()

    println("Value of i = $i")
    println("Value of j = $j")
}
*/



// referential equation
/*
class Point {
    var pointX : Int = 0
    var pointY : Int = 0
}

fun main(a : Array <String>) {

    val p1 = Point()
    p1.pointX = 10
    p1.pointY = 20

    val p2 = Point()
    p2.pointX = 30
    p2.pointY = 40

    println(p1 === p2) // false
    println(p1 !== p2) // true

    var p3 = p1
    println(p1 === p3) // true
}
*/



// and operator
/*
fun main(a : Array <String>) {

    var i : Boolean = true
    var j : Boolean = false
    var k : Boolean = true

    var result : Boolean

    result = i && j
    println ("$i AND $j = $result")

    result = i and k
    println ("$i AND $k = $result")

    var a = 40
    var b = 20
    var c = 10

    if ((a > b) and (a > c)) {
        println("a is a winner")
    }
}
*/



// or operator
/*
fun main(a : Array <String>) {

    var i : Boolean = true
    var j : Boolean = false
    var k : Boolean = true

    var result : Boolean

    result = i || j
    println ("$i OR $j = $result")

    result = i or k
    println ("$i OR $k = $result")

    var a = 40
    var b = 20
    var c = 10

    if ((a > b) or (a > c)) {
        println("a is a winner")
    }
}
*/



// or operator
/*
fun main(a : Array <String>) {

    var i : Boolean = true
    var j : Boolean = false
    var result : Boolean

    result = i xor j
    println ("$i XOR $j = $result")

    i = true
    j = true

    result = i xor j
    println ("$i XOR $j = $result")


    i = false
    j = false

    result = i xor j
    println ("$i XOR $j = $result")
}
*/



/*
fun main(args: Array<String>) {

    val a = Integer(20)
    val b = Integer(20)

    var result = a === b // Pointing to different memory
    println("Referential equality " + result)

    val c = a
    result = a === c // pointing to the same memory
    println("Referential equality " + result)

    result = a == b // Values are same
    println("Structural equality " + result)
}
*/



// Not operator
/*
fun main(a : Array <String>) {

    var i : Boolean = true
    var result : Boolean

    result = !i
    println ("$i Not is = $result")

    result = i.not()
    println ("$i Not is = $result")
}
*/


fun main(args: Array<String>) {

    var number = 5
    var count = 1

    var result = number.shl(count)
    println("$number : After Left shift $count times = $result")

    count = 3
    result = number shl count
    println("$number : After Left shift $count times = $result")

    number = 5
    count = 1

    result = number.shr(count)
    println("$number : After Right shift $count times = $result")

    count = 2

    result = number shr count
    println("$number : Right shift $count times = $result")

    number = -1
    count = 1

    result = number shr count
    println("$number : After Right shift $count times = $result")

    result = number ushr count
    println("$number : Unsigned right shift $count times = $result")

}

