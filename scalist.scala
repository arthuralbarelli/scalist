import scala.io.StdIn.readLine
import scala.collection.mutable.ArrayBuffer

object Scalist {
  def main (args: Array[String]) = {

    val tasks = ArrayBuffer[String]()

    print ("Enter your task: ")
    val task = readLine()
    tasks += task

    println(s"The task is:\n$task")
  }
}
