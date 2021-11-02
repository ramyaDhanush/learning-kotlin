fun main() {
    printUserInfo("John", "doe", 12, true)
    printUserInfo(lastName = "Jane", firstName = "M", age = -6)
    varArguments("Mariam")
    varArguments("Mariam", "french", "spanish", "chinese")
}

fun printUserInfo(firstName: String, lastName: String, age: Int, isActive: Boolean = false) {
    println("\$firstName $firstName  $lastName $age $isActive")

}

fun varArguments(name: String, vararg languages: String) {
    println("$name")
    println("Languages : ")
    languages.forEach { println(it) }
}