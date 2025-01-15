package `2_ObjectOrientedProgramming`._65_HashCodeFunction

/*
- HashCode adalah  funct yang digunakan sebagai representasi angka unit untuk objek yang kita buat
- Funtion hashCode berguna saat kita ingin mengkonversi objek kita menjadi angka
- Salah satu penggunaan hashCode yang banyak dilakukan adalah di struktur data, misal untuk
 memastikan tidak ada data duplicate, agar lebih mudah, di cek nilai hashCode nya, jika hashCode sama,
 maka dianggap objectnya sama */

fun main() {
    val company1 = CompanyHashCodeFunc("Ghufron")
    val company2 = CompanyHashCodeFunc("Ghufron")
    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode()) // by default, it'll result false, then we can override it to make it true
    // with this override, the hashcode from each object will automatically same


}