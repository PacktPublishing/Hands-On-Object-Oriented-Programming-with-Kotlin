package Chapter4

class Library (private val department : String, private val books : List<Book>) {

    init {
        require(!books.isEmpty()){"Library without books?"}
    }
    fun displayInfo(){
        println("===================================")
        println("Department Name : $department")
        println("===================================")
        for (book in books){
            println("Title : ${book.title}, Author : ${book.author}")
        }
    }
}

class Book (_title : String, _author: String) {
    val title = _title
    val author = _author
}


fun main(args: Array<String>) {

    val oopKotlin = Book("OOP in Kotlin", "Abid Khan")
    val cleanCode = Book("Clean Code", "Uncle Bob")
    val cleanCoder = Book("The Clean Coder", "Uncle Bob")

    var CSBooks = listOf(oopKotlin, cleanCode,cleanCoder)

    var library = Library("Computer Science", CSBooks)

    library.displayInfo()
}
