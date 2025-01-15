package `2_ObjectOrientedProgramming`._67_AbstractPropertiesAndFunct

abstract class Animal {
    // if we declared abstract fun or prop, we must to inherit it to the child class to using all of those abstract fun or prop
    abstract val name: String // this abstract prop cant be initialized
    abstract fun run()

}
class Cat : Animal(){
    override val name: String = "Cat"
    override fun run() {
        println("Cat run!")
    }
    //by making this abstract things, we forced their inherit class to implement all the abstract things that their parent had
}