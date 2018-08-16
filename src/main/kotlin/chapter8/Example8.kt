package chapter8

import kotlinx.coroutines.experimental.*
import java.time.LocalDateTime
import java.util.*

fun main(args: Array<String>) = runBlocking<Unit> {
    Job().also { parentJob->
        val deferred1 = async(parentJob) { downloadImage() }.apply {
            invokeOnCompletion { println("Image 1 downloaded ${LocalDateTime.now()}") }
        }
        val deferred2 = async(parentJob) { downloadImage() }.apply {
            invokeOnCompletion { println("Image 2 downloaded ${LocalDateTime.now()}") }
        }
        displayImages(deferred1.await(), deferred2.await())
    }.joinChildren()
}

fun displayImages(image1: Image, image2: Image) {
    println("$image1 ${LocalDateTime.now()}")
    println("$image2 ${LocalDateTime.now()}")
}

class Image

suspend fun downloadImage(): Image {
    delay(Random().nextInt(10) * 1000)
    return Image()
}