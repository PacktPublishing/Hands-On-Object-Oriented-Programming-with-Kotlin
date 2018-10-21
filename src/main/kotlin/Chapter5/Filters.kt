package Chapter5


fun filterOut(){

    var numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    var newList = numbers.filter { i -> i > 5 }
    println("Filter out greater than 5")
    println(newList)

    newList = numbers.filter { i -> i <= 5 }
    println("Filter out less than 5")
    println(newList)

    newList = numbers.filter { it % 2 == 0 }
    println("Filter out Even numbers")
    println(newList)

    newList = numbers.filterNot { it % 2 == 0 }
    println("Filter out Odd numbers")
    println(newList)

}

fun filterOutNotNull(){

    val list = listOf("One", 2, 3, null, "Four", null)
    var newList = list.filterNotNull()
    println(newList)

}

fun filterInstance(){

    val list = listOf("One", 2.0, 3, null, "Four", 5)

    val sList= list.filterIsInstance<String>()
    println("Filter string")
    println(sList)

    val iList= list.filterIsInstance<Int>()
    println("Filter int")
    println(iList)
}

fun slice(){

    var numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    var newList = numbers.slice(1..4)
    println("Slice of first four elements")
    println(newList)

    newList = numbers.slice(listOf(1,4,8))
    println("Slice of selected elements")
    println(newList)
}


fun take(){

    var numbers = listOf<Int>(1,2,3,4,5,4,3,8,9,10)

    var newList = numbers.take(5)
    println("Take first 5 elements")
    println(newList)

    newList = numbers.takeLast(5)
    println("Take last 5 elements")
    println(newList)

    newList = numbers.takeWhile { it < 5 }
    println("Take all elements from beginning of the list, less than 5")
    println(newList)

    newList = numbers.takeLastWhile { it > 5 }
    println("Take all elements from end of the list, which are greater than 5")
    println(newList)

}


fun drop(){

    var numbers = listOf<Int>(1,2,3,4,5,4,3,8,9,10)

    var newList = numbers.drop(5)
    println("Drop first 5 elements")
    println(newList)

    newList = numbers.dropLast(5)
    println("Drop last 5 elements")
    println(newList)

    newList = numbers.dropWhile { it < 5 }
    println("Drop from beginning : while element is less than 5")
    println(newList)

    newList = numbers.dropLastWhile { it > 5 }
    println("Drop from end : while element is greater than 5")
    println(newList)

}

fun mixFunctions(){

    var numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var element = 5

    println("Does List contain $element : ${numbers.any{it == 5}}")

    println("All list members are greater than $element : ${numbers.all{it > element}}")

    element = 0
    println("All list members are greater than $element : ${numbers.all{it > element}}")

    element = 8
    println("Number of elements less than $element =  ${numbers.count { it < element }}")
}

fun fold(){

    var numbers = listOf<Int>(1,2,3,4,5)

    var result = numbers.fold(0){i,j -> i + j}
    println("From beginning : add all elements of the list " + result)

    result = numbers.foldRight(0){i,j -> i + j}
    println("From End : add all elements of the list " + result)
}

fun foldWithFunction(){

    var numbers = listOf<Int>(1,2,3,4,5)
    var result = numbers.fold(0, ::foldHelper)

    println("Add all elements of the list " + result)
}

fun foldHelper(i : Int, j : Int) : Int{
    println("$i , $j")
    return i + j
}


fun reduce(){

    var numbers = listOf<Int>(1,2,3,4,5)
    var result = numbers.reduce { acc, i ->  i + acc}

    println("From beginning : add all elements of the list $result")

    result = numbers.reduceRight { i, acc -> i + acc}
    println("From end : add all elements of the list $result")

    result = numbers.reduceRightIndexed { index , i, acc -> i + acc }
    println("From end : add all elements of the list $result")

    result = numbers.reduceRightIndexed(::reduceHelper)
    println(result)

}

fun reduceHelper(index: Int, i: Int, acc: Int): Int{

    println("$index, $i, $acc")
    return i + acc
}


fun forFunctions(){

    var numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    println("Print all elements of list")
    numbers.forEach{ println(it)}

    println("Print elements with index")
    numbers.forEachIndexed { index, element -> println("Element $element at index $index") }

    numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    println("Get original list back and print square of each element")
    numbers = numbers.onEach{ println(it * it)}

    println("Get max value ${numbers.max()}")
    println("Get min value ${numbers.maxBy { -it }}")

    println("Get min value ${numbers.min()}")
    println("Get max value ${numbers.minBy { -it }}")

    println("Multiply each element with 2 and get the sum of list")
    var sum = numbers.sumBy { it * 2}
    println("sum $sum")

}

fun main(args: Array<String>) {
    forFunctions()
}