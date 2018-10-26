package Chapter4GenericDelegate
import kotlin.reflect.KProperty

class Person{
    var address: Any by DelegateGenericClass()
}

class Student{
    var age : Any by DelegateGenericClass()
}

class DelegateGenericClass {

    private var value: Any = "Not initialized"

    operator fun getValue(instance: Any, property: KProperty<*>): Any {

        println("Class name     :  ${instance}")
        println("property name  :  ${property.name}")
        return value
    }

    operator fun setValue(instance: Any, property: KProperty<*>, type: Any) {
        value = type
    }
}


fun main(args: Array<String>) {
    val person = Person()
    person.address = "Stockholm City"
    println("Address "+person.address)


    val student = Student()
    student.age = 40
    println("Age " +student.age)
}
