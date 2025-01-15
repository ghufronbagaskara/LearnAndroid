package `2_ObjectOrientedProgramming`._58_PropertiesOverriding

open class Shape {
    open val corner: Int = -1
}

open class Rectangle : Shape(){
    override val corner: Int = 4
}

class Triangle : Rectangle(){
    override val corner: Int = 3
}