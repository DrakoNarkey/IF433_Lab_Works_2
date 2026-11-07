package oop_140599_NathanaelEzraBudiman.week09

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR![cite: 234]
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 98)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}