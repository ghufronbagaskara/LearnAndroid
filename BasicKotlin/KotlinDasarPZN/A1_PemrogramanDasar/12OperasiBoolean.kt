fun main() {
    val finalExam = 79
    val attendant = 90
    val extra = 95

    val passFinalExam = finalExam > 80
    val passAttendant = attendant > 80
    val passExtra = extra > 80


    val pass = passFinalExam && passAttendant && passExtra
    println("Is it Budi pass the final exam : $pass")
}