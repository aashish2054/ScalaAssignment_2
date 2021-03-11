package stack
import org.scalatest.flatspec.AnyFlatSpec
class stack_test extends AnyFlatSpec {
  "The Stack implementation" should "is correct" in {
    val stack_test=new Stack_ops()
    stack_test.push(10)
    stack_test.push(20)
    stack_test.push(30)
    stack_test.push(40)
    val expectedResult=40
    val actualResult=stack_test.peek()
    assert(expectedResult===actualResult)
  }
}