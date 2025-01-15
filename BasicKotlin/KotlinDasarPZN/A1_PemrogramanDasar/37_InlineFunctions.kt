// high order fun akan berdampak terhadap performa saat aplikasi berjalan karena harus membuar objek lamda berulang ulang
// Inline Func adalah kemampuan untuk menjadikan Higher-Order Func menjadi Inline Function
//-> dimana dengan Inline Func, code di dalam Higher-Order Function akan di duplicate agar pada saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

// jika kita ingin tidak menggunakan paramter yang nonInline
inline fun Hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(hello { "Eko" })
    println(hello { "Kurniawan" })

    println(Hello({ "Ghufron" }, { "Bagaskara" }))
}