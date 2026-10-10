package oop_140599_NathanaelEzraBudiman.week07

fun main() {
    // --- Checkpoint 18: GameManager Singleton Test ---
    GameManager.startGame()
    GameManager.startGame() // Second call to test prevention

    // --- Checkpoint 19: Enum & Factory Test ---
    println("\nDrop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val myWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${myWeapon.item.name} (Damage: ${myWeapon.item.damage})")

    // --- Checkpoint 20: Data Class copy() & Sealed Class Dispatch ---
    // Upgrade weapon at blacksmith using copy()
    val upgradedItem = myWeapon.item.copy(damage = 25)

    // Simulate sequence of events
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}