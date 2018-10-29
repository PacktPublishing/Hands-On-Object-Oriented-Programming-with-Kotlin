package Chapter3Inheritance02

open class Person (val fName: String, var lName: String, var pAge: Int, val ID : String) {

    fun speak() {
        println("My name is $fName $lName, my id is $ID and age is $pAge")
    }

    fun greet() {
        println("Hi How are you...")
    }
}

class Student: Person {

    constructor(fName: String,lName: String, age: Int, ID: String) : super(fName,lName,age, ID)

    fun aboutEducation(){
        println("I am a student of Computer Science.")
    }

    fun attendLectures() {
        println("I am studding Introduction to Kotlin lecture.")
    }
}

fun main(args: Array<String>) {

    val bob = Student("Bob", "Peter", 25, "A-123")
    bob.speak()
    bob.greet()
    bob.attendLectures()
    bob.aboutEducation()
}
