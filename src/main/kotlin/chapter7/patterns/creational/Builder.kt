package chapter7.patterns.creational

fun main(args: Array<String>) {
    val burger: Burger = Burger.Builder()
            .setMeat(Meat())
            .setKetchup(Ketchup())
            .build()

    val kotlinger: Kotlinger = Kotlinger(
            meat = Meat(),
            ketchup = Ketchup()
    )

    window {
        header {
            text = "Header"
            color = "#00FF00"
        }
        footer {
            text = "Footer"
        }
    }
}

class Meat
class Cheese
class Ketchup
class Bun

class Burger {
    private val meat: Meat
    private val cheese: Cheese
    private val ketchup: Ketchup
    private val topBun: Bun
    private val bottomBun: Bun

    private constructor(meat: Meat, cheese: Cheese, ketchup: Ketchup, topBun: Bun, bottomBun: Bun) {
        this.meat = meat
        this.cheese = cheese
        this.ketchup = ketchup
        this.topBun = topBun
        this.bottomBun = bottomBun
    }

    class Builder {
        private var meat: Meat = Meat()
        private var cheese: Cheese = Cheese()
        private var ketchup: Ketchup = Ketchup()
        private var topBun: Bun = Bun()
        private var bottomBun: Bun = Bun()

        fun setMeat(meat: Meat): Builder {
            this.meat = meat
            return this
        }

        fun setCheese(cheese: Cheese): Builder {
            this.cheese = cheese
            return this
        }

        fun setKetchup(ketchup: Ketchup): Builder {
            this.ketchup = ketchup
            return this
        }

        fun setTopBun(topBun: Bun): Builder {
            this.topBun = topBun
            return this
        }

        fun setBottomBun(bottomBun: Bun): Builder {
            this.bottomBun = bottomBun
            return this
        }

        fun build(): Burger {
            return Burger(meat, cheese, ketchup, topBun, bottomBun)
        }
    }
}

class Kotlinger(private val meat: Meat = Meat(),
                private val cheese: Cheese = Cheese(),
                private val ketchup: Ketchup = Ketchup(),
                private val topBun: Bun = Bun(),
                private val bottomBun: Bun = Bun())

class TextView {
    var text: String = ""
    var color: String = "#000000"
}

class Window(init: Window.() -> Unit) {
    private var header: TextView? = null
    private var footer: TextView? = null

    init {
        init()
    }

    fun header(init: TextView.() -> Unit) {
        this.header = TextView().apply { init() }
    }

    fun footer(init: TextView.() -> Unit) {
        this.footer = TextView().apply { init() }
    }
}

fun window(init: Window.() -> Unit): Window {
    return Window(init)
}