package chapter7.patterns.creational

fun main(args: Array<String>) {
    val mercedes = CarFactory().createCar(Brand.MERCEDES)
}

enum class Brand {
    BMW,
    MERCEDES,
    HONDA,
    MAZDA
}

interface Car
open class Mercedes: Car
class BMW: Car
open class Honda: Car
class Mazda: Car

class CarFactory {
    fun createCar(brand: Brand): Car {
        return when(brand) {
            Brand.BMW -> BMW()
            Brand.MERCEDES -> Mercedes()
            Brand.HONDA -> Honda()
            Brand.MAZDA -> Mazda()
        }
    }
}