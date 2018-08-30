package DefaultParam

// Constructor with default parameter
class Person(val name: String, var age: Int = 0, var height : Double = 0.0, var weight : Double = 0.0)

fun main(args: Array<String>) {


    val jon = Person("Jon")
    println("name ${jon.name}, age ${jon.age}, height ${jon.height}")

    val abid = Person("Abid", 40)
    println("name ${abid.name}, age ${abid.age}, height ${abid.height}")

    val igor = Person("Igor", 35, 6.0)
    println("name ${igor.name}, age ${igor.age}, height ${igor.height}")

    /*
    // named parameters
    val ali = Person(name = "Ali", age = 34, height = 6.1, weight = 78.5)
    println("name ${ali.name}, age ${ali.age}, height ${ali.height}, weight ${ali.weight}")

    // named parameters without any order
    val bob = Person(weight = 73.5, age = 37, name = "Bob", height = 5.8)
    println("name ${bob.name}, age ${bob.age}, height ${bob.height}, weight ${bob.weight}")
    */
}

