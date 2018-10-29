package Chapter4Rename



data class Employee(val name: String, val id: Int)

interface EmployeeInterface{
    fun create(name: String, id: Int) : Employee
}

class EmployeeFactory {

    companion object : EmployeeInterface{

         override fun create(name:String, id: Int): Employee {
            return Employee(name,id)
        }
    }
}

fun main(args: Array<String>) {
    val emp1 = EmployeeFactory.create("abid",1);
    val emp2 = EmployeeFactory.create("Igor",2);

    println(emp1)
    println(emp2)
}