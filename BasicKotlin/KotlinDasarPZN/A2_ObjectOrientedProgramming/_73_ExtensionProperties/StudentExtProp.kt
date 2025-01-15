package A2_ObjectOrientedProgramming._73_ExtensionProperties

class StudentExtProp (var name: String, var age: Int)


//getter -> Extension Properties
val StudentExtProp.uppername : String
    get() = this.name.uppercase()
//setter -> Extension Properties
fun StudentExtProp.setNameUpper(name: String){
    this.name = name.uppercase()
}