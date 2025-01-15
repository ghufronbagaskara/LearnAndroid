package `2_ObjectOrientedProgramming`._85_ObservableProperties

import kotlin.properties.Delegates

/* 1. Observable Properties
* Merupakan standar liberry yang disediakan kotlin untuk delegating di properties
* Dengan observable properties, kita bisa tahu properties, value sebelum dan value setelah ketikan diubah*/

class ObservableProperties(name : String = "") {
    var name: String by Delegates.observable(name){
        property, oldValue, newValue ->
            println("${property.name} changed from $oldValue to $newValue")
    }
}

fun main() {
    var account = ObservableProperties()

    account.name = "Contoh" //the command block code will auto pop up when the properties were changed
    account.name = "Diubah"
    account.name = "Ghufron"
}