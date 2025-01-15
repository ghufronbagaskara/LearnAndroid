package `2_ObjectOrientedProgramming`._54_FunctionOverloading

fun main() {
    var ghufron = Person("Ghufron", "Bagaskara")
    ghufron.sayHello("Riyan")
    ghufron.sayHello("Arif", "Rahman")

    var bagas = Person("Bagas")
    bagas.sayHello("Rahman")
    bagas.sayHello("Elang", "Abdurrahman")

}