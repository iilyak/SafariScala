package many

// this is implicit
//import java.lang._ // scala 2 uses underscore for "all of them"
// scala 3 allows asterisk

// Stuff that looks like "standard, built-in functions" are really
// (usually) imports from the Predef object
// this too is implicit
//import scala.Predef._

object UseArray {
  def apply(x:Int):Unit = println(s"you called my apply with ${x}")
  def update(x:Int, y:String):Unit = println(s"you called update(${x}, ${y})")

  def main(args: Array[String]): Unit = {
    val names = new Array[String](3)
//    names(0) = "Fred"
    // names is an instance of the Array class
    // which has update and apply methods
    names.update(0, "Fred") // majority of "collections" are immutable
    // any object reference followed by parens,
    // it's really invoking the apply method!
    println(s"names sub zero is ${names(0)}")
    println(s"names sub zero is ${names.apply(0)}")
    names(0) = "Frederick"
    println(s"names sub zero is now ${names(0)}")
    Console.println(s"names sub one is ${names(1)}")
    // "infix" invocation
    Console println (s"names sub one is ${names(1)}")
    Console println s"names sub one is ${names(1)}"
    // can do this with your OWN methods
    // beloved of Domain Specific Languages
    val sum = 3.+(4)
    val sum2 = 3 + 4

//    myObj +-+ 99

    UseArray(99)
    UseArray.apply(99)
    UseArray(100) = "Hello"

    val names2 = Array("Fred", "Jim", "Sheila")
    println(names2)
  }
}
