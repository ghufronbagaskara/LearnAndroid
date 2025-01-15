package A2_ObjectOrientedProgramming._64_EqualsFunction

class CompanyEqualsFunc (val name: String) {

    // override fun equals
    override fun equals(other: Any?): Boolean {
        return when(other){
            is CompanyEqualsFunc -> name == other.name
            else -> false
        }
    }


}