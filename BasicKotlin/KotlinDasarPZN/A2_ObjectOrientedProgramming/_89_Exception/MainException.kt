package `2_ObjectOrientedProgramming`._89_Exception

import java.lang.NullPointerException

/* 1. Membuat Exception
* Banyak sekali jenis error, baik itu yang sudah kita duga, seperti validation error, atau
error yang tidak terduga, seperti ada jaringan error, koneksi ke database error , dan lain-lain
* Error di Kotlin direpresantisakan dengan Exception, dimana semua tipe data error pasti akan
selalu class turunan dari Throwable
* Untuk membuat error di Kotlin sangatlah mudah, kita bisa menggunakan kata kunci throw, diikuti
dengan object error nya*/

class ValidationException(message: String) : Throwable(message)

fun validateAndSayHello(name: String?){
    if (name!!.isBlank()){
        throw ValidationException("Name is blank")
    }
    else
        println("Hello $name")
}

/* 2. Try Catch
* Jika dalam program terdapat exception, maka secara otomatis program akan terhenti
* Untuk menghindarinya kita dapat menangkap exception, lalu melakukan sesuati jika terjadi error
* Try Catch di Kotlin digunakan untuk mencoba melakukan sesuatu, jika terjadi error maka akan ditangkap
dan kita bisa memberi reaksi sesuai dengan apa yang kita mau*/

/* 3. Multiple Catch
* Saat mengeksekusi sebuah code program di blok Try, bisa dimungkinkan tidak hanya terjadi
satu jenis exception, bisa saja terjadi beberapa jenis exception
* Di Kotlin, kita bisa menggunakan multiple Block Catch, untuk menangkap jenis exception
yang berbeda*/

/* 4. Finally
* Merupakan block kode yang dapat ditambahkan di TryCatch
* Finally akan selalu dieksekusi setelah kode program Try Catch di eksekusi, baik itu
sukses ataupun gagal
* Ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli
itu kodenya sukses maupun gagal*/

//DRIVER CODE
fun main() {
    validateAndSayHello("Ghufron")
    //validateAndSayHello("")


    // Try Catch for Exception
    try {
        validateAndSayHello("Ghufron")
        validateAndSayHello("")
        println("wont get run ")
    } catch (error: ValidationException) {  // to catch all error, we can replace it with Throwable
        println("Error with message ${error.message}")
    }

    // Multiple Catch
    try {
        validateAndSayHello("Ghufron")
        validateAndSayHello(null)
    }catch (error : ValidationException){
        println("Error with message ${error.message}")
    }catch (error: NullPointerException){
        println("Error with message ${error.message}")
    }

    // Finally
    try {
        validateAndSayHello("Ghufron")
        validateAndSayHello("")
        println("wont get run ")
    } catch (error: ValidationException) {  // to catch all error, we can replace it with Throwable
        println("Error with message ${error.message}")
    }finally {
        println("Try catch process was done!") // this block code will be executed no matter what
    }
}