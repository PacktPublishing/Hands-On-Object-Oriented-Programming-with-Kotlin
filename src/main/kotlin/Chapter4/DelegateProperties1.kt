package Chapter4Delegate

import kotlin.reflect.KProperty

class Person() {
    val name : String by DelegatePersonName()
    var age : Int by DelegatePersonAge()
}

class DelegatePersonAge {

    var age : Int = 0
    operator fun getValue(person: Person, property: KProperty<*>): Int {
        return age
    }

    operator fun setValue(person: Person, property: KProperty<*>, i: Int) {
        println("Class name: ${person}")
        println("Property: ${property.name}")
        age = i
    }
}

class DelegatePersonName {

    private var value: String = "Default"

    operator fun getValue(person: Person, property: KProperty<*>): String {
        println("Property ${property.name}")
        println(person.toString())
        return value
    }
}


fun main(args: Array<String>) {
    val person = Person()
    person.name
    println(person.age)
    person.age = 40
    println(person.age)
}
