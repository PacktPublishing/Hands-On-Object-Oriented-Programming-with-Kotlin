package Chapter4

class Pet(val petname:String, val breed :String, var owner : Owner?){
    fun displayInfo(){

        println("Pet name is $petname, it's breed is $breed")

        if(owner != null) {

            println("and it's owner name is ${owner?.name}")

        }
    }
}


class Owner(val name:String, var age: Int)

fun main(args: Array<String>) {

    val bob = Owner("Bob", 35)
    val cat = Pet("Catty", "Ragdoll", bob)

    cat.displayInfo()

    val dog = Pet("Doggyy", "Golden", null)

    dog.displayInfo()

}