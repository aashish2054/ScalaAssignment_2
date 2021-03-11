package table

class Table {
  def allTables(list: List[Int]): List[List[Int]] = {
    try {
      val table_list = for (value <- list) yield {
        val tableElements = for (element <- 1 until 11) yield {
          value * element
        }
        tableElements.toList
      }
      table_list
    }
    catch {
      case  e: IndexOutOfBoundsException => List(List(-1))
    }
  }
}
