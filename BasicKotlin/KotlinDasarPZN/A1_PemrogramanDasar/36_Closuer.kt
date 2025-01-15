// Closures = kemampuan sebuah func, lambda, anon func untuk berinterakasi dg data di sekitarnya
// HARAP GUNAKAN FITUR CLOSURE INI DENGAN BIJAK SAAT MEMBUAT APLIKASI

fun main() {
    var data = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        data++
    }

    val anonymousIncrement = fun(){
        println("Anonnymous Func Increment")
        data++
    }

    fun funcIncrement(){
        println("Function Increment")
        data++
    }

    lambdaIncrement
    anonymousIncrement
    lambdaIncrement
    funcIncrement()
    funcIncrement()

    println(data)
}