package Chapter5


fun setFunction() {

    val setItems = setOf(1,1,2,3,3,4,5,5)

    var setIterator =  setItems.iterator()

    while (setIterator.hasNext()) {
        print(setIterator.next())
    }
    println()
    println("Set size ${setItems.size}")

    var element = 5
    var result = setItems.contains(element)
    println("Set $setItems contains $element")

    var miniCollection = listOf(1,1,2,3,3)
    result = setItems.containsAll(miniCollection)
    println("setItems contains $miniCollection =  $result")

    miniCollection = listOf(1,2,3,4)
    result = setItems.containsAll(miniCollection)
    println("setItems contains $miniCollection =  $result")


    miniCollection = listOf(0,1,2)
    result = setItems.containsAll(miniCollection)
    println("setItems contains $miniCollection =  $result")

}


fun mutableSetFunction() {

    val mutableSetItems : MutableSet<Int>    = mutableSetOf(1,1,2,3,3,4,5,5)
    var mutableSetIterator =  mutableSetItems.iterator()

    while (mutableSetIterator.hasNext()) {
        print(mutableSetIterator.next())
    }

    println("")
    println("Set size ${mutableSetItems.size}")

    var item = 5
    var result = mutableSetItems.contains(item)
    println("Mutable item contains $item = $result")

    result = mutableSetItems.remove(item)
    println("Mutable item removed $item = $result")

    item = 6
    println("$item is added")
    mutableSetItems.add(item)
    println(mutableSetItems)

    // Keep only mentioned items in list
    mutableSetItems.retainAll(listOf(2,4,6,8))

    // Clear all items
    mutableSetItems.clear()

    var miniCollection = listOf(1,1,2,3,3)

    if (mutableSetItems.size == 0 ) {
        println("List is clear, add mini collection")
        mutableSetItems.addAll(miniCollection)
        println(mutableSetItems)
    }
}


fun main(args: Array<String>) {
    setFunction()
}