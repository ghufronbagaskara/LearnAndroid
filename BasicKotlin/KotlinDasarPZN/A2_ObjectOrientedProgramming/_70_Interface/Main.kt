package A2_ObjectOrientedProgramming._70_Interface

/* 1.
* Type tidak hanya dalam bentuk class
* Interface adalah blueprint, prototype atau cetakan di kotlin
* Berbeda dengan Class, Inteface tidak bisa lansung dibuat menjadi Object
* Interfce hanya bisa diturunkan, dan biasanya Interface digunakan sebagai kontrak untuk class" turunannya
* Secara standar, semua properties dan function di Interface adalah abstract*/

/* 2. Concrete Function di Interface
* Function di Interface memiliki pengecualian, tidak harus abstract
* Kita bisa membuat concrete function di
* Interface, artinya function tersebut tidak wajib untuk dibuat ulang di child Class nya
* -> Dengan kita mendeklarasikan func di abstract class, maka kita tidak perlu meng override nya dalam child class nya*/

/* 3. Multiple Inheritance dengan Interface
* Inheritance di Class hanya boleh memiliki satu class Parent
* Di Interface, sebuah class Child bisa memilki banyak interface Parent*/


/* 4. Inheritance antar Interface
* Tidak hanya Class yang pnya kemampuan Inheritance
* Interface juga bisa melakukan Inheritance dengan Interface lain
* Namun Interface tidak bisa melakukan Inheritance dengan Class*/

fun main() {
    val human = Human("Ghufron")
    human.sayHello("Hylda")

    val humanConflict = HumanConflict()
    humanConflict.move()
}