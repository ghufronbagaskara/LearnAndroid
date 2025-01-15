// Label = penanda (dengan menggunakan karakter @)
// kegunaannya adalah dapat diintegrasikan dengan break, continue, dan return (dengan menggunakan label kita dapat menentukan dimana blok kode akan berhenti)

//2.
fun test(name: String, param: (String) -> Unit): Unit = param(name)


// drive code
fun main() {

    //1.
    loopI@ for (i in 1..10){
        loopj@ for (j in 1..10){
            println("$i * $j = ${i * j}")
            if (j == 10) {
                break@loopI
            }
        }
    }

    //2.
    test("Ghufron") testLabel@{
        if (it == "Ghufron"){
            return@testLabel
        }else {
            println("Nama yang anda masukkan salah!!")
        }
    }


}