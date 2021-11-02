fun main() {
   infix fun String.times(str : Int) = this.repeat(str)
    println("bye" times 2)
//   infix fun Int.times(str: String) = str.repeat(this)
//   println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(str : String) = Pair(this, str)
    var myPair = "Marria" onto "Maisel"
    println(myPair)

    var sophia : Person = Person("Sophia")
    var claudia = Person("Claudia")
    sophia likes claudia

    sophia.printLikedPeople()
    claudia.printLikedPeople()

}

class Person(var str : String) {
    var likedPeople = mutableListOf<Person>()
    infix fun likes(other : Person) =  likedPeople.add(other)

    fun printLikedPeople() {
        likedPeople.forEach{ println("${it.str}, $str") }
    }
}
