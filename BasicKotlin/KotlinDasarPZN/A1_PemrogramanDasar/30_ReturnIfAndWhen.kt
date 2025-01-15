
// 1. Return If
fun ifSayHello(name: String =""): String {
    return if (name == ""){
        "Hello broo"
    } else {
        "Hello $name"
    }
}

// 2. Return When (Mengurangi kata return)
fun whenSayHello(name: String = ""): String{
    return when (name) {
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}

fun main() {
    // menggunakan if
    var result = ifSayHello("Ghufron")
    println(result)
    result = ifSayHello("")
    println(result)

    // menggunakan when
    var result2 = whenSayHello("Ghufron")
    println(result2)
    result2 = whenSayHello("")
    println(result2)
}