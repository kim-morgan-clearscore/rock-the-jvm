package Lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b

  // the plus is string concatenation
  // You can remove the return type

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)
  // Parameterless functions can be called with just their name no brackets

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  // recursive functions need return types
  // best practise is always to specify return type

  println(aRepeatedFunction("hello", 3))

  // In a normal language you would use loops, but in Scala you use RECURSION. FUNDAMENTAL IDEA.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  // Tasks
  // 1. Greeting function (name, age) "Hi my name is name and I am age years old"
  // 2. Factorial function 1 * 2 * 3 ... * n
  // 3. a Fibonnaci function f(n-1) + f(n-2)
  // 4. tests prime

  def greeting(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"
  }

  def factorial(n: Int): Int = {
    if(n == 1) 1
    else n * factorial(n-1)
  }

  def prime(n: Int): Boolean = {
    def testPrime(n: Int, divisor: Int): Boolean = {
      if(n % divisor == 0) false
      else if (divisor >= scala.math.pow(n,0.5)) true
      else testPrime(n, divisor + 2)
    }
    if (n % 2 == 0) false
    else testPrime(n, 3)
  }

  def fibonacci(n: Int): Int = {
    if (n < 2) n
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(greeting("Kim", 31))
  println(factorial(20))
  println(fibonacci(3))
  println(fibonacci(4))
  println(fibonacci(5))
  println(prime(4))
  println(prime(5))
  println(prime(7))
  println(prime(11))
  println(prime(77))
  println(prime(9973))
}
