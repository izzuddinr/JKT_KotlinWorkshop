package com.training.basic

import com.training.utils.GlobalUtils.printOutput
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class DataTypesTest {

    @Test
    fun `test execute String`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "String: TEST STRING, Length: 11, Uppercase: TEST STRING, Reversed: GNIRTS TSET"
            DataTypes.execute("TEST STRING")

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null String`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Input String is null"
            val input: String? = null
            DataTypes.execute(input)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Char '1'`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Char: 1, isDigit: true, isLetter: false, Uppercase: 1"
            DataTypes.execute('1')

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Char 'c'`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Char: c, isDigit: false, isLetter: true, Uppercase: C"
            DataTypes.execute('c')

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null Char`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Input Char is null"
            val input: Char? = null
            DataTypes.execute(input)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Int`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Int1: 1, Int2: 2, Sum: 3, Difference: -1, Product: 2, Quotient: 0"
            val input1 = 1
            val input2 = 2
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null Int`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "One or both Int inputs are null"
            val input1: Int? = null
            val input2: Int? = null
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Short`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Short1: 1, Short2: 2, Sum: 3, Difference: -1, Product: 2, Quotient: 0"
            val input1: Short = 1
            val input2: Short = 2
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null Short`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "One or both Short inputs are null"
            val input1: Short? = null
            val input2: Short? = null
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Long`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Long: 1, Long: 2, Sum: 3, Difference: -1, Product: 2, Quotient: 0"
            val input1 = 1L
            val input2 = 2L
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null Long`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "One or both Long inputs are null"
            val input1: Long? = null
            val input2: Long? = null
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Float`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Float1: 1.0, Float2: 2.0, Sum: 3.0, Difference: -1.0, Product: 2.0, Quotient: 0.5"
            val input1 = 1F
            val input2 = 2F
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null Float`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "One or both Float inputs are null"
            val input1: Float? = null
            val input2: Float? = null
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Double`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Double: 1.0, Double: 2.0, Sum: 3.0, Difference: -1.0, Product: 2.0, Quotient: 0.5"
            val input1 = 1.0
            val input2 = 2.0
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null Double`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "One or both Double inputs are null"
            val input1: Double? = null
            val input2: Double? = null
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Byte`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Byte1: 1, Byte2: 2, Sum: 3, Difference: -1, Product: 2, Quotient: 0"
            val input1:Byte = 1
            val input2:Byte = 2
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null Byte`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "One or both Byte inputs are null"
            val input1: Byte? = null
            val input2: Byte? = null
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute Boolean`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "Boolean1: true, Boolean2: false, AND: false, OR: true, XOR: true"
            val input1 = true
            val input2 = false
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute null Boolean`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val expected = "One or both Boolean inputs are null"
            val input1: Boolean? = null
            val input2: Boolean? = null
            DataTypes.execute(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }
}