package Chapter5

fun iterableWithListOfInt(){

    val listOfInteger : Iterable<Int> = listOf(1,2,3,4,5)

    val iterator = listOfInteger.iterator()

    while (iterator.hasNext()) {
        print(iterator.next())
    }
}

fun collectionInterface(){

    val collectionValues : Collection <Int>    = listOf(1,2,3,4,5)

    val collectionIterator = collectionValues.iterator()

    while (collectionIterator.hasNext()) {
        print(collectionIterator.next())
    }

}

fun collectionInterface02(){

    val collectionValues : Collection <Int>    = listOf(1,2,3,4,5)
    displayCollection("Collection", collectionValues)
}

fun displayCollection(name: String, list: Iterable<Any>) {

    println("Interface $name")

    for (item in list) {
        print(item)
    }
    println("")
}



fun collectionFunctions(){

    val collectionValues : Collection <Int>    = listOf(1,2,3,4,5)

    println("Size ${collectionValues.size}")
    println("is empty: ${collectionValues.isEmpty()}")
    println("contains 3: ${collectionValues.contains(3)}")

    var mini = listOf(2,3,4)
    var answer = collectionValues.containsAll(mini)

    println("Collection contains mini collection: $answer")
}


fun main(args: Array<String>) {

    collectionFunctions()
}