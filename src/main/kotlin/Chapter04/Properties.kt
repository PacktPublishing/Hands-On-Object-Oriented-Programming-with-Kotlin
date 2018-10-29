package Chapter4

class Person {

    var name: String = ""
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


fun main(args: Array<String>) {
    val abid = Person()
    abid.name = "Abid Khan"
    abid.age = 40

    println(abid.name)
    println(abid.age)

    abid.name = ""
    abid.age = 0

    println(abid.name)
    println(abid.age)
}
