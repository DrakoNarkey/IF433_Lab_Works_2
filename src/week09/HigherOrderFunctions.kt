package oop_140599_NathanaelEzraBudiman.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original data: $numbers")
    println("\n=== HOF:Filter ===")
    //filter() membuat list baru berisi elemen yang memenuhi kondisi (true)
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    println("\n=== HOF:MAP ===")
    //map() merubah bentuk/nilai data, tapi ukurannya tetap sama
    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

    println("\n=== HOF:SORTED & FOREACH ===")
    val randomNames = listOf("Charlie", "Alice", "Bob")

    //sortedbyDescending mengurutkan dari belakang
    val sortedReverse = randomNames.sortedByDescending{ it }

    //foreach mengeksekusi aksi tiap elemen (tidak mereturn list)
    sortedReverse.forEach { name -> println("User: $name")
    }
}