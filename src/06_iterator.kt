class Animal(val animal : String)

class Zoo(val animals : List<Animal>) {
    operator fun iterator() : Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion")))

    for (animal in zoo) {
        println(animal.animal)
    }

    for(i in 0..3) {
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")

    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")

    println(2 in 1..5)
    println(8 !in 1..5)
    println(8 in 1..5)

}