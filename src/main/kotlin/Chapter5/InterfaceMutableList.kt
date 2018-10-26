package Chapter5



fun mutableListIterator(){
    val mutableListValues : MutableList<Int> = mutableListOf(1,2,3,4,5)
    var mutableListIterator = mutableListValues.listIterator()

    // var mutableListIterator = mutableListValues.iterator()
    while (mutableListIterator.hasNext()) {
        print(mutableListIterator.next())
    }
}


fun mutableLisFunctionAdd(){

    val mutableListValues : MutableList<Int> = mutableListOf(1,2,3,4,5)

    // from collection interface
    mutableListValues.add(6)

    mutableListValues.add(0,0)
    println(mutableListValues)

    mutableListValues.add(6)
    mutableListValues.add(mutableListValues.size,6)
    println(mutableListValues)
}

fun mutableLisFunctionAddAll(){

    val mutableListValues : MutableList<Int> = mutableListOf(1,2,3,4,5)
    println(mutableListValues)

    var miniCollection = listOf(9,9,9)

    if (mutableListValues.size > 1) {
        var result = mutableListValues.addAll(1,miniCollection)
        println("Mini list is added = $result")
    }
    println(mutableListValues)
}

fun mutableLisFunctionSetRemove(){

    val mutableListValues : MutableList<Int> = mutableListOf(1,2,3,4,5)
    println(mutableListValues)

    val replaceWith = 5
    val index = 0
    val replaced = mutableListValues.set(index, replaceWith)

    println("Element $replaced is replaced with element $replaceWith at index $index")
    println(mutableListValues)

    var removed = mutableListValues.removeAt(index)
    println("Element $removed is removed at index $index")
    println(mutableListValues)
}




fun main(args: Array<String>) {
    mutableLisFunctionAddAll()
}