package chapter7

import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) {
    val job = launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.cancel()
    Thread.currentThread().join()
}