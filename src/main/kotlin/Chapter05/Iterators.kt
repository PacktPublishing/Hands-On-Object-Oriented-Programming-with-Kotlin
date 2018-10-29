package Chapter5


fun iteratorFunction() {
    val list = listOf(1, 2, 3, 4, 5)
    var listIterator = list.iterator()

    while (listIterator.hasNext()) {
        println(listIterator.next())
    }
}


fun listIterator() {

    val list: List<Int> = listOf(10, 20, 30)
    var iteraror: ListIterator<Int> = list.listIterator()

    println("has next and next function")
    while (iteraror.hasNext()) {
        println(iteraror.next())
    }
    println("has previous and previous function")
    while (iteraror.hasPrevious()) {
        println(iteraror.previous())
    }

    println("nextIndex ${iteraror.nextIndex()}")
    println("next ${iteraror.next()}")

    println("nextIndex ${iteraror.nextIndex()}")
    println("next ${iteraror.next()}")

    println("previousIndex ${iteraror.previousIndex()}")
    println("previous ${iteraror.previous()}")
}


fun mutableIterator(){

    val mutableListValues : MutableList<Int> = mutableListOf(1,2,3,4,5)
    val mutableIterator : MutableIterator<Int> = mutableListValues.listIterator()

    while(mutableIterator.hasNext()) {
        if(mutableIterator.next() == 3) {
            mutableIterator.remove()
        }
    }

    for (item in mutableListValues) {
        println(item)
    }
}

fun mutableListIteratorFunctionAdd() {

    val mutableListValues: MutableList<Int> = mutableListOf(2, 3, 6)

    var mutableListIterator: MutableListIterator<Int> = mutableListValues.listIterator()

    while (mutableListIterator.hasNext()) {

        if (mutableListIterator.next() == 3)
            mutableListIterator.add((4))
    }

    println(mutableListValues)

    while (mutableListIterator.hasPrevious()) {

        if (mutableListIterator.previous() == 6)
            mutableListIterator.add((5))
    }

    println(mutableListValues)

}


fun mutableListIteratorFunction() {

    val mutableListValues: MutableList<Int> = mutableListOf(2, 3, 6)
    var mutableListIterator: MutableListIterator<Int> = mutableListValues.listIterator()


    println(mutableListValues)

    while (mutableListIterator.hasNext()) {

        if (mutableListIterator.next() == 3) {
            mutableListIterator.set(4)
        }
    }

    println(mutableListValues)


}


    fun main(args: Array<String>) {

        mutableListIteratorFunction()

}