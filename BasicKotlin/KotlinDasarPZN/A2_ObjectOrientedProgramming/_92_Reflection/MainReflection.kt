package `2_ObjectOrientedProgrammin`._92_Reflection

import A2_ObjectOrientedProgramming._89_Exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

/* 1. Reflection
* Merupakan kemampuan melihat struktur aplikasi kita pada saat berjalan
* Reflection biasanya sangat berguna saat kita ingin membuar library ataupun framework,
sehingga bisa meng-otomasi pekerjaan
* Untuk mengakses reflection vlass dari sebuah object, kita bisa menggunakan kata
kunci ::class, atau bisa langsung dari NamaClass::class*/

data class CreateProductRequest(
    val id: String,
    val name: String,
    val price: Long
)

data class CreateCategoryRequest(
    val id: String,
    val name: String
)

fun validateRequest(request: CreateProductRequest){
    if (request.id == ""){
        throw ValidationException("id is blank")
    }else if (request.name == ""){
        throw ValidationException("id is blank")
    }
}
// the automation from the code above
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class NotBlank

data class CreateProductRequestAutomation(
    @NotBlank val id: String,
    @NotBlank val name: String,
    val price: Long
)

fun validateRequest(request: CreateProductRequestAutomation){
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate satu-satu, lalu cek kali ada annotation @NotBlank
    for (property in properties){
        if (property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            when(value){
                is String -> {
                    if("" == value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}


fun main() {
    val request = CreateProductRequestAutomation("1", "",2000)
    println(request)
}