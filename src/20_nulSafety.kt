/*  NULL SAFETY
    ?.        = Safe Call Operator
    !!        = Not-null Assertion
    ?:        = Elvis
    ?.let{..} = Safe Call with let
 */

fun main() {
    var name : String? = null
    println(name?.length?:-1)

    name = "Ramya"
    println(name)

    val length = name?.length ?: -1
    println(length)
    println(name?.length)
    name = null
    println(name?.length)
}
