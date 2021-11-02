data class User1(val name: String, val id: Int) {
    override fun equals(other: Any?) =
        other is User1 && other.id == this.id
}
fun main() {
    val user1 = User1("Alex", 1)
    println(user1)

    val secondUser1 = User1("Alex", 1)
    val thirdUser1 = User1("Max", 2)

    println("user1 == secondUser1: ${user1 == secondUser1}")
    println("user1 == thirdUser1: ${user1 == thirdUser1}")

    // hashCode() function
    println(user1.hashCode())
    println(secondUser1.hashCode())
    println(thirdUser1.hashCode())

    // copy() function
    println(user1.copy())
    println(user1 === user1.copy())
    println(user1.copy("Max"))
    println(user1.copy(id = 3))

    println("name = ${user1.component1()}")
    println("id = ${user1.component2()}")
}