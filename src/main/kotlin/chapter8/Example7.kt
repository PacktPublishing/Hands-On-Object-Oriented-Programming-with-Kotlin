package chapter8

import kotlinx.coroutines.experimental.*


fun main(args: Array<String>) = runBlocking<Unit> {
    val job = launch {
        try {
            delay(1000000)
        } finally {
            withContext(NonCancellable) {
                try {
                    println("start")
                    delay(1000)
                    println("end")
                } catch (exception: Exception) {
                    exception.printStackTrace()
                }
            }
        }
    }
    delay(1000)
    job.cancel()
    job.join()
}