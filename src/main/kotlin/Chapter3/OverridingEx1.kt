package Chapter3Overriding

open class Person(pName: String, pAge: Int) {
    var name    = pName
    var age     = pAge
    // must write open
    open fun displayInfo(){
        println("My name is $name, I am $age years old. ")
    }
}

open class Student(name: String, age: Int, id : Int, education : String, institution : String) : Person(name , age ) {

    var studentID = id
    val institutionName = institution
    val education = education

    // must write override
    override final fun displayInfo() {
        super.displayInfo()
        println("I am a student of $education in $institutionName and my ID is $studentID")
    }
}

class Alien (name: String, age: Int, id : Int, education : String, institution : String): Student(name, age, id, education, institution){
   /*
    override fun displayInfo() {
        super.displayInfo()
        println("I know everything")
    }
    */
}


fun main(args: Array<String>) {

    val p = Person(pName = "Jon",pAge = 35)
    p.displayInfo()

    val bob = Student(name = "Bob Peter", age = 25, id = 100, education =  "Computer programming", institution = "Stockholm University")
    bob.displayInfo()

    val alien = Alien(name = "Alien eli", age = 225, id = 10101, education = "Computer Virus", institution = "Pluto")
    alien.displayInfo()

}