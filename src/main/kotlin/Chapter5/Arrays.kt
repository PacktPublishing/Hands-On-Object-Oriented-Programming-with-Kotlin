package Chapter5


fun intArray(){

    var intArr = arrayOf(1,2,3,4,5)

    println("Integer Array")
    println("Element at index 0 = " + intArr[0])
    println("Element at index 1 = " + intArr[1])
    println("Element at index 2 = " + intArr[2])

}

fun stringArray(){

    println("String Array")
    val strArray = arrayOf("ONE","TWO","THREE","FOUR","FIVE")
    println("Element at index 0 = " + strArray[0])
}

fun charArray(){

    println("Char Array")

    val charArray = arrayOf('a','b','c','d','e')
    println("Element at index 0 = " + charArray[0])

    val size = charArray.size
    println("charArray size = " + size)
}

fun explicitTypeDeclaration() {

    println("Index Array")
    var numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Element at index 0 = " + numbers[0])

    println("Char Array")
    var chars = charArrayOf('a', 'b', 'c')
    println("Element at index 0 = " + chars[0])
}

fun readArrayByIndex(){

    val intArr= intArrayOf(1,2,3,4,5)
    val arraySize = intArr.size
    var index = 0

    println("With subscript [] operator")
    while(index < arraySize){
        println("At index $index Value ${intArr[index]}")
        index++
    }


    println("With get function")
    index = 0
    while(index < arraySize){
        println("At index $index Value ${intArr.get(index)}")
        index++
    }
}

fun arrayAndForloop(){

    val strArray = arrayOf("ONE","TWO","THREE","FOUR","FIVE")
    for (element in strArray){
        println(element)
    }
}

fun declareAndInitArray(){

    var intArray = IntArray(5)
    intArray[0] = 10
    intArray[1] = 20
    intArray.set(2,30)

    for (element in intArray){
        println(element)
    }

    var doubleArray = DoubleArray(5)
    doubleArray[0] = 10.0
    doubleArray[1] = 20.0
    doubleArray.set(2,30.0)

}

fun mutableOrImmutable(){

    val immutableArray = arrayOf(1,2,3)
    immutableArray.set(0,10)
    immutableArray[1] = 20
    // immutableArray = arrayOf(5,6,7,8,9,10)

    var mutableArray = arrayOf(1,2,3)
    mutableArray.set(0,10)
    mutableArray[1] = 20

    mutableArray = arrayOf(5,6,7,8,9,10)
    mutableArray = immutableArray

}

fun arrayWithLambda(){

    //val intArray = IntArray(5) { it ->  it + 0 }
    val intArray = IntArray(5) { it }
    for (element in intArray){
        println(element)
    }

    val doubleArray = DoubleArray(5) { it.toDouble() }
    for (element in doubleArray){
        println(element)
    }

    val arr = IntArray(5){func(it)}
    for (element in arr){
        println(element)
    }
}

fun func(i : Int) : Int{
    return i * i
}


fun funcVararg() {

    val array = arrayOf(1,"TWO",'c',4.0)
    for (i in array) {
        println(i)
    }

    println(array.contains(2))
    println(array.contains('c'))
}

fun nulls() {

    val nullArray = arrayOfNulls<String>(5)
    nullArray.set(0,"hello")
    nullArray.set(3,"kotlin")

    for (i in nullArray){
        println(i)
    }
}

fun printArrayInt(arr: IntArray) {
    for (i in arr) {
        println(i)
    }
}

fun updateArray(arr : IntArray): IntArray{

    val size = arr.size
    var index = 0

    while (index<size){
        arr[index] = arr[index] * 2
        index++
    }
    return arr
}


fun copyArray(){

    val source = intArrayOf(1,2,3)
    val target = source

    // print target
    for (element in target){
        println(element)
    }

    // update source
    source.set(0,10)

    // print target
    for (element in target){
        println(element)
    }

    if(source === target){
        println("pointing to the same memory location")
    }
}

fun copyArray02(){

    val source = intArrayOf(1,2,3)
    val target = IntArray(source.size)

    for (i in 0 until source.size){
        target[i] = source[i]
    }

    source.set(0,10)

    println("New target")
    for (element in target){
        println(element)
    }

    if(source !== target){
        println("pointing to different memory location")
    }



    println("New array")

    val newArray = source.copyOf()

    if(source !== newArray){
        println("pointing to different memory location")
    }

    for (element in newArray){
        println(element)
    }
}

fun copyArray03(){

    val source = intArrayOf(1,2,3)
    val target = source.copyOf()

    if(source !== target){
        println("pointing to different memory location")
    }

    for (element in target) {
        println(element)
    }
}


fun main(args: Array<String>) {
    arrayWithLambda()
}