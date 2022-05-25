package Lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)
  println(2 + 3 * 4)
  println(1 == x)
  // == != > >= < <=
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 // add 3 to it, also works with -= *= /= ... side effects
  println(s"aVariable is $aVariable")

  // Instructions (DO) vs Expressions (VALUE)

  // IF Expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  // There are loops in Scala but we discourage them

  // example of while loops
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN
  // Looping is specific to imperative programming, the single worst thing a Scala programmer could do is write imperative programming

  // EVERYTHING in Scala is an expression!

  // Only definitions are not expressions.

  val aWeirdValue = (aVariable = 3) // The type Unit is equal to void
  println(aWeirdValue)

  // Side effects in Scala return units

  // Side effects: println(), whiles, reassigning of vars

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // Code blocks are surrounded by curly braces
  // They are expressions
  // The value of the block is the value of the last expression

  //  cannot do something like this "val anotherValue = z + 1" because z is scoped in the block

  // if in Scala is an expression that evaluates to something, not an instruction
  // fundamental of Scala -> expressions are evaluated

  // 1. Difference between "hello world" and  println("hello world")
  // My answer: the first is the string hello world and the second is the side effect println that evaluates to type Unit
  // Real answer: correct answer
  // 2. What's the value of
  val someValue = {
    2 < 3
  }
  // My answer: True
  // Real answer: Value of type boolean, code block, last expression returns Boolean
  // 3. What is the value of
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  // My answer: 42
  // Real answer: correct


}
