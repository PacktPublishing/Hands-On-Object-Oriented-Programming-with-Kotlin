package chapter7

import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.Channel

fun main(args: Array<String>) = runBlocking<Unit> {
    val channel = Channel<Int>()
    launch {
        for (x in 1..5) channel.send(x * x)
    }
    repeat(5) {
        delay(1000)
        println(channel.receive())
    }
    println("Done!")
}