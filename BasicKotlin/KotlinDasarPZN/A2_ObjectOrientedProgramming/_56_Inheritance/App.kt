package A2_ObjectOrientedProgramming._56_Inheritance

fun main() {
    val manager = Manager("Ghufron")
    manager.sayHello("Zahra")

    val vicePresident = VicePresident("Zahra")
    vicePresident.sayHello(manager.name)
}