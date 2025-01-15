package `2_ObjectOrientedProgramming`._76_InnerClass

/* 1. Inner Class
* Kita dapat membuat class didalam class
* Namun meskipun terdapat didalamnya, innerClass tidak dapat mengambil data outerClass nya
* Agar dapat mengaksesnya, kita dapat menggunakan kata kunci inner*/

class Bos(val name: String){
    inner class Employee(val name: String){
        fun hi(){
            println("Hi, my name is ${this.name}, and my boss name is ${this@Bos.name}")
        }
    }

}


fun main() {
    val bos = Bos("Ghufron")
    // val employee = Bos.Employee("Hylda") // this is how u declare if Employee not use inner word in their declaration
    val employee = bos.Employee("Hylda")
    employee.hi()
}