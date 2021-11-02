fun main() {
    val names = mutableSetOf("Don", "Zero", "DDLJ", "KKKG", "DDLJ")
    println(names)

    names.add("Dilwale")
    println(names)

    // Equality Checks
    //    1. For normal class, it will be false even for class with same values
    //    2. For data class, it will be true for class with same values
}