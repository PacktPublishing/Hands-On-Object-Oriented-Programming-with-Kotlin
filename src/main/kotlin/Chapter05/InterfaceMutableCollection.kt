package Chapter5


fun mutableList(){

    val list = mutableListOf(1,2,3,4,5)

    for (element in list){
        println(element)
    }
}

fun iterableIterface(){

    val mutableList : MutableIterable<Int> = mutableListOf(1,2,3,4,5,6,7,8,9)

    val mutableIter : MutableIterator <Int> = mutableList.iterator()

    while (mutableIter.hasNext()) {

        if(mutableIter.next() >= 7) {
            mutableIter.remove()
        }
    }

    println(mutableList)
}

fun mutableCollectionFunction() {

    val mutableCollectionList : MutableCollection <Int> = mutableListOf(1,2,3,4,5)
    println("Add item")

    var item = 6
    var result = mutableCollectionList.add(item)

    println("Item $item is added in collection = $result")
    println(mutableCollectionList)

    var miniCollection = listOf(9,8,7,7)

    result = mutableCollectionList.addAll(miniCollection)

    println("Mini collection is added in collection = $result")
    println(mutableCollectionList)

    // Remove only first element of similar type in list
    println("Remove item")
    item = 7
    mutableCollectionList.remove(item)
    println(mutableCollectionList)

    val retain = listOf(2,4,6,8)
    println("Remove all elements except $retain")

    // Retain only mentioned items in list
    mutableCollectionList.retainAll(retain)
    println(mutableCollectionList)

    // Clear all items in list
    mutableCollectionList.clear()

    if (mutableCollectionList.size == 0 ) {
        println("List is clear, add mini collection")
        mutableCollectionList.addAll(miniCollection)
    }

    println(mutableCollectionList)

}



fun main(args: Array<String>) {

    mutableCollectionFunction()

}