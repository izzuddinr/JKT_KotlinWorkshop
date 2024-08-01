package com.training.basic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class HelloWorldTest {

    @Test
    fun `test execute`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val helloWorld = HelloWorld()
            helloWorld.execute()

            assertEquals("Hello, World!", outputStream.toString())
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
            val helloWorld = HelloWorld()
            helloWorld.execute("Ingenico")

            assertEquals("Hello, Ingenico!", outputStream.toString())
        } finally {
            System.setOut(originalOut)
        }
    }
}