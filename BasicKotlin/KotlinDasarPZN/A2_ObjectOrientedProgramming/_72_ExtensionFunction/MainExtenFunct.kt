package A2_ObjectOrientedProgramming._72_ExtensionFunction

/* 1. Extension Function -> Helper Funtion
* Menambahkan function [ada tipe data yang sudah ada*/

/* 2. Extension Bukanlah Funtion di Class
*  Perlu diperhatikan, bahwa saat membuat extension function, kita tidak dmemodifikasi class aslinya
* Extension function hanyalah sebuah function bantuan yang artinya, kita tidak bisa mengakses data private
atau protected dari class tersebut*/


fun main() {
    val ghufron = Student("Ghufron", 20)
    ghufron.sayHello("Hylda")
    ghufron.sayHi("Azzachra")

}