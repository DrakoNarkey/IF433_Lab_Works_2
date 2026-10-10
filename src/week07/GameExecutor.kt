package oop_140599_NathanaelEzraBudiman.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> println("Anda berada di area aman. Silakan istirahat.")
        is BattleState.MonsterEncounter -> println("Bahaya! Bertemu dengan monster: ${event.monsterName}!")
        is BattleState.LootDropped -> println("Mendapat loot item: ${event.item.name} dengan rarity ${event.item.rarity} (Damage: ${event.item.damage})")
        is BattleState.GameOver -> println("GAME OVER! Alasan: ${event.reason}")
    }
}