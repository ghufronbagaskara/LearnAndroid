package A2_ObjectOrientedProgramming._68_SetterGetter

// in kotlin we dont need to make it manually
fun main() {
    val note = Note("Kotlin Study")
    println(note.title)

    println()
    note.title = ""
    println(note.title)

    println()
    note.title = "Study Java prog lang"
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle) // override to make it capital getter
}