package chapter1

fun main(args: Array<String>) {

// While loop
    println("While loop")
    var i = 1
    while (i <= 3) {
        println("While $i")
        i++
    }

// Nested while loop
    println("Nested while loop")
    i = 1
    while (i <= 3) {
        var j = 1
        while (j <= 3) {
            println("i $i , j $j")
            j++
        }
        i++
    }


// do while loop
    println("Do While loop")
    var j = 1
    do {
        println("Do while $j")
        j++
    } while (j <= 3)


    // Comparison between while and do while
    println("Comparison between while and do while")

    i = 4
    while (i <= 3) {
        println("While $i")
        i++
    }

    j = 4
    do {
        println("Do While $j")
    } while (j<=3)
}