/*
Extension functions are static by default
Can be part of your own class (Eg:- Student)
Can be part of predefined classes (Eg:- String, Int, Array, etc.)
 */

fun main() {
    var student = Student()
    println("Pass Status : ${student.hasPassed(57)}")
    println("Pass Status : ${student.isScholar(57)}")
    println("Hello".add("!! ", "there"))
}

fun String.add(s1: String, s2:String) : String {
    return this + s1 + s2;
}

fun  Student.isScholar(marks: Int):Boolean {
    return marks > 95
}

class Student {
    fun hasPassed(marks : Int) : Boolean {
        return marks > 40
    }
}