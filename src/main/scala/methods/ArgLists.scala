package methods

object ArgLists {
  // multiple argument lists behave (kinda)
  // like multiple arguments
  def add(x:Int)(y:Int): Int = x + y

  // passing parameter "by name"
  def loop(count:Int)(op: => Unit): Unit = {
    println("method starting")
    var x = count
    while (x > 0) {
      op
      x -= 1
    }
    println("method completed")
  }


  def main(args: Array[String]): Unit = {
    println(add(1)(2))
    // if you have an argument list that takes a SINGLE
    // argument value, you can use curlies instead of parens
    val res = add(1) {
      3
    }
    println(s"res is ${res}")
    loop(4) {
      println("Hello, I'm in the loop")
    }
  }
}
