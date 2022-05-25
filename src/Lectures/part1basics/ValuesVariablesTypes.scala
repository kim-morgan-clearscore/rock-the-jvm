package Lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // compiler can infer types
  // in practise we don't usually specify

  // build tools, sbt, maven

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613 //2-byte integer
  val aLong: Long = 234792384852934857L //put L at the end for long
  val aFloat: Float = 2.0f //need the f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4
  aVariable = 5
  // vars can be reassigned
  // used for side effects

}
