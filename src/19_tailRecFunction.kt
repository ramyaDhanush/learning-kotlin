import java.math.BigInteger

/*
TailRec - Tail Recursion
Uses Recursion in Optimised way
- Prevents Stack Overflow Exception
- Prefix of "tailrec" is used
 */

fun main() {
    println(getFibonacciNuber(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFibonacciNuber(n:Int, a:BigInteger, b:BigInteger) : BigInteger {
    if (n==0) return b
    return getFibonacciNuber(n-1, a+b, a)
}