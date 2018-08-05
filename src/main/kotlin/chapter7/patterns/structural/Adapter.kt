package chapter7.patterns.structural

interface Barkable {
    fun bark()
}

interface Meowable {
    fun meow()
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
    override fun bark() {
        println("Bark")
    }

    override fun meow() {
        println("meow")
        bark()
    }
}

fun main(args: Array<String>) {
    Cat(Adapter()).voice()
}