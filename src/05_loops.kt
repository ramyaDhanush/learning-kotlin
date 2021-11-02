fun main(args : Array<String>) {
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) println(cake)

    var cakesEaten = 0
    var cakesBaked = 5

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    myLoop@ for(i in 1..3) {
        for(j in 1..3) {
            println("$i $j")
            if(i==2) {
                break@myLoop
            }
        }
    }

}

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")