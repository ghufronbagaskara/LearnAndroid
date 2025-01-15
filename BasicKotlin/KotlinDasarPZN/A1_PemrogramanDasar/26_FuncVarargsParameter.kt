/* Variable Argumnent = dapat menerima lebih dari satu input */

fun finalValue(name: String, vararg values: Int){  /* variable argument must be in the end of arguments declared */
    var total = 0.0
    for (value in values){
        total += value
    }
    total /= values.size
    println("$name -> Final value: $total")
}

fun main() {
    finalValue("Ghufron Bagaskara", 100, 90, 78, 45, 93, 83)
}