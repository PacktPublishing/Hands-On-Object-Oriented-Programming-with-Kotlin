package chapter7

import kotlinx.coroutines.experimental.*
import java.io.FileReader

fun main(args: Array<String>) {
    launch {
        val fileReader = FileReader("path")
        try {
            delay(10000)
            fileReader.read()
        } finally {
            fileReader.close()
        }
    }
}
