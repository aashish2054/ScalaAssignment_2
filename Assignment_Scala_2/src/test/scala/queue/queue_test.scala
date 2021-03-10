package queue
import org.scalatest.flatspec.AnyFlatSpec
class queue_test extends AnyFlatSpec {
  "The Queue" should "is correct" in {
    val queue_test = new queue_ops()
    queue_test.enqueue(10)
    queue_test.enqueue(20)
    queue_test.dequeue()
    queue_test.dequeue()
    queue_test.enqueue(30)
    queue_test.enqueue(40)
    queue_test.enqueue(50)
    queue_test.dequeue()
    val expectedResult=List(40, 50)
    val actualResult=queue_test.list
    assert(actualResult===expectedResult)
  }
}