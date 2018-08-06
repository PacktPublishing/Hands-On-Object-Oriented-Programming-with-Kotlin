package chapter7.patterns.structural

class Milk(milliliters: Int)
class Coffee(milliliters: Int)

class Latte(milk: Milk, coffee: Coffee)
class Cappuccino(milk: Milk, coffee: Coffee)

interface CoffeeMachine {
    val leftCoffeeMilliliters: Int
    val leftMilkMilliliters: Int

    fun makeCoffee(milliliters: Int): Coffee {
        leftCoffeeMilliliters - milliliters
        return Coffee(milliliters)
    }
    fun makeMilk(milliliters: Int): Milk {
        leftMilkMilliliters - milliliters
        return Milk(milliliters)
    }
}

class AmateurCoffeeMachine(
        override val leftCoffeeMilliliters: Int,
        override val leftMilkMilliliters: Int
) : CoffeeMachine

class ProfessionalCoffeeMachine(coffeeMachine: CoffeeMachine): CoffeeMachine by coffeeMachine {
    fun makeLatte() = Latte(makeMilk(150), makeCoffee(50))
    fun makeCappuccino() = Cappuccino(makeMilk(100), makeCoffee(70))
}

fun main(args: Array<String>) {
    val coffeeMachine = AmateurCoffeeMachine(1000, 1000)
    //.........
    val professionalCoffeeMachine = ProfessionalCoffeeMachine(coffeeMachine)
}

