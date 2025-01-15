package `2_ObjectOrientedProgramming`._70_Interface

interface Interaction {
    val name: String  // this prop cant be init when in interface class
    fun sayHello(name: String)  //if this abstract funct has a body, then we dont need to everride it in their child class
}

class Human(override val name: String) : Interaction{
    override fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }

}

// Multiple Inheritance with interface class
interface Go : Interaction {  // interfce dapat di inherit satu sama lain
    fun go(){
        println("Go!")
    }
}

open class Contoh()

// we can extend normal class in it, but cant if there more than two
class HumanMultipleInherit(override val name: String) : Contoh(), Interaction, Go{
    override fun sayHello(name:String){
        println("Hello $name, my name is ${this.name}")
    }
}

/* 5. Konflik di interface*/

interface MoveA{
    fun move(){
        println("Move A")
    }
}
interface MoveB{
    fun move(){
        println("Move B")
    }
}
class HumanConflict : MoveA, MoveB{  // dikarenakan terdaopat fungsi dengan param sama, maka kita harus override func tersebut
   override fun move(){
       println("Move Human") // 1. untuk membuat perintah sendiri
       super<MoveA>.move() // 2. untuk memanggil func yang ada di A
       super<MoveB>.move() // 3. untuk memanggil func yang ada di B

   }
}
