@file:JvmName("MyCustomKotlin")
package services

fun main() {
    println("Hello There!!")
    var area = MyJavaFile.getArea(3, 4)
    println("Area from Kotlin file : $area")
}

@JvmOverloads
fun add(a : Int, b : Int = 10) : Int {
    return a + b
}

/* MyFirstKt.class
 public class MyFirstKt {
    public static void main(String[] args) {
        //statements
    }

    public static int add(int a, int b) {
        return a + b;
    }
 }

 */
