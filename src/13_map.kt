fun main() {
    val items = listOf("Donn Felker", "Jane Doe", "Steve Smith", "Peter Parker", "Chris Evans")
    val abbreviations = items.map{
        val words = it.split(' ')
        words[0].substring(0, 1) + words[1].substring(0, 1) // last statement in map is default return statement
    }
    val abbreviationsRev = abbreviations.reversed()

    println(abbreviations)
    println(abbreviationsRev)

    val bags = listOf(
        Bag(listOf("Grapes", "Apples", "Oranges")),
        Bag(listOf("Grapes2", "Apples2", "Oranges2")),
        Bag(listOf("Grapes3", "Apples3", "Oranges3")),
    )

    println(bags.flatMap { it.items })
    println(bags.map { it.items })

}
class Bag(val items : List<String>)