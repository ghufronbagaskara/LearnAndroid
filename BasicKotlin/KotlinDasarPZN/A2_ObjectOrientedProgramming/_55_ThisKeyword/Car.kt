package A2_ObjectOrientedProgramming._55_ThisKeyword

class Car (var brand:String, var year: Int) {

    // with this keyword, it would make refer to the object not to the param
    fun brandVersus(brand: String){
        println("Brand Versus -> $brand vs ${this.brand}")
    }
}