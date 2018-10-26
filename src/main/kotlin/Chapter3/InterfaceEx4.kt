package Chapter3MultiplueInterfaceConflict

interface IDriveable {
    var numberOfDoors : Int

    fun startEngine(){
        println("Engine is ready ...")
    }
    fun moveForward()
}

interface IFlyable {

    var numberOfDoors : Int

    fun startEngine(){
        println("Jet engine is ready ...")
    }

    fun fly()
}

class Car(override var numberOfDoors: Int, val name : String) : IDriveable, IFlyable {

    override fun startEngine() {
        super<IDriveable>.startEngine()
    }

    override fun fly() {
        println("$name is ready to fly...")
    }

    override fun moveForward() {
        println("$name is driving on the road")
    }
}

fun main(args: Array<String>) {

    val tesla = Car(4, "Tesla")
    tesla.startEngine()
    tesla.moveForward()
    tesla.fly()

    val toyota : IDriveable = Car(4, "Toyota")
    toyota.startEngine()
    toyota.moveForward()

}
