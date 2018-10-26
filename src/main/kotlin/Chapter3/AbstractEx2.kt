package Chapter3Abstract2

abstract class Person (val fName: String, var lName: String, var pAge: Int) {

    fun speak() {
        println("My name is $fName $lName age is $pAge")
    }

    fun greet() {
        println("Hi there...$fName ")
    }
}

class Student(fName: String, lName: String, pAge: Int , val studentId : String) : Person(fName,lName,pAge) {

    fun aboutEducation(){
        println("I am a student of Computer Science")
    }

    fun attendLectures() {
        println("I am attending Introduction to Kotlin lectures.")
    }
}

fun main(args: Array<String>) {

    val bob = Student("Bob","Peter",25, "ST-100")

    bob.greet()
    bob.speak()
    bob.aboutEducation()
    bob.attendLectures()
}
