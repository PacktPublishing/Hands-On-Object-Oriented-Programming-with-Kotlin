package Chapter08.CallKotlinFromJava



fun main(args: Array<String>) {

    for (argument in args) {

        println(argument)

    }

}




fun add(a : Int, b : Int) {

    println("Result of $a + $b is ${a+b}")

}


fun addAndReturn(i: Int, j: Int): Int {

    return i + j

}

fun Int.doubleTheValue() = this * 2


fun getMutableList() : MutableList<Int> {

    val list = mutableListOf(1,2,3,4,5)
    return list

}

fun getImmutableList() : List<Int> {

    val list = listOf(1,2,3,4,5)
    return list

}


class Shape(var width : Int, var height : Int , val shape: String) {

    var area : Int = 0

    fun shapeMessage(){
        println("Hi i am $shape, how are you doing")
    }

    fun draw() {
        println("$shape is drawn")

    }

    fun calculateArea(): Int {
        area = width * height
        return area
    }

}

