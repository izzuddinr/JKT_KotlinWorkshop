package com.training.basic

private var globalName: String? = null

fun main() {
//    val name: String = null -> error
    val amount: Int? = null
    val surcharge = null
    val lastName: String? = null
    if (lastName != null) {
        println(lastName.length)
    } else {
        println("Last name is null")
    }

    // safe calls operator (.?)
    println(lastName?.length)
    val lastNameLength = lastName?.length

    // non-null assertion
    println(lastName!!.length)
    if (globalName != null) {
        println(globalName!!.length) //-> don't use this
    }
    //instead, use this
    globalName?.let {
        println(it)
    }

    // elvis operator (?:)
    println(lastName?.length ?: "Last name is null")
    val notNullLastNameLength = lastName?.length ?: 0
}