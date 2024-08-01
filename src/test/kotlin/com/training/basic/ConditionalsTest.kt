package com.training.basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import com.training.utils.GlobalUtils.printOutput

class ConditionalsTest {

    @Test
    fun `test executeIfElse case 1`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val input1 = 1
            val input2 = 2
            val expected = "$input1 smaller than $input2"
            Conditionals.executeIfElse(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test executeIfElse case 2`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val input1 = 2
            val input2 = 1
            val expected = "$input1 bigger than $input2"
            Conditionals.executeIfElse(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test executeIfElse case 3`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val input1 = 1
            val input2 = 1
            val expected = "$input1 equals $input2"
            Conditionals.executeIfElse(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }



    @Test
    fun `test executeWhen case 1`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val input1 = 1
            val input2 = 2
            val expected = "$input1 smaller than $input2"
            Conditionals.executeWhen(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test executeWhen case 2`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val input1 = 2
            val input2 = 1
            val expected = "$input1 bigger than $input2"
            Conditionals.executeWhen(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test executeWhen case 3`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val input1 = 1
            val input2 = 1
            val expected = "$input1 equals $input2"
            Conditionals.executeWhen(input1, input2)

            assertEquals(expected, outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }
}