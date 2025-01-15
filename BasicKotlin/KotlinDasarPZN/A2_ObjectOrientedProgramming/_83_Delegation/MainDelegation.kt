package `2_ObjectOrientedProgramming`._83_Delegation

/* 1. Delegation
* Merupakan design pattern
* Sederhananya delegeation adalah meneruskan properties atau function ke object yang lain
* Kotlin mendukung delegation tanpa harus membuat kode secara manual*/

interface Base{
    fun sayHello(name: String)
    fun sayGoodBye(name : String)
}

class MyBase : Base {
    override fun sayHello(name: String){
        println("Hello $name")
    }
    override fun sayGoodBye(name: String) {
        println("Goodbye . . .  $name")
    }
}

// manual delegation
class ManualDelegation(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
    override fun sayGoodBye(name: String) {
        println("Goodbye... $name")
    }
}

//auto delegation
class AutoDelegation(val base: Base):  Base by base{ //-> it'll copy all the body from base class
    // we also can to add the new body to this auto delegation class and override the new delegate fun like sayHello and sayGoodbye
    //
    fun sayHi(name: String){
        println("Hii $name")
    }
}


//Driver Code
fun main() {
    val base = MyBase()
    base.sayHello("Ghufron")
    base.sayGoodBye("Ghufron")

    val manualDelegation = ManualDelegation(base)
    manualDelegation.sayHello("Hylda")
    manualDelegation.sayGoodBye("Azzachra")

    // auto delegation
    val autoDelegation = AutoDelegation(base)
    autoDelegation.sayHello("Hylda")
    autoDelegation.sayGoodBye("Azzachra")
    autoDelegation.sayHi("Bagaskara")

}