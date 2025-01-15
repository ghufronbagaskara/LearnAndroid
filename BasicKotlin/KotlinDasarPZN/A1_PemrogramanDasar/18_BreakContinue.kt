fun main() {
    /*WHILE = Perulangan yang lebih bebas dari FOR*/

    var i = 0
    while (true){
        println("Break iterasi ke-$i")
        i++
        if(i==10){
            break
        }
    }

    i = 0
    while (true){
        println("Continue iterasi ke-$i")
        i++
        if(i==10){
            continue
        }
        if(i==15){
            break
        }
    }

    println("Iterasi selesai")


}