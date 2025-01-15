package `2_ObjectOrientedProgramming`._59_SuperKeyword

fun main() {
    // child
    var shape = Shape()
    println(shape.corner)
    println(shape.printName())
    println()

    // child
    var pentagon = Pentagon()
    println(pentagon.corner)
    println(pentagon.parentCorner)
    println(pentagon.printName())
    println()

    // grandchild
    var hexagon = Hexagon()
    println(hexagon.corner)
    println(hexagon.parentCorner)
    println(hexagon.printName())

}