package oop_140599_NathanaelEzraBudiman.week06

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicitly Abstract)
    fun click()
}