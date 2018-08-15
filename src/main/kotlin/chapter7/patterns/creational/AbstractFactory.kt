package chapter7.patterns.creational

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

//fun main(args: Array<String>) {
//    val e220 = FactoryProducer().produceFactory(Brand.MERCEDES).createCar(MercedesModel.E220)
//}

interface Model

enum class MercedesModel : Model {
    E220,
    E300
}

enum class HondaModel : Model {
    ACCORD,
    CIVIK
}

interface Factory {
    fun createCar(model: Model): Car
}

class FactoryProducer {
    fun produceFactory(brand: Brand): Factory = when (brand) {
        Brand.MERCEDES -> MercedesFactory()
        Brand.HONDA -> HondaFactory()
        Brand.MAZDA -> TODO()
        Brand.BMW -> TODO()
    }
}

class MercedesFactory : Factory {
    override fun createCar(model: Model): Car = when (model) {
        MercedesModel.E220 -> E220()
        MercedesModel.E300 -> E300()
        else -> TODO()
    }
}

class HondaFactory : Factory {
    override fun createCar(model: Model): Car = when (model) {
        HondaModel.ACCORD -> Accord()
        HondaModel.CIVIK -> Civik()
        else -> TODO()
    }
}

class Accord: Honda()
class Civik: Honda()

class E220: Mercedes()
class E300: Mercedes()

