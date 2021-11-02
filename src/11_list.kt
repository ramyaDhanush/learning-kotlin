fun main() {
    val names = listOf<String>("Donn", "Bob", "Jane", "Henny", "Donovan", "Ian")
    val result1 = names.filter{ it.length > 3}
    println(result1)

    val numbers = listOf<Int>(1, 4, 6, 9, 32, 9, 2)
    val result2 = numbers.filter { it > 4 }
    println(result2)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filteredMap)

    val approved = mutableListOf("Daniel", "Paul")
    println(approved)

    names.filterTo(approved) { it.contains("a") }
    // names.filterTo(approved, { it.contains("a") }) // Another Way
    println(approved)
}