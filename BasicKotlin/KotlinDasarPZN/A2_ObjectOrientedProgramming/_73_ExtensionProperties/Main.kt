package `2_ObjectOrientedProgramming`._73_ExtensionProperties

/*1. Extension Properties
* Selain function, kita juga bisa membuat extension untuk properties
* Untuk membuat extens prop, kita bisa membuat prop dengan Getter atau Setter*/
fun main() {
    val student = StudentExtProp("Ghufron", 20)
    println(student.uppername)  // if the Student class is nullable, then we need to add ? in after the param student class
    println(student.name)
    student.setNameUpper(student.name)
    println(student.name)
}