package flowcontrol

import scala.util.{Failure, Success, Try}

object ExceptionExample {
  def main(args: Array[String]): Unit = {

    try {
      println("About to do something delicate")
      val num = math.random()
      if (num > 0.5) throw new IllegalArgumentException("Too big")
      println("I survived...")
    } catch {
      case x: IllegalArgumentException => println(s"oops ${x.getMessage}")
      case x: RuntimeException => println("surprise")
      case _: Throwable => println("What?")
    } finally {
      println("This happens anyway")
    }
    // Scala2 has a library feature that is kinda with/using/try-with-resources
    // MOSTLY, Scala uses a monadic approach
    val r = Try {
      println("About to do something delicate")
      val num = math.random()
      if (num > 0.5) throw new IllegalArgumentException("Too big")
      "I survived..."
    }
    // also look for Either...

    r match {
      case s: Success[String] => println(s"it worked, I got ${s.get}")
      case f: Failure[String] => println(s"bother: ${f.exception.getMessage}")
    }
  }

}
