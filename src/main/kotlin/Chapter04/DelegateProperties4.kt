package Chapter4BuiltinDelegateVetoable
import kotlin.properties.Delegates

/*
class Person {

    var name: String = "Default"
        get() = field

        set(value) {
            if(value.isNotEmpty())
                field = value
        }

    var age : Int = 1
        get() = field
        set(update) {
            if(update > 0)
                field = update
        }
}
*/

class Person {

    var name : String by Delegates.vetoable("Default",{property, oldValue, newValue -> newValue.isNotEmpty()})

    var age : Int by Delegates.vetoable(1 ,{property, oldValue, newValue -> newValue > 0})

}

fun main(args: Array<String>) {
    val p = Person()
    p.name = "Bob"
    println(p.name)
    p.name = ""
    println(p.name)

    p.age = 10
    println(p.age)
    p.age = -6
    println(p.age)
}