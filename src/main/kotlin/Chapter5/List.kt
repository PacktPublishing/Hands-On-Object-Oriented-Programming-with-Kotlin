package Chapter5

fun listInt(){

    val listOfInteger = listOf(1,2,3,4,5)

    for (element in listOfInteger){
        println(element)
    }

}

fun listOfVararg(){

    val listOfEverything = listOf<Any>(1,"Two",'c',4.0,5)

    for (element in listOfEverything){
        println(element)
    }

}


fun listOfNonNullObjects(){

    val notNulls = listOfNotNull(1,null,"Two",null,'c',4.0,5)
    println("Size = ${notNulls.size}")

    for (element in notNulls){
        println(element)
    }
}

fun main(args: Array<String>) {

    readListByIndex()

}



fun listString(){

    val listOfString = listOf<String>("One","Two","Three","Four","Five")

    for (element in listOfString){
        println(element)
    }
}


fun readListByIndex(){

    val listOfString = listOf<String>("One","Two","Three","Four","Five","Three")

    var element = listOfString[0]
    println(element)

    element = listOfString.get(1)
    println(element)

    var index = listOfString.indexOf("Three")
    println(index)

    index = listOfString.lastIndexOf("Three")
    println(index)

    println("With subscript [] operator")
    for (i in 0 until listOfString.size) {
        println("At index $i Value ${listOfString[i]}")
    }

    for (element in listOfString){
        println("Value $element at index ${listOfString.indexOf(element)}")
    }
}


fun listDouble(){

    val listOfDouble = listOf<Double>(1.0,2.0,3.0,4.0,5.0)
    for (element in listOfDouble){
        println(element)
    }
}

