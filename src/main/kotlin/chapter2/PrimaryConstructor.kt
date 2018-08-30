package chapter2

/*
// Default constructor
class Person {
    var name: String = "Abid"
    var age : Int = 40
    var height : Double = 6.0
}

fun main(args: Array<String>) {

    val person01 = Person()
    println("Name ${person01.name}, Age ${person01.age} Height ${person01.height}")

    val person02 = Person()
    println("Name ${person02.name}, Age ${person02.age} Height ${person02.height}")

    person02.name = "Khan"
    person02.age = 31

    println("Name ${person02.name}, Age ${person02.age} Height ${person02.height}")
}
*/


/*
// Primary constructor
class Person (val name: String, var age: Int, var height : Double)

// Primary constructor with constructor keyword
// class Person constructor(val name: String, var age: Int, var height : Double)

fun main(args: Array<String>) {

    val person1= Person("Abid", 40, 6.0)
    println("Name ${person1.name}, Age ${person1.age} Height ${person1.height}")

    val person2 = Person("Igor", 35, 6.0)
    println("Name ${person2.name}, Age ${person2.age} Height ${person2.height}")
}
*/

/*
// Primary constructor with constructor parameters.
class Person (pName: String, pAge: Int, pHeight: Double) {

    val name: String = pName
    var age: Int = pAge
    var height : Double = pHeight
}

fun main(args: Array<String>) {

    val person = Person("Abid",40,6.0)
    println("Name ${person.name}, Age ${person.age} Height ${person.height}")
}
*/


// Primary constructor with init block.
class Person(pName: String, pAge: Int, pHeight : Double ) {

    var name : String
    var age : Int
    var height : Double

    init {
        name = pName
        age  = pAge
        height = pHeight

        require(name.trim().isNotEmpty()) {"Name should not empty"}
        require(age > 0 ) {"Age is not correct"}
        require(height > 0) {"Height is not correct"}

    }
}

fun main(args: Array<String>) {

    val person = Person("Abid",0,6.0)
    println("Name ${person.name}, Age ${person.age} Height ${person.height}")
}


// this keyword
/*
class Person(name: String, age: Int, height : Double ) {
    var name : String
    var age : Int
    var height : Double

    init {
        this.name = name
        this.age  = age
        this.height = height
    }
}

fun main(args: Array<String>) {
    val person = Person("Abid",40,6.0)
    println("Name ${person.name}, Age ${person.age} Height ${person.height}")
}
*/
