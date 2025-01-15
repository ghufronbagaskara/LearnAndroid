fun main() {

    /*FOR = untuk perulangan array dan range*/

    /* 1. FOR dengan Array*/
    /*Tipe Pertama*/
    val names = arrayOf("Ghufron", "Bagaskara", "Hylda", "Azzachra", "Putri")
    var totalPerulangan = 0

    for (name in names){ /* -> name merupakan variable yang imutable (tidak dapat diubah)*/
        println(name)
        totalPerulangan++
    }
    println("Total perulangan : $totalPerulangan")

    /*Tipe Kedua*/
    val arrLength = names.size - 1
    for (i in 0..arrLength){
        println("Names $i = ${names.get(i)}")
    }

    /* 2. FOR dengan Range*/
    for(value in 0..10){
        println(value)
    }

    for (value in 1000 downTo 0 step 5){
        println(value)
    }


}