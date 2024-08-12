package com.training.exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionExercisesTest {
    @Test
    fun `test removeOddNumbers`() {
        val numbers1 = listOf(1, 2, 3, 4, 5, 6)
        val numbers2 = listOf(7, 8, 9, 10)
        val numbers3 = listOf(1, 3, 5, 7)
        val numbers4 = listOf(2, 4, 6, 8, 10)  // all even
        val numbers5 = emptyList<Int>()  // empty list
        val numbers6 = listOf(1, 2, 1, 2, 1, 2)  // duplicate numbers

        assertEquals(listOf(2, 4, 6), removeOddNumbers(numbers1))
        assertEquals(listOf(8, 10), removeOddNumbers(numbers2))
        assertEquals(emptyList<Int>(), removeOddNumbers(numbers3))
        assertEquals(listOf(2, 4, 6, 8, 10), removeOddNumbers(numbers4))
        assertEquals(emptyList<Int>(), removeOddNumbers(numbers5))
        assertEquals(listOf(2, 2, 2), removeOddNumbers(numbers6))
    }

    @Test
    fun `test findLongestWord`() {
        val words1 = listOf("cat", "hippopotamus", "dog", "elephant")
        val words2 = listOf("apple", "banana", "cherry")
        val words3 = listOf("short", "longer", "longest")
        val words4 = listOf("a", "ab", "abc", "abcd")  // increasing length
        val words5 = listOf("single")  // single word
        val words6 = listOf<String>()  // empty list

        assertEquals("hippopotamus", findLongestWord(words1))
        assertEquals("banana", findLongestWord(words2))
        assertEquals("longest", findLongestWord(words3))
        assertEquals("abcd", findLongestWord(words4))
        assertEquals("single", findLongestWord(words5))
        assertEquals("", findLongestWord(words6))
    }

    @Test
    fun `test findCommonElements`() {
        val list1 = listOf(1, 2, 3, 4, 5)
        val list2 = listOf(4, 5, 6, 7)
        val list3 = listOf(1, 2, 3, 4)
        val list4 = listOf(5, 6, 7, 8)
        val list5 = listOf<Int>()  // empty list
        val list6 = listOf(1, 2, 3, 4, 5)  // same lists

        assertEquals(listOf(4, 5), findCommonElements(list1, list2))
        assertEquals(listOf(1, 2, 3, 4), findCommonElements(list3, list1))
        assertEquals(listOf(5), findCommonElements(list1, list4))
        assertEquals(emptyList<Int>(), findCommonElements(list5, list1))
        assertEquals(listOf(1, 2, 3, 4, 5), findCommonElements(list6, list6))
    }
}