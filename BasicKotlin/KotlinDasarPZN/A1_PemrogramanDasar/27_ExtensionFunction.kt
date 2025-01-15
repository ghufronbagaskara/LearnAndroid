/* extension func = adalah kemampuan menambahkan function pada type data yang sudah ada */

//1. first type
fun String.hello():String {
    return "Hello. . .  $this"
}
//  second type
//fun String.hello(): String = "Hello $this"

//2.
fun String.printHello(): Unit = println("Hello $this")

// Main Function
fun main() {
    val name: String = "Ghufron"

    // 1.
    val hello: String = name.hello()
    println(hello)

    //2.
    name.printHello()
    "Azzachra Hylda".printHello()

}