package `2_ObjectOrientedProgrammin`._90_Annotation

/* 1. Annotation
* Merupakan proses menambahkan metadata / informasi tambahan ke kode program yang kita buat
* Tidak semuar orang membutuhkan annotation, biasanya Annotation digunakan saat kita ingin
membuat library / framework
* Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
* Untuk membuat class annotation, kita bisa menggunakan kata kunci annotattion sebelum membuat class tersebut
* Annotation hanya boleh memiliki properties via primary constructor, tidak boleh memiliki
members lainnya (function atau properties di body)*/

/*
* @Target = Membritahu annotation dapat digunakan dimana? Class, function, properties, dll
* @Retention = Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibacah oleh reflection
* @Repeatable = Memberitahu annotation apakah bisa digunakan lebih dari sekali di target yang sma
* @MustBeDocumented = Memberitahu anno apakah perlu didokumentasikan di public API*/

@Target(AnnotationTarget.CLASS)  // this anno can be used in class
@Retention(AnnotationRetention.RUNTIME)  // the result can be read by reflection
@MustBeDocumented
annotation class Fancy(val author: String)

@Fancy(author = "Ghufron")
class Application(val name: String, val version: Int){
    fun info(): String = "Application $name-$version"
}


fun main() {
    val anno = Application("Java", 1)
    println(anno.info())
}