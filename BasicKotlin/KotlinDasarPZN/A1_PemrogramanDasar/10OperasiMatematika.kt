fun main(){
    var ops1 : Int = 10/3
    println(ops1)
    var ops1_1 = 10.0 / 3.0
    println(ops1_1)

    var ops2 : Int = 10 + 10 / 3
    println(ops2)
    var ops2_2 = 10 + 10 / 3.0  //dengan menambahkan titik dan 0 dan tidak menentukan hasil dari variabel, maka akan menghitung sesuai operasi double
    println(ops2_2)

    var number = 9
    var number2 = 10
    var total = 0
    total += number + number2
    println(total)

    total++
    println(total)

    var sehat = true
    println(sehat)
    sehat = !sehat
    println(sehat)



}