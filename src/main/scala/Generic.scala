import scala.sys.error

trait Stack[Q] {

  def pushElement(x: Q): Unit

  def topElement(): Q

  def popElement(): Q

  def isEmpty: Boolean
}

class Generic extends Stack[Int] {
  var stack: List[Int] = List()

  override def pushElement(element: Int): Unit = {
    stack = element +: stack
    println(stack)
  }

  override def topElement(): Int = {
    stack.head
  }

  override def popElement(): Int = {
    if (stack.isEmpty) {
      //      println("oops.. Stack is Empty")
      error("oops.. Stack is Empty")
    }
    else {
      val remove = stack.head
      stack = stack.tail
      remove
    }
  }

  override def isEmpty: Boolean = {
    if (stack == Nil) true
    else
      false
  }
}