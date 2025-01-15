package A2_ObjectOrientedProgramming._69_LateInitializedProperties

/*
* - Standartnya prop di kotlin wajib diinisialisaikan pada saat prop dideklarasikan
* - Namun kita dapat menuda untuk inisialisasinya dengan menambahkan kata kunci lateinit
* - Kata kunci ini hanya dapat digunakan di mutable / var, tidak dapat digunakan di imutable / var data*/
fun main() {
    val tv = Television()
    // println(tv.brand) // it'll result an error, bcs we need to init the prop first
    tv.initTelevision("Changong")
    // we need to ini the value first before we access it
    println(tv.brand)
}