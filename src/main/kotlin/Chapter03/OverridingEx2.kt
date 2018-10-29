package Chapter3Overriding

open class Programming (open val name: String){

    open fun info(){
        println("Programming language $name")
    }

}

class AdvancedProgramming(override var name : String) : Programming(name){

    override fun info(){
        println("Advanced Programming language $name")
    }
}

fun main(args: Array<String>) {

    var programming = Programming("Java")
    // name is read only
    // programming.name = "Kotlin"
    programming.info()


    var advancedProgramming = AdvancedProgramming("Kotlin")
    advancedProgramming.info()

    // name is read-write
    advancedProgramming.name = "Kotlin 2.0"
    advancedProgramming.info()

}