package A2_ObjectOrientedProgramming._74_DataClass

/* 1. Data Class
* class yang hanya digunakan untuk representasi dari data
* Data Class merupakan class yang secara otomatis akan membuatkan function equals,
HashCode, toString, dan copy dari semua properties yang terdapat di primary
constructors yang dimiliki oleh data class  */

// data class
data class ProductDataClass (val name: String,
                        val price: Int,
                        val category: String)

fun main() {
    val product = ProductDataClass("Avanza", 250_000_000, "Car")
    println(product) //it'll print = ProductDataClass(name=Avanza, price=250000000, category=Car)
    // instead of = ObjectOrientedProgramming2._74_DataClass.ProductDataClass@5b6f7412
    // its called copy function
    println(product.toString())
    println(product.hashCode())
    //equal fun
    val product2 = ProductDataClass("Avanza", 250_000_000, "Car")
    val product3 = ProductDataClass("Mie Indomie", 2_500, "Food")
    println(product.equals(product2))
    println(product.equals(product3))

    /* 2. Function 'Copy' in Data Class
    * = Untuk menduplikasi object
    * = Bahkan metode copy yang terdapat di data class bisa digunakan untuk menduplikasi sekaligus mengubah propertiesnya*/

    val productCopy = product.copy()
    println(productCopy)

    val productCopyChangeProp = product3.copy(name = "Mie Sedapp")
    println(productCopyChangeProp)

}