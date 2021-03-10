package lastElement

import org.scalatest.flatspec.AnyFlatSpec
class lastElementTest extends AnyFlatSpec {
  "Last Element" should "is correct" in {
    val testList: List[Any] = List(1,2,3,"car","bike")
    val expectedResult = "bike"
    val objectOfList = new lastElement()
    val ActualResult= objectOfList.lastElement(testList)
    assert(expectedResult===ActualResult)
  }

}
