fun printHello(name: String?): Unit{
    if (name == null){
        println("Hello broo . . .")
    }else{
        println("Hello $name")
    }

}

fun main() {
    printHello("Ghufron")
}