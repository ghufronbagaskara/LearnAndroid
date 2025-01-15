package `2_ObjectOrientedProgramming`._62_TypeCheckAndCasts

import A2_ObjectOrientedProgramming._61_AnyClass.HandPhone
import A2_ObjectOrientedProgramming._61_AnyClass.Laptop
import A2_ObjectOrientedProgramming._61_AnyClass.SmartPhone

// casting object with if
fun printObject(any: Any) {
    // is = digunakan untuk mengecek bahwa tipedata merupakan tipe data yang di maksud atau bukan
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone) {
        println("HandPhone with name ${any.name}")
    } else {
        println(any)
    }
}

// casting object with When, it is more clean and used more often
fun printObjectWithWhen(any: Any){
    when(any){
        is Laptop -> println("Laptop ${any.name}")
        is HandPhone -> println("Handphone ${any.name}")
        else -> println(any)
    }

}

// unsafe cast with as, it is because force change it
fun printString(any: Any){
    val value = any as String
    println(value)
}

// safe case with as?, but the consequent of this
fun safePrintString(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Eko")
    printObject(1)
    printObject(Laptop("Lenovo"))
    printObject(HandPhone("Iphone"))
    printObject(SmartPhone("Samsung", "Android"))

    printObjectWithWhen("Eko")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Lenovo"))
    printObjectWithWhen(HandPhone("Iphone"))
    printObjectWithWhen(SmartPhone("Samsung", "Android"))

    // unsafe cast with as
    printString("Ghufron") // success
    // printString(1) // error

    // safe cast with as?
    safePrintString("Ghufron")
    safePrintString(1) // not error but will result null and not recommend



}