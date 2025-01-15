package A2_ObjectOrientedProgramming._51_SecondaryConstructor

class CarNonPrimaryConst {
    var name: String = ""
    var brand: String = ""
    var year: Int = -1

    constructor(name: String, brand: String, year: Int){
        this.name = name
        this.brand = brand
        this.year = year
    }

    constructor(name: String, brand: String){
        this.name = name
        this.brand = brand
    }


}