package Chapter4
// by-default value starts from 0
enum class Color {
    RED ,
    GREEN ,
    BROWN,
    YELLOW
}


// enum is a normal class which can have functions.
// do you think you do not have semicolon in kotlin :P
enum class US (val totalArea : Double, val landArea : Double) {

    NEWYORK     (141_297.0,  122_057.0),
    VIRGINIA    (110_787.0, 102_279.0) ,
    HAWAII      (28_313.0,    16_635.0),
    NEWJERSEY   (22_591.0, 19_047.0) ;

    fun getWaterArea() = totalArea - landArea
}

enum class Week(val value: Int) {
    MONDAY(2 ) ,TUESDAY(4),WEDNESDAY(6),THURSDAY(8),FRIDAY(10), SATURDAY(12), SUNDAY(14)
}


fun main(args: Array<String>) {

    println(Color.RED)
    println(Color.RED.name)
    println(Color.RED.ordinal)

    val color = Color.valueOf("GREEN")
    println(color.name)
    println(color.ordinal)

    val week = Week.valueOf("TUESDAY")
    println("Item type " + week)
    println("Name " + week.name)
    println("Value " + week.value)

    println("Square kilometer")
    for (state in US.values()){
        println("$state state's total area is ${state.totalArea} and " +
                "Land area is ${state.landArea}" )
        println("Water area " + state.getWaterArea())
    }
}


