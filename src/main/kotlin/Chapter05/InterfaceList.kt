package Chapter5


fun listInterfaceFunctions(){

    val listOfInteger:List<Int> = listOf(1,2,3,4,5)

    var index = 0
    println("At index $index element "+ listOfInteger.get(index))

    var element = 1
    println("List contains $element at index "+ listOfInteger.indexOf(element))

    println("List contains $element at last index "+ listOfInteger.lastIndexOf(element))

    println("Subset of list")
    val subsetOfList = listOfInteger.subList(0,3)
    for (value in subsetOfList){
        println(value)
    }

}

fun listInterfaceIterator(){

    val listOfInteger:List<Int> = listOf(1,2,3,4,5)

    val iter = listOfInteger.listIterator()

    println("List iterator")
    while (iter.hasNext()){
        println(iter.next())
    }

    println("List iterator indexed")
    val iterIndex = listOfInteger.listIterator(listOfInteger.size)
    while (iterIndex.hasPrevious()){
        println(iterIndex.previous())
    }
}


fun main(args: Array<String>) {

    listInterfaceFunctions()

    listInterfaceIterator()

}