package table

object table_impl {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1,2,3)

    val tables=new table

    tables.AllTables(list)
  }


}
