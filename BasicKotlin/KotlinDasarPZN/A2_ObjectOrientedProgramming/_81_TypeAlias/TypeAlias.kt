package `2_ObjectOrientedProgramming`._81_TypeAlias

/* 1. Type Alias
* Merupakan membuat nama berbeda dari tipe data yang telah ada
* Biasanya ini digunakan ketika ada tipe data dengan nama yang sama, atau untuk mempersingkat
tipe data sehingga kita tidak perlu menulisnya terlalu panjang*/

// normal class
class Student(val name: String, val nilai: Int){
    fun sayHello(){
        println("Hello, my name is ${this.name}")
    }
}

// type alias class that will simplify and copying from class student and inherit all of their fields
typealias Pelajar = Student
// we can also make type aliasing from type alias object
typealias Murid = Pelajar

/* 2. Type Alias untuk Function
* Type alias juga dapat digunakan untuk function
* Dengan menggunakannya untuk function, kita akan lebig mudah saat menggunakan function
sebagai parameter, karena lebih sederhana */

typealias StringSupplier = () -> String

fun sayHelloStringSuplier(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

// when not using typeAlias for function
/*fun sayHelloNotUse(supplier: () -> String){
    println("Hello ${supplier()}")
}*/

fun main() {
    val student = Student("Hylda", 98)
    student.sayHello()
    val pelajar = Pelajar("Ghufron", 78)
    pelajar.sayHello()
    val murid = Murid("Bagaskara", 98)
    murid.sayHello()

}
