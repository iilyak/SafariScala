package hello


// Scala 3 version
//object Hello:
   // indented..

// object creates a "singleton"... it's a real, instantiated
// object (not a class). it has an essentially anonymous class
// scala does not have "static", we use an object instead
object Hello {
  // program entry point
  // Unit is the type of the singleton ()
  def main(args:Array[String]):Unit = { // an expression goes here
  // Scala 3 would simply indent the following code
    println("Hello Scala World!");
    var x: Int = 99;
//    x = x + 2
    println(s"x += 2 has value ${x += 2}")
//    x++ // NOPE Scala doesn't do that
    println("x is " + x)
    println(s"x is ${x + 2}")
    println(s"x is $x") // simple expression, don't need curlies
    val pi = 3.14159 // val is essentially "final" in Java, const in JavaScript
//    pi = pi + 3 // cannot "reassign" a val
    val msg = f"pi is ${pi}%8.5f" // these are "type-inferenced"
    println(msg)
    val y = 10
    val z = 3
    // division is integral or float depending on argument types
    println(s"division... ${y / z}")
//    println(s"division... ${y / z}")
  }

  println("This is line 2, but it's part of the object's initialization")
}
