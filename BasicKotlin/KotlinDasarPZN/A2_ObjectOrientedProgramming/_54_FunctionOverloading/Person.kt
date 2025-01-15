package A2_ObjectOrientedProgramming._54_FunctionOverloading

class Person (var firstName: String, var lastName: String) {

    constructor(firstName: String): this (firstName, "")

    // method 1
    fun sayHello(name: String){
        if (this.lastName == ""){
            println("hello $name, my name is ${this.firstName}")
        }else{
            println("hello $name, my name is ${this.firstName} ${this.lastName}")
        }
    }

    // method 2 (overload)
    fun sayHello(firstName: String, lastName: String){
        if (this.lastName == ""){
            println("hello $firstName, my name is ${this.firstName}")
        }else{
            println("hello $firstName $lastName, my name is ${this.firstName} ${this.lastName}")
        }
    }


}