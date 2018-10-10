package Chapter4

class Parent {

    companion object Static{

        const val count = 10

        fun companionFunction() {
            println("I am your companion")
        }
    }

    fun getCompanions(){
        companionFunction()
    }

    fun memberFucntion(){
        println("I am your member function")
    }
}


fun main(args: Array<String>) {

    Parent.companionFunction()
    println(Parent.count)

    val obj = Parent()
    obj.memberFucntion()
    obj.getCompanions()

}

interface EmpInterface{

    fun create(name: String, id: Int) : Employee

}

class Employee(val name: String, val id: Int)

class EmployeeFactory {

    companion object Factory: EmpInterface{

         override fun create(name:String, id: Int): Employee {
            return Employee(name,id)
        }
    }

}