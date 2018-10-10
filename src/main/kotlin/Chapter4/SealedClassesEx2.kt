package Chapter4

/**
 * Created by KHAN on 2018-10-09.
 */

class Order(val item : String)

sealed class OrderDelivery(val order : Order)

class ReceivedAtDepot(val depotName : String, order: Order) : OrderDelivery(order)
class Dispatched(var truckId : String, var driverName : String, order: Order) : OrderDelivery(order)
class Delivered(var destination : String, var isDelivered : Boolean, order: Order) : OrderDelivery(order)

fun orderStatus(delivery: OrderDelivery) {
    when (delivery) {

        is ReceivedAtDepot -> println("${delivery.order.item} is received at ${delivery.depotName} depot.")
        is Dispatched -> println("${delivery.order.item} is dispatched, Truck ID is ${delivery.truckId} and driver is ${delivery.driverName}")
        is Delivered -> println("${delivery.order.item} delivered at ${delivery.destination}.\n" +
                "Delivery to customer = ${delivery.isDelivered}.\n")
    }
}

fun main(args: Array<String>) {

    var book       = Order("OOP in Kotlin Book")
    var atDepot     = ReceivedAtDepot(depotName = "Stockholm City", order = book)
    var dispatched  = Dispatched(truckId = "AXV-122", driverName = "Logan", order = book)
    var delivered   = Delivered(destination = "älvsjö kommun", isDelivered = true, order = book)

    var orderDeliverySteps = listOf(atDepot, dispatched, delivered)

    for (step in orderDeliverySteps) {
        orderStatus(step)
    }

    var knife   = Order("Kitchen knife set")
    atDepot     = ReceivedAtDepot(depotName = "Stockholm City", order = knife)
    dispatched  = Dispatched(truckId = "JVY-354", driverName = "Peter Parker", order = knife)
    delivered   = Delivered(destination = "Stockholm city", isDelivered = true, order = knife)

    orderDeliverySteps = listOf(atDepot, dispatched, delivered)

    for (step in orderDeliverySteps) {
        orderStatus(step)
    }
}