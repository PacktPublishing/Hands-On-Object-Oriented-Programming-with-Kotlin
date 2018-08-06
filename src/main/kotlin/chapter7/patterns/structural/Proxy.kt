package chapter7.patterns.structural

interface File {
    fun showContent()
}

class MediaFile: File {
    override fun showContent() = println("showContent")
}

class CachedMediaFile: File {
    private val file by lazy { MediaFile() }

    override fun showContent() = file.showContent()
}