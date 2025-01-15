package A2_ObjectOrientedProgramming._53_Function

class Person (var firstName: String, var lastName: String){

    fun sayHello(name: String){
        println("Hello $name, my name is $firstName $lastName")
    }

    fun getFullName(): String{
        return "$firstName $lastName"
    }
}