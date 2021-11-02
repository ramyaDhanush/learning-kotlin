fun main() {
    val mine = listOf("Apples", "Grapes")
    val theirs = listOf("Oranges", "Pears", "Strawberries")
    val others = listOf<String>("Kiwi", "Watermelon")
    val numbs = listOf<Int>(1, 2, 5, 3, 67, 54)

    val allOfUs = listOf(mine, theirs, others, numbs)
    val allOfUs2 = mine.plus(theirs).plus(others).plus(numbs)
    val someOfUs = allOfUs2.minus(numbs)

    println(allOfUs)
    println(allOfUs2)
    println(someOfUs)
    println(allOfUs.flatten())

    val mineArray = arrayOf("Apples", "Grapes")
    val theirsArray = arrayOf("Oranges", "Pears", "Strawberries")
    val othersArray = arrayOf<String>("Kiwi", "Watermelon")

    val allOfUsArray = arrayOf(mineArray, theirsArray, othersArray)

    println(allOfUsArray)
    println(allOfUsArray.flatten())
}