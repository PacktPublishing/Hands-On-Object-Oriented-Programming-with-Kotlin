package Chapter3Multilevel

open class Shape(val sName: String) {
    init {
        println("$sName is drawn ")
    }
    open fun draw() {}
    open fun getArea() = 0.0
}

class Rectangle(_width : Double, _height : Double, _sName: String) : Shape(_sName) {

    var width = _width
    var height = _height

    override fun getArea() = width * height

    private fun getPerimeter() = (width * 2) + (height * 2)

    override fun draw() {
        println("Area of $sName is ${getArea()} and perimeter is ${getPerimeter()}")
    }
}

class Triangle(_base : Double, _height: Double, _sName: String) : Shape(_sName) {
    var base    = _base
    var height  = _height

    override fun getArea() = (base * height)/2
    override fun draw() {
        println("Area of the triangle is ${getArea()}.")
    }
}


open class Circle (_radius : Double, _sName: String) : Shape(_sName) {

    val PI = 3.1415
    var radius = _radius

    override fun getArea() = PI * radius * radius
    override fun draw() {
        println("Area of the circle is ${getArea()}.")
    }
}

class Cylinder(_radius : Double, _height: Double,_sName: String) : Circle(_radius, _sName) {

    var height = _height
    override fun draw() {

        var circle = getArea()
        println("Circle of cylinder is $circle")

        var volume = circle * height
        println("Volume of cylinder is $volume")

        var area =  (2 * circle) + (2 * PI * radius * height)
        println("Area of cylinder is $area")    }
}

fun main(args: Array<String>) {

    var rectangle : Rectangle = Rectangle(_width = 5.0, _height = 5.0, _sName = "Rectangle")
    rectangle.draw()

    rectangle = Rectangle(_width = 10.0, _height = 7.0, _sName = "Another Rectangle")
    rectangle.draw()

    /*

    var rectangle = Rectangle(_width = 5.0, _height = 5.0, _sName = "Rectangle")
    rectangle.draw()

    println()
    var triangle = Triangle(_base = 6.0, _height = 5.0,  _sName = "Triangle")
    triangle.draw()

    println()
    var circle = Circle(_radius = 2.5,  _sName = "Circle")
    circle.draw()

    println()
    var cylinder = Cylinder(_radius = 2.5, _height = 4.0, _sName = "Cylinder")
    cylinder.draw()
    */
}