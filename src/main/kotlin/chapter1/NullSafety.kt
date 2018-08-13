package chapter1

/*
* Each code block /* Code */ in this file is a complete one example.
* Unblock one at a time and execute.
*/



/*
fun main(args: Array<String>) {

    var notNull : String = "Hello"
    //notNull = null

    var len  = notNull.length
    println("Value is $notNull and length is ${notNull.length} ")

    var mayBeNull : String?
    mayBeNull = null // allowed
}
*/



/* // Safe call
fun main(args: Array<String>) {

    var mayBeNull : String?
    mayBeNull = null // allowed

    var mayBeLen = 0
    if(mayBeNull != null && mayBeNull.length > 0)
    {
        mayBeLen = mayBeNull.length
    }

    // Safe Call
    var length = mayBeNull?.length
    println("value of length is " + length)
}
*/



/*
 // Elvis operator
fun main(args: Array<String>) {

    var mayBeNull : String? = null

    var length = mayBeNull?.length ?: 0
    println("value of length is " + length)

    mayBeNull = "Hello"

    length = mayBeNull?.length ?: 0
    println("value of length is " + length)

}
*/




// Sure operator
fun main(args: Array<String>) {

    var sureNotNull : String? = null

    /*
    var length = sureNotNull!!.length // application will be crashed
    println("value of length is " + length)
    */
    var ch1 : Char? = "abc".lastOrNull()
    //var ch1 : Char = "abc".lastOrNull()

    var ch2 : Char = "xyz".lastOrNull()!!
    println("ch1 = $ch1 and ch2 = $ch2")
}


