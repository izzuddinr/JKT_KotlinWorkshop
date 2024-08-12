package com.training.exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionExercisesTest {
    @Test
    fun `test calculateDiscount`() {
        assertEquals(90.0, calculateDiscount(100.0, 10.0))
        assertEquals(75.0, calculateDiscount(100.0, 25.0))
        assertEquals(50.0, calculateDiscount(50.0, 0.0))
        assertEquals(0.0, calculateDiscount(50.0, 100.0))
        assertEquals(-50.0, calculateDiscount(50.0, 200.0))
        assertEquals(100.0, calculateDiscount(100.0, 0.0))
        assertEquals(0.0, calculateDiscount(0.0, 50.0))
        assertEquals(-10.0, calculateDiscount(10.0, 200.0))
        assertEquals(0.0, calculateDiscount(0.0, 0.0))
        assertEquals(200.0, calculateDiscount(100.0, -100.0))
    }

    @Test
    fun `test concatenateStrings`() {
        assertEquals("HelloWorld", concatenateStrings("Hello", "World"))
        assertEquals("Hello", concatenateStrings("Hello"))
        assertEquals("", concatenateStrings())
        assertEquals("12345", concatenateStrings("1", "2", "3", "4", "5"))
        assertEquals("ab", concatenateStrings("a", "", "b"))
        assertEquals(" ", concatenateStrings(" ", " "))
        assertEquals("null", concatenateStrings("null"))
        assertEquals("null", concatenateStrings("", "null"))
        assertEquals("nullnull", concatenateStrings("null", "null"))
    }

    @Test
    fun `test countVowels`() {
        assertEquals(3, countVowels("Hello World"))
        assertEquals(5, countVowels("Beautiful"))
        assertEquals(0, countVowels("Rhythm"))
        assertEquals(10, countVowels("aAeEiIoOuU"))
        assertEquals(2, countVowels("Kotlin"))
        assertEquals(0, countVowels(""))
        assertEquals(5, countVowels("A quick brown fox jumps over the lazy dog"))
        assertEquals(0, countVowels("1234567890"))
        assertEquals(0, countVowels("!@#$%^&*()"))
    }

    @Test
    fun `test findMedian`() {
        assertEquals(3.0, findMedian(listOf(1, 2, 3, 4, 5)))
        assertEquals(2.5, findMedian(listOf(1, 2, 3, 4)))
        assertEquals(5.0, findMedian(listOf(5)))
        assertEquals(1.5, findMedian(listOf(1, 2)))
        assertEquals(4.0, findMedian(listOf(1, 2, 3, 4, 5, 6, 7)))
        assertEquals(0.0, findMedian(listOf(0, 0, 0, 0)))
        assertEquals(3.0, findMedian(listOf(1, 3, 5)))
        assertEquals(2.5, findMedian(listOf(1, 2, 3, 4)))
        assertEquals(-1.0, findMedian(listOf(-1, -2, -3, -4, -5)))
        assertEquals(0.0, findMedian(listOf(0, 0, 0)))
        assertEquals(10.0, findMedian(listOf(10, 10, 10, 10, 10, 10, 10)))
        assertEquals(5.0, findMedian(listOf(10, 5, 1, 7, 8, 4, 9)))
    }
}