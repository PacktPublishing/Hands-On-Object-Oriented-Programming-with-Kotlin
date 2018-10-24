package chapter7

import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) = runBlocking<Unit> {
    Job().also { parentJob->
        val job = launch(parent = parentJob, start = CoroutineStart.LAZY) { downloadImage() }
        //.......
        job.start()
    }.joinChildren()
}