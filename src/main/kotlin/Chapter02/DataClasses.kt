package DataClasses

// toString()
/*
data class Person(var name : String, var age: Int, var height: Double)

fun main(args: Array<String>) {

    val person = Person("Abid", 40, 6.0)

    println("Name ${person.name}, Age ${person.age} Height ${person.height}")
//    println(person)
    println(person.toString())
}
*/


// equals operator
/*
data class Person(var name : String, var age: Int, var height: Double)

fun main(args: Array<String>) {

    val abid = Person("Abid", 40, 6.0)
    val khan = Person("Abid", 40, 6.0)

    if(abid == khan) {
        println("Both Persons are same")
    } else {
        println("Different persons")
    }

    if(abid.equals(khan)) {
        println("Both Persons are same")
    } else {
        println("Different persons")
    }
}
*/



// Copy function - 1
/*
class Person(var name : String, var age: Int, var height: Double)
fun main(args: Array<String>) {

    val abid = Person("Abid", 40, 6.0)
    val khan = abid

    println(abid.name) //Print Abid name
    khan.name = "Khan" // Update Khan name
    println(abid.name) // Print Abid name

    println("Objects are pointing to the same memory locations = ${abid === khan}")

    if(abid == khan) {
        println("Both Persons are same")
    }
}
*/



// Copy function - 2

data class Person(var name : String, var age: Int, var height: Double)

fun main(args: Array<String>) {

    // Create new instance by using copy function
    val abid = Person("Abid", 40, 6.0)
    val khan = abid.copy()

    println(abid) //Print Abid
    khan.name = "Khan" // Update Khan name
    println(abid) // Print Abid
    println("-----------------------------")

    println("Are abid and khan objects pointing to the same memory locations = ${abid === khan}")

    println("-----------------------------")

    // Add new values into copied object.
    val bob = abid.copy("Bob")
    println(bob)

    val jon = abid.copy(name = "Jon", height = 5.9)
    println(jon)

}


// Decompose
/*
data class Person(var name : String, var age: Int, var height: Double)
fun main(args: Array<String>) {

    val abid = Person("Abid", 40, 6.0)
    val (name, age, height) = abid
    println("name=${abid.component1()} " +
            "age=${abid.component2()} " +
            "height=${abid.component3()}")
}
*/

// Hash code

/*
//class Person(var name : String, var age: Int, var height: Double)
data class Person(var name : String, var age: Int, var height: Double)
fun main(args: Array<String>) {

    val p1 = Person("Abid", 40, 6.0)
    val p2 = Person("Abid", 40, 6.0)
    val p3 = Person("Khan", 40, 6.0)

    val set = hashSetOf(p1,p2,p3)
    println("Set contains ${set.size} elements")

    val result = set.contains(Person("Abid",40,6.0))
    println("Search result = $result")
}
*/
