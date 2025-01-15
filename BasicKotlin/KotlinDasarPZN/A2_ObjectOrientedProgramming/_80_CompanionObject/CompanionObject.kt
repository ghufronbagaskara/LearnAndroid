package `2_ObjectOrientedProgramming`._80_CompanionObject

/* 1. Companion Object
* Merupakan kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
* Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya*/

class AppCompObject(val name: String){
    companion object{  // kelas ini dapat diberi nama maupun tidak
        fun hello(name: String) : Unit{ //Keuntungan pembuatan nya ialah saat kita memanggil nama objectnya, kita hanya perlu memanggil nama-
            println("Hello $name")  //class nya
        }
    }
}

fun main() {
    AppCompObject.hello("Ghufron")
    AppCompObject.Companion.hello("Ghufron")
}