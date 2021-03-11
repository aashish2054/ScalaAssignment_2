package queue
import org.scalatest.flatspec.AnyFlatSpec
class Queue_test extends AnyFlatSpec {
  val queue = new Queue_ops

  "queue" should "display correct output" in {
    val result = queue.display(List(5,8,9,99))
    assertResult(List(5,8,9,99))(result)
  }

  " queue" should "return correct output" in {
    val result = queue.front(List(5,8,9,99))
    assertResult(5)(result)
  }

  " queue" should "display nothing" in {
    val result = queue.front(List())
    assertResult(-1)(result)
  }

  "enqueue" should "display correct output" in {
    val result = queue.enqueue(List(5,8,9,99),8)
    assertResult(List(5,8,9,99,8))(result)
  }

  "dequeue" should "display correct output" in {
    val result = queue.dequeue(List(5,8,9,99))
    assertResult(List(8,9,99))(result)
  }

  "dequeue" should "display nothing" in {
    val result = queue.dequeue(List())
    assertResult(List())(result)
  }
}