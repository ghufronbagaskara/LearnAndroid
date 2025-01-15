fun sayHello(name : String, age : Int, surname: String?){
    println("Hello $name, Iam $age years old")
    println("Surname: $surname")
}

fun main() {
    sayHello("Ghufron Bagaskara", 20, null)
    sayHello("Azzachra", 20, "Desudy")
}