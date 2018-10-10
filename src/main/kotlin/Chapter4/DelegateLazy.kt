package Chapter4BuiltinDelegateLazy

import kotlin.properties.Delegates

class Person {
    var name : String by Delegates.vetoable("Default",{property, oldValue, newValue -> newValue.isNotEmpty()})
    var age : Int by Delegates.vetoable(1 ,{property, oldValue, newValue -> newValue > 0})

    val books by lazy {
        DataBase.getBooks()
    }
}

class DataBase{
    companion object {
        fun getBooks() : ArrayList<String>{
            println("getBooks function is called")
            return arrayListOf("Clean Coder","Intro to Kotlin","Android with Kotlin")
        }
    }
}

fun main(args: Array<String>) {
    val person = Person()
    person.name
    person.age
    person.books


}

class Person02 : Lazy<ArrayList<String>> {

    var name : String by Delegates.vetoable("Default",{property, oldValue, newValue -> newValue.isNotEmpty()})
    var age : Int by Delegates.vetoable(1 ,{property, oldValue, newValue -> newValue > 0})

    override val value: ArrayList<String>
        get() = DataBase.getBooks()

    override fun isInitialized(): Boolean {return value.isNotEmpty()}
}



