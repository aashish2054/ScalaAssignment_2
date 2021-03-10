package lastElement

class lastElement {
  def length(list: List[Any]): Int = list match {
    case Nil => 0
    case _ :: ab =>
      val count = length(ab)
      1 + count
  }
  def lastElement(list: List[Any]): Any ={
    val lengthOfList = length(list)
    val indexOfFinalElement = lengthOfList - 1
    val finalElement = list(indexOfFinalElement)
    finalElement
  }

}
