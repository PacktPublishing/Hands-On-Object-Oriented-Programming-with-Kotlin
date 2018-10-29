package chapter10

fun loadValue(): Int = throw Exception()

fun main(args: Array<String>) {
    println(try { loadValue() } catch (exception: Exception) { 4 })
}
