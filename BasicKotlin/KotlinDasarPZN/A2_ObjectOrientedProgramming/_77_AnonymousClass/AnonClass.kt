package A2_ObjectOrientedProgramming._77_AnonymousClass

/* 1. Anon Class
* Kemampuan untuk membuat object dari class yang bahkan belum lengkap
* Bahkan dapat untuk membuat class dari Interface yang dapat di wujudkan dengan anon class
* untuk membuat anon class, kita bisa menggunakan kata kunci object
diikuti dengan deklarasi class Child seperti pada pewarisan*/

fun fireAction(action: Action){
    action.action()
}

// biasanya untuk membuat object dari interface, kita harus membuat child classnya terlebih dahulu
class SampleAction : Action{
    override fun action() {
        println("This is the sample action")
    }
}


fun main() {
    fireAction(SampleAction())
    // tanpa membuat child class nya, kita dapat membuat
    // ini adalah anonymousClass atau class tanpa nama
    fireAction(object : Action{
        override fun action() {
            println("Action one")
        }
    })
    fireAction(object : Action{
        override fun action() = println("Action two")
    })


}
