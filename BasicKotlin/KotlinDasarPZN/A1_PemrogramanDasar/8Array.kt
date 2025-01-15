fun main() {
    // Array / Larik
    // Di kotlin array hanya dapat menyimpan data yang sama, sama seperti di java
    val members: Array<String> = arrayOf("Ghufron", "Azzachra", "Hylda")
    val values: Array<Byte> = arrayOf(100, 95, 80)
    val balances: Array<Int> = arrayOf(10_000, 92_000, 100_000)

    println(members)

    // Array Opperation
    //1. size
    println(values.size)

    //2. get(index) atau [index] -> mendapatkan data index ke
    println("ini adalah data balances ${balances.get(0)}, ${balances[1]}, " + balances.get(2))

    //3. set(index, value) -> mengubah data index
    members.set(0, "Bagaskara")
    println(members[0])

    //4. [index] = value  -> mengubah data index
    members[0] = "Ghufron"
    println(members[0])

    // DECLARE ARRAY NULLABLE
    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "Ghufron")
    names.set(1, null)
    names.set(2, "Hylda")
    names.set(3, null)
    names.set(4, "Bagaskara")
    println(names.size)


}