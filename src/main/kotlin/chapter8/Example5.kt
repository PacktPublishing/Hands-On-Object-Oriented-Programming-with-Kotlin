package chapter8

import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) = runBlocking<Unit> {
    launch {
        val result = try {
            calculateValue()
        } catch (exception: Exception) {
            defaultValue
        }
        println(result)
    }
}

val defaultValue = 1

suspend fun calculateValue(): Int = withContext(DefaultDispatcher) { throw Exception() }
