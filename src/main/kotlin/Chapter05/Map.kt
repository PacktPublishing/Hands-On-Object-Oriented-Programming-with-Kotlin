package Chapter5


fun createMap(){

    val map: Map<Int,String> = mapOf( Pair(1,"One"), Pair(1,"One"), Pair(2,"Two"), Pair(3,"Three"), 4 to "Four", 5 to "Five")
    for(pair in map){
        println("${pair.key} ${pair.value}")
    }

    val setOfPairs = map.entries
    for ((key, value) in setOfPairs) {
        println("$key $value")
    }
}


fun mapFunctions(){

    val map: Map<Int,String> = mapOf( Pair(1,"One"), Pair(1,"One"), Pair(2,"Two"), Pair(3,"Three"), 4 to "Four", 5 to "Five")

    //Check if map is empty or not
    if( map.isNotEmpty()) {

        println("Map size is  ${map.size}" )

        val setofkeys = map.keys
        println("Keys $setofkeys")

        val setofvalues = map.values
        println("Values $setofvalues")

        var key = 1
        if(map.containsKey(key)) {
            val value = map.get(key)
            println("key: $key value: $value")
        }
    }
}

fun mapDaysOfWeek01(day: Int): String? {

    var result : String?
    val daysOfWeek: Map<Int, String> = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday", 4 to "Thrusday", 5 to "Firday", 6 to "Saturday", 7 to "Sunday")
    result = daysOfWeek.get(day)
    return result
}


fun mapDaysOfWeek02(day: Int): String {

    var result : String
    val daysOfWeek: Map<Int, String> = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday", 4 to "Thrusday", 5 to "Firday", 6 to "Saturday", 7 to "Sunday")
    result = daysOfWeek.getOrDefault(day, "Invalid input")
    return result
}

fun mutableMapPutFunction(){

    val map : MutableMap<Int,String> = mutableMapOf ( Pair(1,"One"), Pair(1,"One"), Pair(2,"Two"), Pair(3,"Three"))

    map.put(4 ,"Four")
    var result = map.put(4 ,"FOUR")
    println(map)
    println("Put " + result)

    result = map.put(1 ,"One")
    println(map)
    println("Put " + result)


}

fun mutableMapRemove(){

    val map : MutableMap<Int,String> = mutableMapOf ( Pair(1,"One"),Pair(2,"Two"), Pair(3,"Three"), Pair(4,"Four"))
    println(map)

    var result = map.remove(4)
    println("Remove " + result)

    var success = map.remove(2,"Two")
    println("Remove " + success)

    println(map)
}

fun clearAndPutAll(){

    val map : MutableMap<Int,String> = mutableMapOf ( Pair(1,"One"), Pair(2,"Two"), Pair(3,"Three"))
    println(map)

    val miniMap = mapOf(Pair(4,"Four"),Pair(5,"Five"))
    map.putAll(miniMap)
    println(map)

    map.clear()
    println(map)

    map.putAll(miniMap)
    println(map)
}

fun main(args: Array<String>) {

    mutableMapPutFunction()
}