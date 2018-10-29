package Chapter3Inheritance01

open class Person (val fName: String, var lName: String, var pAge: Int, val ID : String) {

    fun speak() {
        println("My name is $fName $lName, my id is $ID and age is $pAge")
    }

    fun greet() {
        println("Hi How are you...")
    }
}

class Student(fName: String, lName: String, pAge: Int, ID: String ): Person(fName,lName,pAge, ID) {

    fun aboutEducation(){
        println("I am a student of Computer Science.")
    }

    fun attendLectures() {
        println("I am studying Introduction to Kotlin lecture.")
    }
}

class Employee(fName: String, lName: String, pAge: Int, ID: String ): Person(fName,lName,pAge, ID) {

    fun aboutDesignation(){
        println("I am a manager in Finance department.")
    }

    fun attendMeetings() {
        println("I have very tight schedule...")
    }
}


fun main(args: Array<String>) {

    val bob = Student("Bob", "Peter", 25, "A-123")
    bob.speak()
    bob.greet()
    bob.attendLectures()
    bob.aboutEducation()

    val peter = Employee("Peter", "Jon", 46, "F-321")
    peter.speak()
    peter.greet()
    peter.aboutDesignation()
    peter.attendMeetings()

}
