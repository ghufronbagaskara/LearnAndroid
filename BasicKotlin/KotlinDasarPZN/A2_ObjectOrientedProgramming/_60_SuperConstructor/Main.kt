package `2_ObjectOrientedProgramming`._60_SuperConstructor

fun main() {
    val premiumCustomer = PremiumCustomer("ghufron")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("hylda", 10_000_000)
}