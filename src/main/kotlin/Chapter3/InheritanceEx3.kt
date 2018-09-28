package Chapter3Multilevel

open class Person (val name : String){
    fun speak(){
        println("My name is $name")
    }

    open fun sleep(){
        println("I like to sleep 7 hours a day")
    }
}

open class Employee(name: String, val company : String) : Person(name) {
    fun work(){
        println("I work for $company")
    }
}

class Programmer(name: String, company: String) : Employee(name, company){
    fun code(){
        println("Coding is my passion")
    }

    override fun sleep(){
        println("I like to sleep when i get a chance.")
    }
}

fun main(args: Array<String>) {

    val coder = Programmer("Abid", "Kotlin Conf")
    coder.speak()
    coder.work()
    coder.code()
    coder.sleep()
}