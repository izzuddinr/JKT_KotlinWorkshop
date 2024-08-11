package com.training.exercises

// To test your solutions
fun main() {

}

/**
 * Write a function processNullableData that takes three nullable String parameters:
 * firstName, middleName, and lastName. The function should return a formatted string in the format:
 *
 * "Full name: <firstName> <middleName> <lastName>"
 *
 * Use the Elvis operator and let function to handle null values appropriately,
 * replacing any null values with "Unknown".
 *
 * Example:
 * processNullableData("John", null, "Doe"))     // Output: Full name: John Unknown Doe
 *
 */

fun processNullableData(firstName: String?, middleName: String?, lastName: String?): String {
    TODO("Not yet implemented")
}

/**
 * Write a function findFirstNonNull that takes a variable number of nullable String arguments
 * and returns the first non-null value. If all values are null, return "All values are null".
 *
 * Example:
 * findFirstNonNull(null, null, "First")   // Output: First
 * findFirstNonNull(null, null, null)      // Output: All values are null
 * findFirstNonNull("First", "Second")     // Output: First
 */
fun findFirstNonNull(vararg values: String?): String {
    TODO("Not yet implemented")
}

/**
 * Write a function getSafeLength that takes a list of nullable String values and returns
 * a list of their lengths. If an element is null, use 0 as its length.
 *
 * Example:
 * getSafeLength(listOf("apple", null, "banana"))  // Output: [5, 0, 6]
 */

fun getSafeLength(strings: List<String?>): List<Int> {
    TODO("Not yet implemented")
}