package Chapter3

class Person(pName: String, pAge: Int, pHeight : Double ) {

    private var name : String = pName
    private var age : Int = pAge
    private var height : Double = pHeight

    init {
        require(name.trim().isNotEmpty()) {"Name should not empty"}
        require(age > 0 ) {"Age is not correct"}
        require(height > 0) {"Height is not correct"}
    }

    fun getAge() : Int{
        return age;
    }

    fun setAge(age : Int) {
        require(age > 0 ) {"Age is not correct"}
        this.age = age
    }

    fun display(){
        println("Name ${name}, Age ${age} Height ${height}")
    }
}

fun main(args: Array<String>) {

    val person = Person("bob",40,6.1)
    person.display()

    person.setAge(42)
    person.display()
}