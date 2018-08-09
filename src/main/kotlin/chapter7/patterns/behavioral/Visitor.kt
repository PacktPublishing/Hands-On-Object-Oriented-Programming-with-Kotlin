package chapter7.patterns.behavioral


class Car : CarElement {

    private val elements = arrayOf(Body(), Engine())

    override fun accept(visitor: CarElementVisitor) {
        elements.forEach { it.accept(visitor) }
    }
}

class Body : CarElement {
    override fun accept(visitor: CarElementVisitor) = visitor.visit(this)
}

class Engine : CarElement {
    override fun accept(visitor: CarElementVisitor) = visitor.visit(this)
}

interface CarElement {
    fun accept(visitor: CarElementVisitor)
}

interface CarElementVisitor {
    fun visit(body: Body)
    fun visit(engine: Engine)
}

class CarElementDriverVisitor: CarElementVisitor {
    override fun visit(body: Body) {
        println("Prepare body...")
    }

    override fun visit(engine: Engine) {
        println("Prepare engine...")
    }
}

fun main(args: Array<String>) {
    val car = Car()
    car.accept(CarElementDriverVisitor())
}



