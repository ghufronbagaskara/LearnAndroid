package `2_ObjectOrientedProgramming`._58_PropertiesOverriding

fun main() {
    val shape = Shape()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)

    val triangle = Triangle()
    println(triangle.corner)
}