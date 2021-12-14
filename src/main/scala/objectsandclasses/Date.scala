package objectsandclasses

import objectsandclasses.Date.daysInMont

/* NO SUCH KEYWORD! public (public is default!) */
object Date {
  def apply(d:Int, m:Int, y:Int):Date = new Date(d, m, y)

  // object is home to the "class-wide concepts" (i.e. much like static)
  def isLeapYear(y: Int): Boolean = {
    y % 4 == 0 && y % 100 != 0 || y % 400 == 0
    // == does OBJECT comparison (i.e. invokes the dot-equals behavior of
    // a typical Java class). Or, the __eq__(self) of Python
    // for identity comparison (== on objects in Java or is in Python)
    // use obj.eq(other)

  }

  def daysInMont(m:Int, y:Int): Int = m match {
    case 9 | 4 | 6 | 11 => 30
    case 2 => if (isLeapYear(y)) 29 else 28
    case _ => 31
  }
}

// IDENTICAL NAMES makes these "companions"
// companions have privileged access to each other's private members
//class Date(d: Int) {
//  val day: Int = d
//
//  println("Initializing a Date")
//
//}

// this form of argument declares constructor arg and a field to match
class Date private (val d: Int, val m: Int, val y: Int) {
  println("Initializing a Date")
  if (d > daysInMont(m, y) || d < 1) throw new IllegalArgumentException("Bad day")

  def this(d:Int, m: Int) = this(d, m, 2021) // auxiliary constructor!!

  override def toString: String = s"I'm a date with day = ${d}, ${m}, ${y}"
}

