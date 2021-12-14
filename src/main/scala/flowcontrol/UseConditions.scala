package flowcontrol

object UseConditions {
  def main(args: Array[String]): Unit = {
    val num = math.random()

    // Scala 3
//    if num > 0.5 then
//        println("it's big")
//    else println("it's not big")

    // Scala 2 requires parens
    val res = if (num > 0.5) {
      println("it's big")
    } else if (num > 0.2) {
      println("it's fairly big")
    } else {
      println("it's pretty small")
    }

    // curlies form an expression!!!!

    val x = {
      println("calculating x...")
      99 // value of a curly brace expression IS the last value in the block

    }

    // if / else is an EXPRESSION value (similar to ?:)
    val res2 = if (num > 0.5) {
      println("calculating...")
      "it's big"
    } else if (num > 0.2) {
      "it's fairly big"
    } else {
      println("hmm...")
      "it's pretty small"
    }
    "Hello"
  }
}
