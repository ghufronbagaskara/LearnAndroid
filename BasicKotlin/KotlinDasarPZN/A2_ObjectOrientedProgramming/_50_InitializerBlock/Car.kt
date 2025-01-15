package A2_ObjectOrientedProgramming._50_InitializerBlock

class Car (paramBrand: String, paramYear: Int){
    var brand = paramBrand
    var year = paramYear

    init {
        println("Ini adalah Init Block")
        println("this $brand was made in $year ")
    }
}