package Chapter4BuiltinDelegate
import kotlin.properties.Delegates

class Person {
    var age : Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("oldValue $oldValue newValue $newValue")
    }

    var name : String by Delegates.observable("Default"){property, oldValue, newValue -> shock(oldValue,newValue) }

    fun shock(old: String, new: String){
        println("Old name $old and New name $new")
    }
}

fun main(args: Array<String>) {
    val person = Person()
    person.age = 40
    person.name = "Abid"
    person.name = "Khan"
}

