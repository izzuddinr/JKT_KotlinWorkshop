package com.training.basic

fun main() {
    // this is also called lambda
    //val countTotalAmount2 = { purchaseAmount: Int, surchargePercentage: Double ->
    val countTotalAmount2: (Int, Double) -> Double = { purchaseAmount, surchargePercentage ->
        val totalSurcharge = purchaseAmount * surchargePercentage / 100
        val totalAmount = purchaseAmount + totalSurcharge
        println("countTotalAmount2: $totalAmount")
        purchaseAmount + totalSurcharge
    }

    showAll()

    val sumNumber = sumNumber(1, 2, 3, 4, 5)
    println(sumNumber)
    login("csaleky")
    logAnything(sumNumber)

    countTotalAmount(100, 15.0)
    countTotalAmount(purchaseAmount = 100, 15.0)
    countTotalAmount(surchargePercentage = 15.0, purchaseAmount = 100)
    val totalAmount = countTotalAmount2(100, 15.0)
    // val totalAmount2 = countTotalAmount2.invoke(100, 15.0)

    val fullName = getFullName("Christianto", "Saleky")
    sayMyName(fullName)

    doSomethingPrivate()

    println("Your total is ${totalAmount.addCurrency()}")

    // example of other existing extensions
    println(fullName.uppercase())
    println("123".toIntOrNull())
    val lastName: String? = null
    lastName?.let{
        println(it)
    } ?: println("Last name is null")
    val randomList = listOf<Any?>("Name", 10, "", null, 30L)
    randomList
        .filter { it != null }
        .also { println(it) }
        .filter { it is String }
        .also { println(it) }
        .getOrNull(0)
        .let {
            (it as? String)?.uppercase()
        }
        .also { println(it) }
}

// basic function
fun showAll() {
    println("showAll: now showing all")
}

// function with params
/**
 * Execute login
 *
 * @param username String unique username
 */
fun login(username: String) {
    println("login: $username")
}
fun sumNumber(vararg num: Int): Int {
    return num.sum()
}
fun logAnything(value: Any) {
    println("logAnything: $value")
    val valueTimesTwo = (value as? Int)?.times(2)
    println(valueTimesTwo)
    when(value) {
        is String -> println("Value is string")
        is Int -> println("Value is integer")
        is Boolean -> println("Value is boolean")
    }
}

// function with return type
fun countTotalAmount(purchaseAmount: Int, surchargePercentage: Double): Double {
    val totalSurcharge = purchaseAmount * surchargePercentage / 100
    val totalAmount = purchaseAmount + totalSurcharge
    println("countTotalAmount: ${totalAmount.addCurrency("IDR")}")
    return purchaseAmount + totalSurcharge
}
fun getFullName(firstName: String, lastName: String) = "$firstName $lastName"
fun sayMyName(fullName: String) = println("Your name is $fullName")

// function with defined visibility modifier
private fun doSomethingPrivate() {
    println("doing something in Functions.kt")
}

// extension function
fun Double.addCurrency(currencyCode: String = "IDR") = when(currencyCode) {
    "USD" -> "$$this"
    "EUR" -> "€$this"
    "GBP" -> "£$this"
    "JPY" -> "¥$this"
    "AUD" -> "A$$this"
    "CAD" -> "C$$this"
    "INR" -> "₹$this"
    "CNY" -> "¥$this"
    "IDR" -> "Rp$this"
    else -> this
}
