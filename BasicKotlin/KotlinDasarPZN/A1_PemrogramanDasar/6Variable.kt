fun main() {

    //1. Mutable (Dapat diubah) -> var
    var nickName: String = "Ghufron"
    var nickname: String = "Bagas"

    // declare it another way
    var nickname2 = "Hylda"  // -> karena disini kotlin telah mengatahui tipedata nya tanpa di deklarasikan
    var age = 20
    

    //2. Immutable (Tidak dapat diubah) -> val
    val myName : String = "Ghufron Bagaskara"



    //3. Nullable Variable
    var mySonName = null
    //a. declare tipe data yang bisa null
    var street :String? = "Kalisalam" //-> menggunakan tanda tanya setlah tipe data (untuk menandakan bahwa street akan bisa null)
    street = null
    println(street?.length) //diakses meminta panjang menggunakan tanda tanya karena data dapat null
    println(street)


    //4. Accessing const variable
    println("Welcome to $APP version $VERSION")



}

//4. Variable Constant -> immutable data yang diakses untuk keperluan global(Menggunakan UPPER CASE)
//didekalasikan diluar main program karena ini dapat diakses dimana saja / secara global
const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"