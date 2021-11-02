sealed class Mammal(val name:String)

class Cat(val catName : String) : Mammal(catName)
class Human(val humanName : String, val job:String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) : String {
    when(mammal) {
        is Human -> return "Human ${mammal.humanName} is working as ${mammal.job}"
        is Cat -> return "Cat ${mammal.catName}"
    }
}

fun main() {
   var cat = Cat("Tom")
    var human = Human("John", "Engineer")

    println(greetMammal(cat))
    println(greetMammal(human))
}