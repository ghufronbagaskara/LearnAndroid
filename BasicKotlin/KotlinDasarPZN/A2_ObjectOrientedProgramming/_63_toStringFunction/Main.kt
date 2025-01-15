package A2_ObjectOrientedProgramming._63_toStringFunction

// toString() will result the representation of String from object
// when we call the println(object), actually the fun toString() will be called automatically

fun main() {
    val avanza = Car_toString("Avanza")
    println(avanza)  // ini akan mengahasilkan fungsi toString yang telah di override
}