package A2_ObjectOrientedProgramming._65_HashCodeFunction

class CompanyHashCodeFunc (val name: String){

    // override fun hashCode
    override fun hashCode(): Int{
        return name.hashCode()
    }
}