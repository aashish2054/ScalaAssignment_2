package lastElement

import org.scalatest.flatspec.AnyFlatSpec
class lastElementTest extends AnyFlatSpec {
  val findLastElement = new lastElement

  "LastElement" should "return 444,5" in {
    val result = findLastElement.lastelement(List(5,55,555,4,44,444))
    assertResult((444,5))(result)
  }

  it should "return -1,-1" in {
    val result = findLastElement.lastelement(List())
    assertResult((-1,-1))(result)
  }
  it should "return -4,0" in {
    val result = findLastElement.lastelement(List(-4))
  }

}
