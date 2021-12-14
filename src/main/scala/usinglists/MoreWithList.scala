package usinglists

import scala.annotation.tailrec

object MoreWithList {
  @tailrec
  // the underscore in the [_] implies "I don't care what type"
  def showAll(l:List[_]): Unit = l match {
//    case Nil =>
    case Nil => () // explicit "produces Unit" is redundant
    case h :: t => println(s"> ${h}") ; showAll(t)
  }

//  @tailrec // NOPE, not here it ain't
//  def map[A, B](l:List[A], op: A => B): List[B] = l match {
  def map[A, B](l:List[A])(implicit op: A => B): List[B] = l match {
    case Nil => Nil
//    case h :: t => op(h) :: map(t, op)
//    case h :: t => op(h) :: map(t)(op)
    // can leave op off in OLDER versions, because it's implicit. But not today!?
    case h :: t => op(h) :: map(t)(op)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim")
    println(names)

    val moreNames = names.::("Alice") // PREPEND!! (aka cons)
    println(moreNames)

    // infix notation with a method whose name has : on the RHS
    // will be RIGHT associative
    val namesAgain = "Fred" :: "Jim" :: "Sheila" :: Nil
    println(s"head is ${namesAgain.head}")

    names match {
      case x :: y => println(s"There is a head element ${x} and the tail is ${y}")
//      case x :: y => println(s"There are two elements, ${x} and ${y}")
//      case x :: y :: z => println(s"There are three elements, ${x}, ${y}, and ${z}")
    }

    println("Show me the list:")
    showAll(namesAgain)

//    println(map(namesAgain, (s:String) => s.length))
    println(map(namesAgain)(s => s.length))
    // lambda that makes USE of its arguments ONCE each,
    // and does so in EXACTLY the order of the formal parameter
    // (a, b) => b.doStuff(a) DOES NOT WORK AS FOLLOWS
    println(map(namesAgain)(_.length))
  }
}
