package chapter6.patterns.structural

interface Barkable {
    fun bark() {
        println("bark")
    }
}

interface Meowable {
    fun meow() {
        println("meow")
    }
}

class Cat(private val meowable: Meowable) {
    fun voice() {
        meowable.meow()
    }
}

class Dog(private val barkable: Barkable) {
    fun voice() {
        barkable.bark()
    }
}

class Adapter: Barkable, Meowable {
    override fun meow() {
        bark()
    }
}

fun main(args: Array<String>) {
    Cat(Adapter()).voice()
}