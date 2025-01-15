package A2_ObjectOrientedProgramming._69_LateInitializedProperties

class Television {

    lateinit var brand: String

    fun initTelevision(brand: String){
        this.brand = brand
    }
}