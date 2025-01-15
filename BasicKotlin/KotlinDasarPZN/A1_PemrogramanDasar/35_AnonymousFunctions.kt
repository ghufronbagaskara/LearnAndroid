//Anonymous Fun = func yang mirip dengan lambda namun fleksibel seperti func biasa
// hanya cara pembuatan masih menggunakan kata kunci func

fun sayHello(value: String, transformer: (String) -> String):String {
    return "Hello ${transformer(value)}"
}


val upper = fun(value: String): String {
    if (value == ""){
        return "UPS"
    } else {
        return value.uppercase()
    }
}

fun main() {
    //eksekusi
    println(sayHello("ghufron012", upper))
    println(sayHello("", upper))

    // anon func as a parameter
    println(hello("HYLDA", fun(value: String): String{
        return value.lowercase()
    }))

}
