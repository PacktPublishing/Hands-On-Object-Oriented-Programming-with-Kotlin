package Chapter4
// by-default value starts from 0

interface printable {
    fun show()
}

enum class NEWS : printable {

    NORTH {
        override fun show() {
            println("Can you explain me what is summer")
        }
    }, EAST {
        override fun show() {
            println("Can you explain me what is cold")
        }
    }, WEST {
        override fun show() {
            println("I know what is winter and summer.")
        }
    }, SOUTH {
        override fun show() {
            println("Oh .. its humid here...")
        }
    }
}


fun main(args: Array<String>) {

    var item = NEWS.valueOf("EAST")
    item.show()

    item = NEWS.valueOf("SOUTH")
    item.show()

}


