package Chapter4Compostion2

class Job (val companyName : String, var department : String, var salary : Long)


class Person(val name: String, var age : Int, val job: Job){

    fun getSalary() : Long {

        return job.salary

    }

    fun getCompanyName() : String {

        return job.companyName

    }

    fun geDepartmentName() : String {

        return job.department

    }

    fun info(){
        println("===================================")
        println("Person name $name , age $age")
        println("Company Name : ${getCompanyName()}")
        println("Department Name : ${geDepartmentName()}")
        println("Salary : ${getSalary()}")
        println("===================================")

    }
}


fun main(args: Array<String>) {

    val job = Job("Microsoft", "Research and Development", 8000)

    val bob = Person("Bob", 35, job)

    bob.info()
}
