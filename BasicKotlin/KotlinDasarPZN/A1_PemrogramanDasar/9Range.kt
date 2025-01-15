fun main(){
    // Range
    // tidak dapat diakses data nya satu per satu, karena peruntukan range untuk perulangan
    val range = 1..100
    println(range)

    val range2 = 1..100 step 2
    println(range2.last)

    // Range Operation
    //1. count() -> mendapatkan total data
    println(range.count())
    //2. contains(value) -> cek apakah terdapat value tersebut
    println(range.contains(50))
    println(range.contains(200))
    //3. first -> mendapatkan nilai pertama
    println(range.first)
    //4. last  -> mendapatkan nilai pertama
    println(range.last)
    //5. step  -> mendapatkan nilai tiap kenaikan
    println(range.step)

    // 2. OPPOSSITE RANGE
    val oppsRange = 100 downTo 1
    val oppsRange2 = 100 downTo 1 step 3

}