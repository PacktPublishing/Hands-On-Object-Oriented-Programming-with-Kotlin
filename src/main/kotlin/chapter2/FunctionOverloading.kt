package FunctionOverLoading

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

    fun greet(){
        println("Hi I am $name.... Nice to meet you!!!")
    }

}

fun main_(args: Array<String>) {

    val abid = Person("Abid", 40, 6.0)

    abid.greet()
    abid.greet("How are your doing, its really pleasure to have you here.")
}


class Calculator{

    fun add(v1 : Int, v2 : Int) = v1 + v2

    fun add(v1 : Double, v2 : Double) = v1 + v2

    fun add(v1 : Float, v2 : Float) = v1 + v2

    fun max(v1 : Int, v2 : Int) = if (v1 >= v2) {
        v1
    } else {
        v2
    }

    fun max(v1 : Double, v2 : Double) = if (v1 >= v2) {
        v1
    } else {
        v2
    }


}

fun main(args: Array<String>) {

    val calc = Calculator()

    println(calc.add(2,2))

    println(calc.add(3.0,3.0))

    println(calc.add(4.0f,4.0f))

    println("MAX "+ calc.max(3,4))

}