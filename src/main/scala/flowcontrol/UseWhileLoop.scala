package flowcontrol

object UseWhileLoop {
  def main(args: Array[String]): Unit = {
    // Scala 3 becomes
    // while x > 0 do
    //   ... indented

    var x = 3
    while (x > 0) {
      val p = x * 2
      println(s"x is ${x} and p is ${p}")
      x -= 1
    }

    val nums = Range(1, 6) // exclusive range
    println(nums)
    //    for expression...
    val result = for {
      num <- nums
      if num % 2 == 0
      msg = s"the value is ${num}"
    } yield (num, msg)
    //    yield msg + " came from " + num

    println(result)
    println(result(0))
    // access tuple elements in Scala 2
    // positional, ONE indexed not zero, use underscore
    // Scala 3 adds "regular subscripting" to tuples
    println(result(0)._1)

    val res2 = for {
      num <- nums
      if num % 2 == 0
      num2 <- Range(0, num)
    } yield (num, num2)
    println(res2)

    for {
      num <- nums
      if num % 2 == 0
    } {
      println(s"value is ${num}")
    }

    for {
      num <- nums
      if num % 2 == 0
      num2 <- Range(0, num)
    } println((num, num2))

    val starting = Range(1, 10)
    val mapres = starting.map(x => x * 2)
    println(starting)
    println(mapres)
  }
}
