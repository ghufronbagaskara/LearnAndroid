package A2_ObjectOrientedProgramming._49_Constructors

class Person (firstNameParam: String,
              middleNameParam: String,
              lastNameParam: String = "Bagaskara"){

    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam

}