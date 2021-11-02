fun main() {
//    println(whenAssign("Hello"))
//    println(whenAssign(3.4))
//    println(whenAssign(1))
//    println(whenAssign(1L))
//    println(whenAssign(MyClass()))

    var a = "A"
    var d = "-"
    var b = if(a == "A") {
        "C"
    } else {
        "D"
    }

    var c = if(a == "A") {
       d =  "C"
    } else {
       d = "D"
    }

    println("$a, $b, $d, $c")

}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> {
            println("Ohooho")
            false
        }                   // 4
        else -> 42                              // 5
    }
    return result
}

class MyClass
