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

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers") // Duplikat hilang[cite: 234]

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Diabaikan karena sudah ada[cite: 234]
    println("Active Users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" // Value boleh duplikat, Key tidak
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20 // Menambah data baru[cite: 235]
    inventory["Apples"] = 45  // Mengupdate data lama[cite: 235]
    println("Inventory: $inventory")
}