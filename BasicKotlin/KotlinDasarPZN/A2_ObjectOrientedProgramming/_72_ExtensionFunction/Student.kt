package A2_ObjectOrientedProgramming._72_ExtensionFunction

class Student(val name: String, val age: Int)
//exten function, this funct cannot take protected or private data from inside the class (Study)
fun Student.sayHello(name: String) : Unit{
    println("Hello $name, my name is ${this.name} and I'am ${this.age} years old")
}

//nullable extension function
fun Student?.sayHi(name: String){
    if (this != null){
        println("Hi $name, my name is ${this.name} and I'am ${this.age} years old")

    }
}