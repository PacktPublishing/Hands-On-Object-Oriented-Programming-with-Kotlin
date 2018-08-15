package chapter8

import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) = runBlocking<Unit> {
    val parentJob = Job()
    (0..10_000)
            .forEach { launch(parent = parentJob) { println(Thread.currentThread().name) } }
    parentJob.joinChildren()
}