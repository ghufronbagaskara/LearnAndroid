package A2_ObjectOrientedProgramming._91_AnnotationTarget

/* 1. Annotation Target
* Kotlin Annotation berjalan baik di Java Annotation, dan begitu pula sebaliknya
* Namun kadang kita ingin menempatkan posisi annotation sesuai dengan yang kita mau
agar bisa terbaca di Java dengan baik
* Biasanya kejadian ini terjadi ketika kita menggunakn Kotin, namun menggunakan framework
Java, sehingga target lokasi Annotation nya harus sesuai dengan yang biasa digunakan framework
tersebut di Java
* Di kotlin kita bisa menggunakan @targe:NamaAnnotation nya untuk menentukan lokasi target
Annotation akan ditempatkan dimana*/

@Target(
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class ExampleTarget(
    @field:Beta val firstname: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)