import org.scalatest.flatspec.AnyFlatSpec

class StackTest extends AnyFlatSpec {
  val obj = new Generic
  "Stack" should "be true if stack is empty" in {
    assert(obj.isEmpty)
  }
  "Stack " should "give top element  " in {
    obj.pushElement(1)
    obj.pushElement(2)
    obj.pushElement(3)
    assert(obj.topElement == 3)
  }
  "Stack" should "pop the element  " in {
    obj.pushElement(1)
    obj.pushElement(2)
    obj.pushElement(3)
    obj.pushElement(4)
    obj.popElement()
    assert(obj.topElement == 3)
  }
  "Stack" should "be empty if all element are popped " in {
    obj.pushElement(2)
    obj.popElement()
    assert(obj.isEmpty)
  }
}