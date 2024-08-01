package com.training.basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import com.training.utils.GlobalUtils.printOutput

class HelloWorldTest {

    @Test
    fun `test execute`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            HelloWorld.execute()

            assertEquals("Hello, World!", outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `test execute with input`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            HelloWorld.execute("Ingenico")

            assertEquals("Hello, Ingenico!", outputStream.printOutput())
        } finally {
            System.setOut(originalOut)
        }
    }
}