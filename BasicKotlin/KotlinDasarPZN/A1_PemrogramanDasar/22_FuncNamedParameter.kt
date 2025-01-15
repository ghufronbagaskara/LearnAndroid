fun fullName(firstName: String,
             middleName:String,
             lastName: String){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName(firstName = "Azzachra",
            middleName = "Hyllda",
            lastName = "Putri")

    fullName(firstName = "Ghufron", middleName = "Bagaskara", lastName = "")
}