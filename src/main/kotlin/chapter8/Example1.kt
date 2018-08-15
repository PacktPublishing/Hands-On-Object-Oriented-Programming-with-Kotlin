package chapter8

import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    Thread.currentThread().join()
}