package lastElement

object LastElement_Impl {
  def main(args: Array[String]): Unit = {
    val findLastElement = new lastElement
    val output: Any = {
      findLastElement.lastElement(List(10, 15, "car", 45, "bike"))
    }
    print(output)
  }

}
