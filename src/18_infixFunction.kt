/*
1. All infix functions are extension function
But all extension function are not Infix
2. Infix function can take only one parameter
 */

fun main() {
    var student = Student1()
    println("Pass Status : ${student.hasPassed(57)}")
    println("Pass Status : ${student.isScholar(57)}")
    println("Hello".append("!! ", "there"))
    var a = 10
    var b= 14
    println(a.greaterVal(b))
}

fun String.append(s1: String, s2:String) : String {
    return this + s1 + s2;
}

fun  Student1.isScholar(marks: Int):Boolean {
    return marks > 95
}

class Student1 {
    fun hasPassed(marks : Int) : Boolean {
        return marks > 40
    }
}

infix fun Int.greaterVal(other : Int):Int {
    if(this > other) return this
    else return other
}