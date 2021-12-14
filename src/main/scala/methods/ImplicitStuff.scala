package methods

object Messages {
  def doStuff(implicit msg:String): Unit = println(msg)
  implicit val french = "Bonjour"
  implicit val german = "Guten Tag"
}

object ImplicitStuff {

  def main(args: Array[String]): Unit = {
    Messages.doStuff("Hello")

    {
      import Messages.german
      Messages.doStuff
    }
  }
}
