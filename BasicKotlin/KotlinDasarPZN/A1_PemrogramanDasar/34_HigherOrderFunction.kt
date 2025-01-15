// Higher-Order Functions = fungsi yang menggunakan fungsi sebagai parameter atau mengembalikan fungsi
//-> penggunaannya untuk membuat funsgi yg general dan ingin mendapatkan input yang flexible berupa lambdam yg
//    bisa dideklarasikan oleh si user ketika memanggil fungsi tersebut

// fungsi ini akan memasukkan data nama dan param ke dua berfungsi sebagai transformer nya dan dapat membuatnya menjadi flexibel
fun hello(value: String, transformer: (String) -> String):String {
    return "Hello ${transformer(value)}"
}
//lambda method
val kapital = {value: String -> value.uppercase()}
val nonKapital = {value: String -> value.lowercase()}


// DRIVER CODE
fun main() {
    println(hello("ghufron", kapital))
    println(hello("HYLDA", nonKapital))
}