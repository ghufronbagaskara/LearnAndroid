/* Func scope = adalah ruang lingkip dimana sebuah funct bisa diakses */
/* saat kita membuat func didalam file kotlin, maka secara otomatis funct tersebut bisa diakses dalam file kotlin manapun */
/* jika kita ingin membatasi sebuah funct hanya bisa diakses dalam funct terterntu, maka kita bisa membuat funct didalam funct*/

fun satu(){
    outsideFunc()
    // innerFunc()  // -> funct yg berada dalam main funct tidak dapat diakses dari luar
}

fun outsideFunc(){
    println("Outside hello world")
}

fun main() {
    fun innerFunct(){
        println("Inner hello world")
    }

    satu()
    outsideFunc()
    innerFunct()

}