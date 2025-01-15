package A2_ObjectOrientedProgramming._86_DestructuringDeclaration

/*1. Destrutcturing Declaration
* Adalah membaut multiple variables dari sebuah object
* Destructuring tidak bisa dilakukan untuk semua object, hanya objek yang memiliki
function componentX()-> (komponen 1,2 dst) yang bisa dilakukan destructuring
* Saat kita membuat data class, secata otomatis akan dibuatkan function componentX() sesuai
dengan jumlah parameter nya*/

    /* 2. Destructuring di Funtion
    * Dengan ini, seakan - akan  bisa mengambalikan multiple return value pada function*/

class GameNormalDeclaration(val name1: String, val price1: Int){
    operator fun component1(): String = name1
    operator fun component2(): Int = price1
}
data class Game(val name: String, val price: Int)


    /* 2. Destructuring di Funtion
    * Dengan ini, seakan - akan kita bisa mengambalikan multiple return value pada function*/
data class MinMax(val min: Int,val max: Int)

fun minMax(value1: Int, value2: Int) : MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}
    /*3. Destructuring Lambda Parameter
    * Destructuring ini juga dapat dilakukan di lambda parameter
    * Hal ini dapat mempermudah kita saat ingin mengakses data yang ada di parameter*/

data class Login(val user: String, val pass: String)
typealias LoginCallback = (Login) -> Boolean

fun login(login: Login, callback: (Login) -> Boolean) : Boolean {
    return callback(login)
}

fun main() {
    // normal declaration
    val normalDeclareGame = GameNormalDeclaration("Basara", 10_000)
    val (name1, price1) = normalDeclareGame
    println(name1)
    println(normalDeclareGame)

    // destructuring declaration
    val game = Game("Zelda", 500_000)
    val (name, price) = game //
    println(name)
    println(game)

    // destructuring function
//    val result = minMax(100, 10)
//    val min = result.min
//    val max = result.max
    // we can short it into these ->
    val (min, max) = minMax(100, 10)
    println(min)
    println(max)
    // if we don't need one of the variable, we can change it with underscore (_)
    val (min2, _) = minMax(99999, -10)
    println(min2)

    // destructing lambda parameter
    val request = Login("Ghufron", "rahasia")
//    login(login){ login ->
//        login.user == "Ghufron" && login.pass == "rahasia"
//    } // we can short it into
    login(request){(user, pass) ->
        user == "Ghufron" && pass == "rahasia"
    }
    println(request)


}