package queue

class Queue_ops {
  def display(list: List[Int]): List[Int]= {
    list
  }
  def front(list: List[Int]): Int= {
    try {
      val front = list.head
      front
    }
    catch {
      case e: NoSuchElementException => -1
    }
  }
  def enqueue(list: List[Int], element: Int): List[Int]= {
    val enqueue = list :+ element
    enqueue
  }

  def dequeue(list: List[Int]): List[Int]= {
    try {
      val dequeue = list.tail
      dequeue
    }
    catch {
      case  e: UnsupportedOperationException => List()
    }
  }

}
