package stack

object stack_ops_impl {
  def main(args: Array[String]): Unit = {
    val stack_obj= new stack_ops()
    stack_obj.push(10)
    stack_obj.push(20)
    stack_obj.push(30)
    stack_obj.push(40)
    stack_obj.push(50)
    stack_obj.push(60)

    stack_obj.display()

    println("\nTop element is =" + stack_obj.peek())    // print Top element of Stack

    stack_obj.pop()
    stack_obj.pop()

    stack_obj.display()

    println("\nTop element is =" + stack_obj.peek())

  }

}
