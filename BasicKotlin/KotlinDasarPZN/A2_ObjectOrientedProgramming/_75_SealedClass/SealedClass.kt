package A2_ObjectOrientedProgramming._75_SealedClass

/* 1. Sealed class
* Sealed class merupakan jenis class yang didesain untuk inheritance
* Sealed class tidak bisa diinstansiasi menjadi object, dan secara standar sealed class merupakan abstract class
* Sealed class sangat cocok digunakan sebagai parent class*/

// declare sealed class
sealed class Operation(val name: String)

class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Modulo : Operation("Modulo")

fun operation(value1: Int, value2: Int, operation: Operation) : Int{
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}


fun main() {
    println(operation(10, 122, Plus()))
    println(operation(100, 10, Minus()))
    println(operation(10, 3, Modulo()))
}