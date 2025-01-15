package `2_ObjectOrientedProgrammin`._51_SecondaryConstructor

class Person (firstNameParam: String,  // <- this is the primary const
            middleNameParam: String?,
            lastNameParam: String) {
    // if we have the prim const, we can auto input data like these
    var firstName = firstNameParam
    var middleName = middleNameParam
    var lastName = lastNameParam

    // init block
    init {
        println("This is primary constructor")
    }

    // this is the secondary const 1
    constructor(firstNameParam: String, lastNameParam: String) : this(firstNameParam, null, lastNameParam) {
                // this space named body, we can choose to make it or not
                // we can use this space to be init block
                // it makes the sec constructor more flexible
            println("Secondary Constructor 1")
            }

    // this is the secondary const 2
    constructor(firstNameParam: String) : this("", "") {
        println("Secondary Constructor 2")
    }
}