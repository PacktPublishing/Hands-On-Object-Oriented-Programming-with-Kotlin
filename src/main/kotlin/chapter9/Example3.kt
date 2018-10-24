package chapter9

import kotlinx.serialization.*
import kotlinx.serialization.json.JSON

@Serializable
data class Person(
        val id: Int = 0,
        @SerialName("first_name") val firstName: String,
        @SerialName("last_name") val lastName: String,
        val phones: List<String> = listOf()
)

fun main(args: Array<String>) {
    val saver = object : KSerialSaver<Person> {
        override fun save(output: KOutput, obj: Person) {
            @Serializable
            data class JSONPerson(val id: Int, val name: String, val phones: List<String>)
            output.write(JSONPerson(obj.id, "${obj.firstName} ${obj.lastName}", obj.phones))
        }
    }

    val jsonPerson = JSON.indented.stringify(saver, Person(
            firstName = "Igor",
            lastName = "Kucherenko",
            phones = listOf("+354445545454", "+433443343443")))
    println(jsonPerson)
}
