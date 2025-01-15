package `2_ObjectOrientedProgramming`._87_OperatorOverloading

/* 1. Operator Overloading
* Kita dapat membuat function dari operator seperti operator matematika
* Kemmapuan ini membuat kita bisa melakukan operasi apapun di object seperti layaknya tipe data Integer
* Ada banyak sekali operator yang bisa di override di Kotlin*/

/* A. Unary Prefix Operator*/

data class Fruit(val quantity: Int){
    operator fun plus(fruit: Fruit) : Fruit {
        return Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit) : Fruit {
        return Fruit(this.quantity - fruit.quantity)
    }
}

fun main() {
    val fruit1 = 100
    val fruit2 = 87
    val fruitNormalWay = fruit1.plus(fruit2)
    println(fruitNormalWay)

    var fruitOpOverload = fruit1 + fruit2
    println(fruitOpOverload)

    fruitOpOverload = fruit2 - fruit1
    println(fruitOpOverload)

    println(Fruit(200) - Fruit(100))

}