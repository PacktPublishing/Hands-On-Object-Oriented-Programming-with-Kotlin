package ClassAndFunction

class Person (val name: String, var age : Int , var height : Double){

    fun speak(){
        println("My name is $name , i am $age years old and I am $height feet tall")
    }

    fun sleep(){
        println("Zzzzzzz....")
    }

    fun eat(){
        println("I am eating a delicious vegetarian disk")
    }

    fun info() : String {
        return "My name is $name , i am $age years old and I am $height feet tall"
    }

    fun greet(message : String){
        println("Hi I am $name.... $message")
    }
}

fun main(args: Array<String>) {

    val abid = Person("Abid", 40, 6.0)
    abid.greet("Nice to meet you!!!")

    val text = abid.info()
    println(text)

}

