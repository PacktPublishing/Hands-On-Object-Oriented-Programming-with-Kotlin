package Chapter5


fun range(){

    val range = 1..10
    for (value in range){
        println(value)
    }
}

fun inRange(){
    val range = 1..10

    if(4 in range){
        println("Yes within Range")
    }

    if(14 !in range){
        println("Not in Range")
    }
}


fun rangeTypes(){

    val myIntRange : IntRange = 1..10
    val myLongRange : LongRange = 1..10L
    val myCharRange : CharRange = 'a'..'z'

    for (ch in myCharRange) {
        println(ch)
    }
}

fun verifyRangeTypes(){

    val myIntRange : IntRange = 1..10
    val myLongRange : LongRange = 1..10L
    val myCharRange : CharRange = 'a'..'z'
}

fun rangeToOperator(){

    val myRange1 = 1..10
    val myRange2 = 1.rangeTo(10)

    val execRange1 = 1.until(10)
    println(execRange1)

    val execRange2 = 1 until 10
    println(execRange2)

    val alphabets1 = 'A'..'Z'
    println(alphabets1)

    val alphabets3 = 'A'.until(91.toChar())
    println(alphabets3)
}

fun rangeReverse(){

    val range1 = 10.downTo(1)
    for(i in range1) {
        println(i)
    }

    val range2 = 10 downTo 1
    for(i in range2) {
        println(i)
    }
}

fun helperFuncton(){

    // step
    val range1 = 1..10
    val oddRange = range1.step(2)
    for(i in oddRange) {
        println(i)
    }

    val range2 = 10 downTo 1
    val evenRange = range2 step 2
    for(i in evenRange) {
        println(i)
    }

    //contains
    if(evenRange.contains(2)) {
        println("Found")
    }

    if(oddRange.contains(3)) {
        println("Found")
    }

    // element accessors
    val myRange = 1..10
    println("first " + myRange.first)
    println("last " + myRange.last)
    println("start " + myRange.start)
    println("endInclusive " + myRange.endInclusive)

    println("Element at index 1 =" + myRange.elementAt(1))
}


fun coerce(){

    println("Coerce In")
    var i = 11.coerceIn(10..20)
    println(i)

    i = 9.coerceIn(10..20)
    println(i)

    i = 21.coerceIn(10..20)
    println(i)

    println("coerceAtMost")
    i = 2.coerceAtMost(4)
    println(i)

    println("coerceAtLeast")
    i = 2.coerceAtLeast(4)
    println(i)
}


fun main(args: Array<String>) {
    coerce()
}