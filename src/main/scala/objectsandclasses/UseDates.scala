package objectsandclasses

object UseDates {
  def main(args: Array[String]): Unit = {
//    val d = new Date(14, 12, 2021) // NOPE for private constructor
    val d1:Date = Date.apply(14, 12, 2021)
    val d2:Date = Date(14, 12, 2021) // factory in Date object

    println(d2.d)

//    println(Date(31,2,2021))
  }
}

// use extends for inheritance, and use traits for "interface"
// trait also allows fields and methods (not just static final and default etc.)
// trait is much more like abstract class (without constructor!!!)
// but with multiple inheritance

