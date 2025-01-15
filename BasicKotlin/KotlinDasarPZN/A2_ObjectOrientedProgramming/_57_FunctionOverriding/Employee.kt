package A2_ObjectOrientedProgramming._57_FunctionOverriding

// for override some method or inheritence some class, we need to open the class or func first so it makes them public
open class Employee (var name: String) {
    open fun sayHello(name: String){
        println("Hello $name, Iam the Employee and my name is ${this.name}")
    }
}

// child class 1
class Manager(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, Iam the Manager and my name is ${this.name}")
    }
}

// child class 2
class President(name: String) : Employee(name){
    override fun sayHello(name: String){
        println("Hello $name, Iam the VicePresident and my name is ${this.name}")
    }
}