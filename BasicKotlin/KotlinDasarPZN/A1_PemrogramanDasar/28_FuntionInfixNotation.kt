/* Infix Notation = adalah operasi terhadap dua data (hampir semua operasi mat adalah infix notation) */

/* Syarat infix not :
* Harus sebagai func member (dibahas dalam OOP) atau func extension
* harus memiliki 1 parameter
* param tidak boleh varargs atau memiliki nilai default  */

infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun main() {
    var result = "Ghufron" to "UP"
    println(result)

    result = "Hylda Azzachra" to "lo"
    println(result)
}