package chapter1
/*
* Each code block /* Code */ in this file is a complete one example.
* Unblock one at a time and execute.
*/




/*
fun main(args: Array<String>) {

    // String variable
    var student = "Bob" // String

    // Integer variable
    var age = 25        // Integer

    // Double variable
    var height = 5.6    // Double

    println("Name is $student age is $age and height is $height")

}
*/



/*
fun main(args: Array<String>) {

    // String variable
    val name = "Herry"

    // Double variable
    val PI = 3.1415

    val programmingLanguage = "Kotlin"

    // Error: val cannot be reassigned
    // androidLanguage = "Java"

    println("Name is $name and my Favourite programming language is $programmingLanguage")

}
*/



/*
fun main(args: Array<String>) {

    // Variables can be initialized explicitly
    var myName: String

    // Initialization
    myName = "Jon"

    // declaration and initialization in one line
    var myInt: Int = 10
    var myLong: Long = 11
    var myShort: Short = 11
    var myByte: Byte = -128

    // Declaration of Double and Float
    var h1 = 5.10
    var h2: Double = 5.10

    var f1 = 5.10
    var f2: Float = 5.10f
}
*/




/* // Number data type
fun main(args: Array<String>) {

    println("max integer " + Integer.MAX_VALUE)
    println("min integer " + Integer.MIN_VALUE)

    println("max byte " + Byte.MAX_VALUE)
    println("min byte " + Byte.MIN_VALUE)

    println("max short " + Short.MAX_VALUE)
    println("min short " + Short.MIN_VALUE)

    println("max long " + Long.MAX_VALUE)
    println("min long " + Long.MIN_VALUE)

}
*/




/* // Real data type
fun main(args: Array<String>) {

    // Scientific calculation
    var d1 : Double = 7.20e15
    var d2 = 7.20e-15

    println("Value of d1 = " + d1 + " and Value of d2 = " + d2)

    println("max Float " + Float.MAX_VALUE)
    println("min Float " + Float.MIN_VALUE)

    println("max Double " + Double.MAX_VALUE)
    println("min Double " + Double.MIN_VALUE)
}
*/



/* // Bool data type
fun main(args: Array<String>) {

    // Boolean variable
    var result : Boolean

    var num1 = 20
    var num2 = 10

    result = num1 >= num2
    println("$num1 is greater than $num2 = $result")

    result = num1 < num2
    println("$num1 is greater than $num2 = $result")
}
*/



/*
// Char data type
fun main(args: Array<String>) {

    // Character Variable
    var charA : Char = 'A'
    var charZ : Char = 'Z'
    var char1 = '1'
    var char0 = '0'

    println("$charA $charZ $char1 $char0")

    var char5 = '#'
    var char6 = '/'
    var char7 = '%'

    println("$char5 $char6 $char7")

    // Unicode Character
    var ucharA : Char = '\u0041'
    var ucharZ : Char = '\u005A'
    var uchar1 = '\u0031'
    var uchar0 = '\u0030'

    println("$ucharA $ucharZ $uchar1 $uchar0")

}
*/



// Display UniCode characters
fun displayUniCode() {

    var ch : Char = '\u0030'

    var i = 0;
    while (i < 81){
        println("$i ${ch++}")
        i++
    }
}


fun main(args: Array<String>) {

    displayUniCode()

}

