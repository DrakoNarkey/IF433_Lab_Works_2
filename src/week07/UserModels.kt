package oop_140599_NathanaelEzraBudiman.week07

// Regular class (demonstrating lack of structural equality & clean toString)
class RegularUser(val name: String, val age: Int)

// Data class (auto-generates equals(), hashCode(), toString(), copy())
data class DataUser(val name: String, val age: Int)