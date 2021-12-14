package methods

object CreateMethods {
  def doStuff(s: String = "hello"): Unit = println(s)

  def dayOfWeek(day:Int, month:Int, year:Int):String =
    s"it's day ${day}..."

  def many(s:String*):Unit =
    println(s"s is ${s} type is ${s.getClass()}")

  def main(args: Array[String]): Unit = {
    doStuff("Bonjour")
    doStuff()
    println(dayOfWeek(month=12, day=14, year=2021))
    many("Fred", "Jim", "Sheila")
    val names = List("Freddy", "Jimmy")
    many(names:_*)
  }
}

object Other {
  def main(args: Array[String]): Unit = {
    println("Other.main...")
    // Scala 3 would require curly on the end of the first line!!
    // NOte, we do NOT want this syntax here anyway..
    CreateMethods.doStuff()

    val odd = {
      // imports can import classes, objects, fields, methods, and are scoped
      import methods.CreateMethods.doStuff
      doStuff()
    }
    println(odd)
//    doStuff() // no longer in scope
  }
}