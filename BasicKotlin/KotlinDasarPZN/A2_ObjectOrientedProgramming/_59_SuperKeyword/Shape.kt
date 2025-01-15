package `2_ObjectOrientedProgramming`._59_SuperKeyword

// parent class
open class Shape {
    open var corner: Int = 0
    open fun printName(){
        println("This is Shape")
    }
}

// child class
open class Pentagon : Shape(){
    override var corner: Int = 5
    open val parentCorner = super.corner
    override fun printName(){
        println("This is Pentagon, with parent ->")
        super.printName()
    }
}

// grandChild class
class Hexagon : Pentagon(){
    override var corner: Int = 6
    override val parentCorner: Int = super.corner
    override fun printName() {
        println("This is Hexagon, with parent ->")
        super.printName()
    }
}