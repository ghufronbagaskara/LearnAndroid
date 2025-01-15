package `2_ObjectOrientedProgramming`._79_SingletonObject

/*1. Singleton Object
* merupakan object yang hanya dibuat satu kali
* Cara membuatnya hanya dengna menggunakan kata kunci object dan seperti membuat class
* Singleton object mirip dengan class, bisa extends class ataupun interface
* Namun singleton object tidak memiliki constructors*/

object Utilities{
    val name: String = "My Utilities" // saat ini diubah, maka seluruh pengguna ini akan terkena effectnya, berbeda dengan object

    fun toUpper(value: String): String{
        return value.uppercase()
    }
}


/*2. Inner Object
* Singleton dapat dibuat dalam sebuah class
* Namun berbeda dngan innerClass, singleton object tidak bisa mengakses properties atau
function yang ada di outer class nya*/
class Application(val name: String){
    object UtilitiesInner{
        fun toLower(name: String): String{
            return name.lowercase()
        }
    }
}


fun main() {
    // accessing singleton object
    println(Utilities.name)
    println(Utilities.toUpper("Ghufron"))

    // accessing inner singleton
    println(Application.UtilitiesInner.toLower("GHUFRON"))

    // KEGUNAAN -> UNTUK MEMBUAT OBJECT YANG HANYA SATU
    // KEBANYAKAN ORANG MEMAKAINYA UNTUK MEMBUAT UTILITIES CLASS
}