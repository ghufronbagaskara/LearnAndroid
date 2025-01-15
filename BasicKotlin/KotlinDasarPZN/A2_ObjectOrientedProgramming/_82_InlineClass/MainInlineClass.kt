package A2_ObjectOrientedProgramming._82_InlineClass

/* 1. Inline Class
* Memiliki terlalu banyak class akan memakan banyak memmori
* Jika kelas hanya mempunyai satu properties, kita dapat mendklarasikannya dengan
kata kunci inline*/

inline class Token(val value: String){
    // we can create much inside their body, with condition this class just only have 1 properties
    fun toUpper(): String = value.uppercase()
}

fun main() {
    val login = Token("secret login")
    println(login.toUpper())
}