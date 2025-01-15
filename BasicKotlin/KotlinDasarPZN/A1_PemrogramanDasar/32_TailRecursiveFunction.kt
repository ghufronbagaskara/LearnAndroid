tailrec fun display(value: Int) {
    println("Recursive $value")
    if (value > 0){
        display(value - 1)
    }
}

// TailRec Factorial Func
tailrec fun factorialTail(value: Int, total: Int = 1): Int {
    return when (value) {
        1 -> total
        else -> factorialTail(value - 1, total * value)
    }
}

fun main() {
    // Tail Recursive Function
    // -> mengubah recursive func menjadi looping biasa ketikan digunakan
    // --> digunakan untuk mengatasi stack overflow pada recursive function normal

    display(100000)
    println(factorialTail(10))
}