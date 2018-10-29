package Chapter4

sealed class A(val number : Int) {

    class B(n: Int) : A(n) {
        fun display() { println("number = $number" ) }
    }

    class C(n: Int) : A(n){
        fun square() { println("Square = "+ number * number) }
    }
}

class D(n: Int) : A(n){
    fun cube() { println("number = " + number * number * number ) }
}

fun status(a: A) {
    when (a) {
        is A.B -> a.display()
        is A.C -> a.square()
        is D -> a.cube()
    }
}

fun main(args: Array<String>) {
    var b = A.B(1)
    b.display()
    var c = A.C(2)
    var d = D(3)


    status(d)
}

