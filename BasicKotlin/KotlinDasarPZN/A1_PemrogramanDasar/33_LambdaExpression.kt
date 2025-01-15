// Lambda Exp = func that doesn't have a name, we can make it without describe the function

// 1. membuat lambda 1
val lambdaName: (String) -> String = { value: String ->
    value.toUpperCase()
}
// membuat lambda 2
val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
    val result = "Nama = $firstName(nama depan) $lastName(nama belakang)"
    result // dengan lambda kita tidak perlu lagi menambhakan return untuk mengembalikan nilai
}

// 2. lambda dengan menggunakan code it
val sayHello: (String) -> String = { // tidak perlu menuliskan parameter kembalian
    "Hello ${it.uppercase()}" // cukup menggunakan it, namun ini khusus jika kode memiliki satu paramter
}

// 3. Method References = membuat
// func pertama yang akan dijadikan referensi
fun buatKapital(value: String): String = value.uppercase()
// func yang akan menggunakan fungsi sebelumnya
val lambdaReference: (String) -> String = ::buatKapital  //func ini akan mengambil referensi sesuai fungsi sebelumnya



fun main() {
    //1. eksekusi lambda 1
    println(lambdaName("Ghufron Bagaskara"))
    //eksekusi lambda 2
    println(contohLambda("Azzachra", "Hylda"))

    // 2.   eksekusi lambda it
    println(sayHello("Ghufron"))

    // 3. eksekusi Method Reference
    println(lambdaReference("bagaskara"))
}