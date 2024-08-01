package com.training.basic

object DataTypes {

    fun execute(input: String?) {
        if (input != null) {
            val length = input.length
            val upperCase = input.uppercase()
            val reversed = input.reversed()
            println("String: $input, Length: $length, Uppercase: $upperCase, Reversed: $reversed")
        } else {
            println("Input String is null")
        }
    }

    fun execute(input: Char?) {
        if (input != null) {
            val isDigit = input.isDigit()
            val isLetter = input.isLetter()
            val upperCase = input.uppercaseChar()
            println("Char: $input, isDigit: $isDigit, isLetter: $isLetter, Uppercase: $upperCase")
        } else {
            println("Input Char is null")
        }
    }

    fun execute(input1: Int?, input2: Int?) {
        if (input1 != null && input2 != null) {
            val sum = input1 + input2
            val difference = input1 - input2
            val product = input1 * input2
            val quotient = if (input2 != 0) input1 / input2 else "undefined"
            println("Int1: $input1, Int2: $input2, Sum: $sum, Difference: $difference, Product: $product, Quotient: $quotient")
        } else {
            println("One or both Int inputs are null")
        }
    }

    fun execute(input1: Short?, input2: Short?) {
        if (input1 != null && input2 != null) {
            val sum = (input1 + input2).toShort()
            val difference = (input1 - input2).toShort()
            val product = (input1 * input2).toShort()
            val quotient = if (input2 != 0.toShort()) (input1 / input2).toShort() else "undefined"
            println("Short1: $input1, Short2: $input2, Sum: $sum, Difference: $difference, Product: $product, Quotient: $quotient")
        } else {
            println("One or both Short inputs are null")
        }
    }


    fun execute(input1: Long?, input2: Long?) {
        if (input1 != null && input2 != null) {
            val sum = input1 + input2
            val difference = input1 - input2
            val product = input1 * input2.toLong()
            val quotient = if (input2 != 0.toLong()) (input1 / input2) else "undefined"
            println("Long: $input1, Long: $input2, Sum: $sum, Difference: $difference, Product: $product, Quotient: $quotient")
        } else {
            println("One or both Long inputs are null")
        }
    }

    fun execute(input1: Float?, input2: Float?) {
        if (input1 != null && input2 != null) {
            val sum = input1 + input2
            val difference = input1 - input2
            val product = input1 * input2
            val quotient = if (input2 != 0f) input1 / input2 else "undefined"
            println("Float1: $input1, Float2: $input2, Sum: $sum, Difference: $difference, Product: $product, Quotient: $quotient")
        } else {
            println("One or both Float inputs are null")
        }
    }

    fun execute(input1: Double?, input2: Double?) {
        //TODO: Uncomment lines below and do the operations
        if (input1 != null && input2 != null) {
//            val sum =
//            val difference =
//            val product =
//            val quotient =
//            println("Double: $input1, Double: $input2, Sum: $sum, Difference: $difference, Product: $product, Quotient: $quotient")
        } else {
            println("One or both Double inputs are null")
        }
    }

    fun execute(input1: Byte?, input2: Byte?) {
        if (input1 != null && input2 != null) {
            val sum = (input1 + input2).toByte()
            val difference = (input1 - input2).toByte()
            val product = (input1 * input2).toByte()
            val quotient = if (input2 != 0.toByte()) (input1 / input2).toByte() else "undefined"
            println("Byte1: $input1, Byte2: $input2, Sum: $sum, Difference: $difference, Product: $product, Quotient: $quotient")
        } else {
            println("One or both Byte inputs are null")
        }
    }

    fun execute(input1: Boolean?, input2: Boolean?) {
        //TODO: Uncomment lines below and do the operations
        if (input1 != null && input2 != null) {
//            val and =
//            val or =
//            val xor =
//            println("Boolean1: $input1, Boolean2: $input2, AND: $and, OR: $or, XOR: $xor")
        } else {
            println("One or both Boolean inputs are null")
        }
    }
}