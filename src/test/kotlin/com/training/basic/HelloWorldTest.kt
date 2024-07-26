package com.training.basic

import com.training.basic.HelloWorld
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class HelloWorldTest {

    @Test
    fun testExecute() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out
        System.setOut(printStream)

        try {
            val helloWorld = HelloWorld()
            helloWorld.execute()

            assertEquals("Hello, World!\n", outputStream.toString())
        } finally {
            System.setOut(originalOut)
        }
    }
}