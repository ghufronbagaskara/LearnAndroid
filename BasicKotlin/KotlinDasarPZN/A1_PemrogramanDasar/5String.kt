fun main() {
    var myName: String = "Ghufron Bagaskara"

    var address: String = """
        Jl pegadaian no 124, 
        Kalisalam, Dringu
        Kabupaten Probolinggo
    """
    var address2: String = """
        Jl pegadaian no 124, 
        Kalisalam, Dringu
        Kabupaten Probolinggo
    """.trimIndent()
    var address3: String = """
        Jl pegadaian no 124, 
        Kalisalam, Dringu
        Kabupaten Probolinggo
    """.trimMargin(">")
    println(myName)
    println(address)
    println(address2)
    println(address3)

    // Combine String
    var firstName : String = "Ghufron"
    var lastName : String = "Bagaskara"
    var fullName :  String = firstName + " " + lastName
    var fullName2 : String = "$firstName $lastName"  //String concatenation feature from kotlin
    // fullName length
    var desc: String = "total $fullName char = ${fullName.length}"
    println(fullName)
    println(fullName2)
    println(desc)


}
