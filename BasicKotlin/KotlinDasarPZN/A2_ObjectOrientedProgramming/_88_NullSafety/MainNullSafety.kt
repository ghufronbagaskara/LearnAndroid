package `2_ObjectOrientedProgramming`._88_NullSafety

/*1. Null Safety
* NullPointerException merupakan error yang akan terjadi ketika kita mengakses properties/ function di null object
* Di kotlin ini sangat jarang terjadi karena sedari awal kotlin sendiri telah merekomendasikan untuk tudak menggunakan nullable type
* Walaupun akan menggunakan nullable type, di Kotlin kita memberitahu secara eksplisit menggunakan karakter tanda tanga(?)
* Kali ini kita akan bahas cara-cara agar terhindar dari error null di Kotlin sehingga tidak sering kejadian seperti di Java*/

/* A. Checking for null*/
data class Friend(val name: String)

fun sayHello(friend: Friend?) {
    if (friend != null){
        println("Hello ${friend.name}")
    }
}

/* B. Elvis Operator*/
fun sayHi(friend: Friend?): Unit{
    val name = friend?.name ?: ""  // Elvis Operator -> Null will get replaced by string
    println("Hello $name")
}

/*C. !!Operator
* Jika sangat ingin menggunakan NullPointerExceptpion
* Dan yakin bahwa variabel itu tidak akan null
* Maka kita dapat menggunakan kata kunci !! untuk mengkonversi dari data yang nullable menjadi data tidak nullable
* Konsekuensinya adalah jika ternyata dta null, maka akan terjadi error */
fun sayGoodbye(friend: Friend?){
    val name = friend!!.name // it'll force that friend will not null
    println("Hello $name")  // then we need to be careful using this operator
}


fun main() {
    sayHello(Friend("Ghufron"))
    sayHello(null)
}