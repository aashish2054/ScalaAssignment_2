package queue

object queue_ops_impl {
  def main(args: Array[String]): Unit={
    val q = new queue_ops()
    q.enqueue(5)
    q.enqueue(10)
    q.dequeue()
    q.dequeue()
    q.enqueue(15)
    q.enqueue(20)
    q.enqueue(25)
    q.dequeue()
    println(q.list)
  }

}
