package A2_ObjectOrientedProgramming._64_EqualsFunction

// when we use == or != operation, we'll use fun equals from class Any
// to change this equals function, we can override the equals() function



fun main() {
    val company1 = CompanyEqualsFunc("Ghufron")
    val company2 = CompanyEqualsFunc("Ghufron")
    println(company1 == company2)  // by default it will result false, so then we can override it to make the result true
    // after the override, it will make the result true


}