package chapter1


fun main (args: Array<String>)
{

    // Create a byte value
    var byteValue : Byte = 10
    var anotherByteValue : Byte = byteValue

    println ("byteValue is $byteValue and anotherByteValue is $anotherByteValue")


    var intValue : Int

    // Not allowed
    // intValue = byteValue
    // Not allowed as well
    // intValue = (Int) byteValue
    // Byte to Int
    intValue = byteValue.toInt()
    println("int from byte is $intValue")



    // Double to Int
    var doubleValue : Double = 12.345
    intValue = doubleValue.toInt()
    println("int from double is $intValue")

    byteValue = intValue.toByte()
    println("byte from int is $byteValue")



    // String to Int
    // it is also possible to cast from string to number values.
    // Will throw NumberFormateException if target string does not contain number.

    var stringValue : String = "125"
    intValue = stringValue.toInt()
    println("intValue from stringValue is $intValue")

    // What if the String does not contain valid number. Use Safe Call
    stringValue = "12A"
    var i :Int? = stringValue.toIntOrNull()

    if(i is Int)
    {
        println("int from string is $i")
    }
    else
    {
        println("not a valid String")
    }


    if(i !is Int)
    {
        println("not a valid String")
    }
    else
    {
        println("intValue from stringValue is $i")
    }


    // Smart cast with Parent class Any
    var any : Any? = null
    any = 1234 // integer
    any = "Hello" // String
    any = 123.456 // Double

    mySmartCast(8)
    mySmartCast("Kotlin")
    mySmartCast(null)

    myUnsafeCast("Hello unsafe")
    myUnsafeCast(null)
    myUnsafeCast(2)

}


fun myUnsafeCast(any : Any?)
{
    // This is fine but will throw ClassCastException if value is not string, Add make the string nullable String?
    //val s : String = any as String

    val s : String? = any as? String

    println(s)
}


fun mySmartCast(any :Any?)
{
    if(any is Int)
    {
        var i = any + 5
        println("Value is Int $i")
    }
    else if(any is String)
    {
        var s = "Hello " + any
        println("Value is String $s")
    }
    else if (any == null) {

        println("Object is null")
    }
}