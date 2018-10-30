package Chapter08.CallJavaFromKotlin

import java.util.*



/*
    Static method
*/

fun callAddMethod() {

    CallJava.add(4,5)
}



fun callStaticVariable(){

    var message = CallJava.message

    println("Java Message : ${message}")
}


fun callAreaOfCircleMethod(){

    var areaOfCircle = CallJava.getAreaOfCircle(3.0)

    println("Area of circle ${areaOfCircle}")
}



/*
    Reserve Keyword
*/

fun callReserveMethod(){

    CallJava.`is`()
    CallJava.`var`()

    var `var` = "Reserved keyword var"
    var `object` = "Reserved keyword object"

}


fun `in`(){

    println("I am in function")
}

fun `as`(){
    println("I am as function")
}

fun `object`(){
    println("I am object function")
}

fun inputFromKeyboard() {

    println("Enter Your name .... ")

    val scanner = Scanner(System.`in`)

    println("My name is ${scanner.nextLine()}")
}





/*
    Call java class in Kotlin
*/

fun callJavaClassInstance(){

    val shape = Shape(5,5,"Square")

    shape.shapeMessage()

    shape.height = 10

    println("${shape.shape} height = ${shape.height}")
}


/*
    Generic List
*/

fun callGetIntListMethod() {

    //var list: ArrayList<Int> = CallJava.getIntList()

    var list = CallJava.getIntList()
    list.add(4)

    for (element in list) {
        println("Element $element")
    }
}



fun callStaticVariableOfShapeClass(){

    println("Value of PI from Shape ${Shape.PI}")
}



fun main(args: Array<String>) {

    inputFromKeyboard()
    //callAreaOfCircleMethod()

    // callJavaClassInstance()
    // callStaticVariable()

    /*
    println("Take input from Kotlin")
    inputFromKeyboard()

    `in`()
    `as`()
    `object`()
    */

    //callGetIntegerList()

    // callIsMethod()

    //callAddMethod()

}





// in is a reserved word in Kotlin, while using Java linberary which has in or is keyword.
// use backtick as escape character


