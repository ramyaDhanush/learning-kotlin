fun main() {
    val listofStrings = listOf("Dobb", "John", "Len")
    val listofInts = listOf(1, 2, 3, 4, 5)

    val result1 = EvenList(listofStrings)
    println(result1.items())

    val result2 = EvenList(listofInts)
    println(result2.items())

}

class EvenList<T>(private val list: List<T>) {
    fun items(): List<T> {
        return list.filterIndexed{ index, value -> index%2 == 0}
    }
}