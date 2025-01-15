fun sum(a: Int, b: Int): Int{
    val total = a+b
    return total
}

fun divided(a: Double, b: Double): Double{
    if(b == 0.0){
        return 0.0
    }
    val total = a/b
    return total
}

fun main(){
    val hasil = sum(10, 100)
    println(hasil)

    println(sum(99, 109))

    val resultDiv = divided(10.0, 2.5)
    println(resultDiv)

    println(divided(2.4, 10.0))
}