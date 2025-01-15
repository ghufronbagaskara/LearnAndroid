package A2_ObjectOrientedProgramming._78_EnumClass

/* 1. Enum Class
* Merupakan representasi dari class yagn sudah tetap nilainya
* Biasanya class ini digunakan untuk data yang sudah baku, seperti jenis kelamin, arah mata angin, dll
* Untuk membuatnya kita perlu membuat kata kunci enum
* Kita tidak bisa membuat object dari class enum, namun kita bisa mendeklarasikan
langsung object yagn tersedia untuk enum class tersebut*/

/* 2. Prop and Funct in Enum Class
* EnumClass dapat memiliki prop atau funct
* Namun jika propertiesnya di set menggunakan constructors, maka saat pembuatan object enum,
wajib diisi, dan jika terdapat abstract function, wajib di override pada saat pembuatan object enum*/


enum class Gender(val desc: String){
    MALE("Male"),
    FEMALE("Female");

    fun printDesc(){
        println(desc)
    }
}


fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")
    println(man)
    println(woman)
    println(allGenders)
    println(allGenders.toList())

    man.printDesc()
    woman.printDesc()
}