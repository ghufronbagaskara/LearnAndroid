package A2_ObjectOrientedProgramming._84_LazyProperties

/*1. Lazy properties
* Selain delegate di class, kotlin juga mendukung delegate di properties. namun materi ini akan dibahas seteleh mengetahui
kotlin Generic Programming
* Salah satu impelemntasi dr delgating properties ialah Lazy Properties
* Lazy adalah standar library yang telah disedikan agar properties baru diinisialisasi ketika properties itu diakses*/

class Account {
    val name: String by lazy {
        println("Name is called")
        "Ghufron"
    }
}


fun main() {
    val acc = Account()
    //if we access .name, the "name is called" will be pop up too, it happen at the first time we access the properties with lazyProp
    println(acc.name)
    println(acc.name)
    println(acc.name)
    println("Pause")  // this is an implementation of delegation properties
    println(acc.name)
}