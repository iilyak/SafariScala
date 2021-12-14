package flowcontrol

object UseSimpleMatch {
  def main(args: Array[String]): Unit = {
    val x: Any = "Hello"
//    x = 99

    val message = x match {
      case 99 => "The value is 99"
      case 100 => "it's a hundred"
      case "Hello" => "Bonjour"
      case s: String if s.length > 5 => s"that was a long piece of text ${s}" // VASTLY superior to instanceof :)
      case s: String => s"that was text ${s}"
      case _ => "I'm not sure how to behave right now!!" // like default
    }

    println(message)
  }
}
