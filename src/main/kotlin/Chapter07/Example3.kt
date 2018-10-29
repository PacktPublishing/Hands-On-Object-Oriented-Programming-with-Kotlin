package chapter7

import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        delay(1000L)
        println(Thread.currentThread().name)
    }
    println(Thread.currentThread().name)
    job.join()
}
