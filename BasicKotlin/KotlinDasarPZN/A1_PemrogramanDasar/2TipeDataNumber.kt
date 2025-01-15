fun main() {
    //
    var age: Byte = 100
    var grades:Short = 79
    var accountNum: Int = 8790
    var totalResident: Long = 100000000L

    // Floating Point
    var value: Float = 98.08F
    var radius: Double = 214123847.123

    // Literals
    var decimalLateral : Int = 100
    var hexaDecimalLateral : Int = 0xFF
    var binaryLiteral: Int = 0b0011

    println(binaryLiteral)

    // Underscore in number - make it easy to read
    var balance : Long = 1_000_000_000L
    println(balance)

    // Conversion
    var number : Int = 100
    // ->
    var byte:Byte = number.toByte()
    var short : Short = number.toShort()
    var int : Int = number.toInt()
    var float: Float = number.toFloat()
    var double : Double = number.toDouble()
    println(double)

}