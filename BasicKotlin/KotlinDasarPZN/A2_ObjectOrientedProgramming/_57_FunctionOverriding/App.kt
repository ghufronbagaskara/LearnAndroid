package `2_ObjectOrientedProgramming`._57_FunctionOverriding

fun main() {
    var ghufron = Manager("Ghufron")
    ghufron.sayHello("Azzachra")

    var hylda = President("Hylda Azzachra")
    hylda.sayHello(ghufron.name)
}