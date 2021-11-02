/*
 1. Used only with mutable data type [var]
 2. Used only with non-nullable data type
 3. Must be initialized before you use it
 */

fun main() {
    val country = Country()
    
    country.setup()
}

class Country {
    lateinit var name:String
    fun setup() {
        name = "India"
        println("The name of country is $name")
    }
}