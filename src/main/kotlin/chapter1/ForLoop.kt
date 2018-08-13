package chapter1

/*
* Each code block /* Code */ in this file is a complete one example.
* Unblock one at a time and execute.
*/



/* // For loop
fun main(args: Array<String>) {

    println("\nRange")
    var range = 1..3
    for (i in range) {
        println("value of $i")
    }

    println("\nList")
    val list = listOf(1,2,3,4)
    for (l in list){
        println("value of $l")
    }

    println("\nString")
    val message = "kotlin is awesome"
    for (m in message){
        println(m)
    }
}
*/




/* // Nested for loop
fun main(args: Array<String>) {

    for (i in 1..3) {
        for (j in 1..3) {
            println("$i , $j")
        }
    }
}
*/




/*  // Break statement
fun main(args: Array<String>) {

    for (i in 1..10) {

        println("For $i")
        if(i >= 5) {
            break;
        }
    }

    var i = 1
    while (i <= 10) {

        println("While $i")
        if(i >= 5) {
            break;
        }
        i++
    }

    for (i in 1..3) {
        for (j in 1..3) {
            println("$i , $j")
            if(i==j) {
                break;
            }
        }
    }
}
*/





/* //Labled for loop with break statement
fun main(args: Array<String>) {

    println("For Loop")
    for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                break
            }
            println("$i , $j")
        }
    }


    println("Labled For Loop")
    outLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                break@outLoop
            }
            println("$i , $j")
        }
    }
}
*/




// Continue statement
fun main(args: Array<String>) {
    for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                continue
            }
            println("$i , $j")
        }
    }


    println("Labled For Loop")
    outLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                continue@outLoop
            }
            println("$i , $j")
        }
    }
}
