package chapter10

import java.io.FileInputStream
import java.io.IOException


fun main(args: Array<String>) {
    try {
        FileInputStream("invalid/path")
    } catch (exception: IOException) {
        exception.printStackTrace()
    }
}
