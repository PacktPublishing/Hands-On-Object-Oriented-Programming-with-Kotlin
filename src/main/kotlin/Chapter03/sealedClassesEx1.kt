package Chapter3

abstract class Shape(val name: String) {
    init {
        println("Drawing $name")
    }
    abstract fun draw()
    abstract fun getArea():Double
}

class Circle (rad : Double, name: String) : Shape(name) {

    val PI = 3.1415
    var radius = rad

    init { require(radius > 0) {"Radius value is negative"} }

    override fun getArea() = PI * radius * radius

    override fun draw() {
        println("Area of the circle is ${getArea()}.")
    }
}

class Rectangle(_width : Double, _height : Double, name: String) : Shape( name) {

    var width = _width
    var height = _height

    init {
        require(width > 0)  {"Width is negative"}
        require(height > 0) {"Height is negative"}
    }

    override fun getArea() = width * height
    private fun getPerimeter() = (width * 2) + (height * 2)
    override fun draw() {
        println("Area of $name is ${getArea()} and perimeter is ${getPerimeter()}")
    }
}

fun main(args: Array<String>) {
    var rect = Rectangle(2.0,2.0, "Rectangle")
    rect.draw()
}