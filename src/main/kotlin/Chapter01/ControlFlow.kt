package chapter1

/*
* Each code block /* Code */ in this file is a complete one example.
* Unblock one at a time and execute.
*/


// if statement
/*
fun main(args: Array<String>) {

    val langName = "Kotlin"

    if ( langName == " Kotlin" ) {

        println ( "Hello"+ langName)

    }

}
*/



// if else statement
/*
fun main(args: Array<String>) {

    val langName = "Java"
    if ( langName == "Kotlin" ) {
        println ( "I love "+ langName )
    }
    else {
        println ("The name of the language is "+ langName ) }

}
*/



// if else if
/*
fun main (arge:Array<String>){
    val studentMarks = 90
    var grade = ""

    if (studentMarks >= 90) {
        grade = "A"
    } else if (studentMarks >= 80) {
        grade = "B"
    } else if (studentMarks >= 70) {
        grade = "C"
    } else if (studentMarks >= 60) {
        grade = "D"
    } else {
        grade = "F"
    }
    println ( "Student achieved " + grade )
}

*/



//if with and
/*
fun main ( arge : Array <String> ) {

    val studentMarks = 99
    var grade = ""
    if (studentMarks >= 96) {
        grade = "A+"
    } else if (studentMarks >= 90 && studentMarks < 96){
        grade = "A"
    } else if (studentMarks >= 86 && studentMarks < 90){
        grade = "B+"
    } else if (studentMarks >= 80 && studentMarks < 86){
        grade = "B"
    } else if (studentMarks >= 76 && studentMarks < 80){
        grade = "C+"
    } else if (studentMarks >= 70 && studentMarks < 76){
        grade = "C"
    } else if (studentMarks >= 66 && studentMarks < 70){
        grade = "D+"
    } else if (studentMarks >= 60 && studentMarks < 66){
        grade = "D"
    } else {
        grade = "F"
    }
}
*/



// if with or
/*
fun main(args: Array<String>) {

    val studentAttendance = 5
    val studentAssignment = 10
    val studentExamination = 30

    val studentMarks = studentAttendance + studentAssignment + studentExamination

    var grade = ""

    if((studentAttendance < 5 ) or (studentAssignment < 10 ) or (studentExamination < 30)) {

        grade = "F"
    }
    else {

        if (studentMarks >= 90) {
            grade = "A"
        } else if (studentMarks >= 80) {
            grade = "B"
        } else if (studentMarks >= 70) {
            grade = "D"
        } else if (studentMarks >= 60) {
            grade = "C"
        } else if (studentMarks >= 50) {
            grade = "D"
        } else {
            grade = "E"
        }
    }

    println ( "Student achieved " + grade )
}
*/



// if with not
/*
fun main ( arge : Array <String> ) {

    val grade = "A"

    if(grade != "F") {

        println("Congratulation you have passed the course")

    } else {

        println("Fail… Better luck next time")

    }
}
*/



/*
fun main(args: Array<String>) {

    val studentMarks = 59
    var grade = ""

    if (studentMarks >= 90) {
        grade = "A"
    } else if (studentMarks >= 80) {
        grade = "B"
    } else if (studentMarks >= 70) {
        grade = "C"
    } else if (studentMarks >= 60) {
        grade = "D"
    } else {
        grade = "F"
    }

    println ( "Student achieved " + grade )

    if(grade != "F") {
        println("Congratulation you have passed the course")
    } else {
        println("Fail… Better luck next time")
    }

}
*/



// range operator
/*
fun main ( arge : Array <String> ) {

    var speed = 45
    if(speed > 0 && speed < 50){
        println("Nice driving")

    } else if(speed >= 50 && speed < 60){
        println("You are exceeding the limit, fine payable $10")
    }
    else if(speed >= 60 && speed < 70){
        println("Warning.. reduce your speed. fine payable $30")
    }
    else {
        println("Your driver's license is canceled. fine payable $75")
    }
}
*/



// Range operator
/*
fun main(args: Array<String>) {

    val firstTenDigits = 1..10
    val alphabets = 'a'..'z'

    for (a in alphabets)
        println(a)

    println(alphabets)

}
*/



/*
fun main ( arge : Array <String> ) {

    val speedLimit1 = 1..49
    val speedLimit2 = 50..59
    val speedLimit3 = 60..69

    var speed = 45

    if(speed in speedLimit1){
        println("Nice driving")
    }
    else if(speed in speedLimit2){
        println("You are exceeding the limit, fine payable $10")
    }
    else if(speed in speedLimit3){
        println("Warning.. reduce your speed. fine payable $30")
    }
    else {
        println("Your driver's license is canceled. fine payable $75")
    }

    if(speed !in 0..70) {
        println("Your driver's license is canceled. fine payable $75")
    }

}
*/




// if as an expression
/*
fun main(args: Array<String>) {

    val studentMarks = 90

    var grade = if (studentMarks >= 90) {
        "A"
    }else if (studentMarks >= 80) {
        "B"
    } else if (studentMarks >= 70) {
        "C"
    } else if (studentMarks >= 60) {
        "D"
    } else {
        "F"
   }
    println ( "Student achieved " + grade )
}
*/

// when expression
/*
fun main(args: Array<String>) {

    val day = 2
    when(day) {

        1-> println("Monday")
        2-> println("Tuesday")
        3-> println("Wednesday")
        4-> println("Thursday")
        5-> println("Friday")
        6-> println("Saturday")
        7-> println("Sunday")
        else -> println("Invalid input")
    }
}
*/



/*
fun main(args: Array<String>) {

    val grade = "B"
    when (grade) {
        "A" -> println("Excellent")
        "B" -> println("Very Good")
        "C" -> println("Nice work")
        "D" -> println("OK")
        "E" -> println("Hmmm")
        "F" -> println("Better luck next time")
        else -> println("Invalid input")
    }
}
*/



/*
fun main(args: Array<String>) {
    val grade = "b"
    when (grade) {
        "A","a" -> println("Excellent")
        "B","b" -> println("Very Good")
        "C","c" -> println("Nice work")
        "D","d" -> println("OK")
        "E","e" -> println("Hmmm")
        "F","f" -> println("Better luck next time")
        else -> println("Invalid input")
    }
}
*/



/*
fun main(args: Array<String>) {

    val grade = "A"
    when (grade) {
        in "A".."E" -> println("You are promoted to the next level")
        "F" -> println("You need hard work.")
        else -> println("Invalid input")
    }
}
*/



/*
fun main(args: Array<String>) {

    val grade = "A"

    val remarks = when (grade) {

        "A","a" -> "Excellent"
        "B","b" -> "Very Good"
        "C","c" -> "Nice work"
        "D","d" -> "OK"
        "E","e" -> "Hmmm"
        "F","f" -> "Better luck next time"
        else -> "Invalid input"
    }

    println(remarks)

}
*/



fun main(args: Array<String>) {

    val studentMarks = 85

    val grade = when (studentMarks) {
        in 90..100 -> {
            "A"
        }
        in 80..89 -> {
            "B"
        }
        in 70..79 -> {
            "C"
        }
        in 60..69 -> {
            "D"
        }
        in 50..59 -> {
            "E"
        }
        else -> {
            "F"
        }
    }

    println(grade)
}

