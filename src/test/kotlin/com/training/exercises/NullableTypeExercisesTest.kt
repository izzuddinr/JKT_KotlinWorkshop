package com.training.exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NullableTypeExercisesTest {
    @Test
    fun `test processNullableData`() {
        assertEquals("Full name: John Paul Doe", processNullableData("John", "Paul", "Doe"))
        assertEquals("Full name: Unknown Paul Doe", processNullableData(null, "Paul", "Doe"))
        assertEquals("Full name: John Unknown Doe", processNullableData("John", null, "Doe"))
        assertEquals("Full name: Unknown Unknown Unknown", processNullableData(null, null, null))
        assertEquals("Full name: Alice Unknown Smith", processNullableData("Alice", null, "Smith"))
    }

    @Test
    fun `test findFirstNonNull`() {
        assertEquals("First", findFirstNonNull(null, null, "First"))
        assertEquals("All values are null", findFirstNonNull(null, null, null))
        assertEquals("First", findFirstNonNull("First", "Second"))
        assertEquals("Second", findFirstNonNull(null, "Second", "Third"))
        assertEquals("All values are null", findFirstNonNull())
        assertEquals("Zero", findFirstNonNull(null, null, "Zero"))
    }

    @Test
    fun `test getSafeLength`() {
        assertEquals(listOf(5, 0, 6), getSafeLength(listOf("apple", null, "banana")))
        assertEquals(listOf(0, 0, 0), getSafeLength(listOf(null, null, null)))
        assertEquals(listOf(3, 0, 4), getSafeLength(listOf("cat", null, "frog")))
        assertEquals(listOf(6, 5), getSafeLength(listOf("kettle", "water")))
        assertEquals(listOf<Int>(), getSafeLength(listOf()))
    }
}