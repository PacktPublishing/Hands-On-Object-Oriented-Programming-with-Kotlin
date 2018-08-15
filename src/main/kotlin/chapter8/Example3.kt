package chapter8

import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join()
}