package chapter6.patterns.behavioral

interface ImageFormatter {
    fun format(image: Image): Image
}

class PngFormatter: ImageFormatter {
    override fun format(image: Image) = Image()
}

class JpegFormatter: ImageFormatter {
    override fun format(image: Image) = Image()
}

class Image {
    fun convert(formatter: ImageFormatter): Image = formatter.format(this)
}

fun main() {
    val image = Image()
    val pngImage = image.convert(PngFormatter())
    val jpegImage = image.convert(JpegFormatter())
}