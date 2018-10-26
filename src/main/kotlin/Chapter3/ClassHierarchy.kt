package Chapter3

open class A {
    init {
        println("Class A is initialized")
    }
}

open class B : A() {
    init {
        println("Class B is initialized")
    }
}

class C : B() {
    init {
        println("Class C is initialized")
    }
}

fun main(args: Array<String>) {
    val c = C()
}