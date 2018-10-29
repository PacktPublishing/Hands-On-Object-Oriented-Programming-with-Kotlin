package SecondaryConstrucotr

// Person class with One secondary constructor
class Person(name: String, age: Int) {
    var name : String
    var age : Int
    var height : Double

    init {
        this.name = name
        this.age  = age
        this.height = 0.0
    }

    constructor(name: String, age: Int, height: Double) : this(name, age) {
        this.height = height
    }
}

fun main(args: Array<String>) {

    val abid = Person("Abid", 40, 6.0)
    println("Name ${abid.name}, Age ${abid.age}, Height ${abid.height}")
}




// Product class with two secondary constructor
class Product(name: String, category: String) {

    val name: String
    val category: String
    var price : Double
    var quantity : Int

    init {
        this.name = name
        this.category = category
        this.price = 0.0
        this.quantity = 0
    }

    constructor(name: String, category: String, price: Double) : this(name, category){
        this.price = price
    }

    constructor(name: String, category: String, price: Double, quantity: Int) : this(name, category, price){
        this.quantity = quantity
    }
}

/*
fun main(args: Array<String>) {

    val audioPlayer = Product("MP3 Player","Electronics")
    println("Product name = ${audioPlayer.name}, Category = ${audioPlayer.category}, Price = ${audioPlayer.price}$ and Available Quantity = ${audioPlayer.quantity}")

    val flashRam = Product("Flash Ram","Electronics", 35.0)
    println("Product name = ${flashRam.name}, Category = ${flashRam.category}, Price = ${flashRam.price}$ and Available Quantity = ${audioPlayer.quantity}")

    val toy = Product("Teddy Bear","Toy", 10.0, 54)
    println("Product name = ${toy.name}, Category = ${toy.category}, Price = ${toy.price}$ and Available Quantity = ${toy.quantity}")
}
*/