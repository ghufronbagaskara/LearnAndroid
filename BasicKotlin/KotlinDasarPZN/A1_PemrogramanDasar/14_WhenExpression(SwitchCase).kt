// WHEN = it is like Switch Case from Java

fun main() {
    val finalExam = 'A'

    when (finalExam){
        'A' -> println("Amazing")
        'B' -> println("God")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("upss")
    }

    /*When with multiple option*/
    when (finalExam){
        'A', 'B', 'C' -> println("Pass")
        else -> println("Not Pass")
    }

    /*When expression in*/
    val passValues = arrayOf('A', 'B', 'C')
    when (finalExam){
        in passValues -> println("Pass the test!")
        !in passValues -> println("Try Again!!")
    }

    /*When expression is*/
    val name = "Ghufron"
    when (name){
        is String -> println("The data is String")
        !is String -> println("The data isn't String!!")
    }

    /*WHEN SBG PENGGANTI IF ELSE*/
    val examValue = 50
    when{
        examValue > 90 -> println("Great Job")
        examValue > 70 -> println("Nice!")
        examValue > 50 -> println("Not Bad!")
        else -> println("Try again next time")


    }

}