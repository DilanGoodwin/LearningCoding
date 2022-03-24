
import scala.io.StdIn._

object OppositeNumber{
  def main(args:Array[String]): Unit={
    var x: Double=readLine("Please enter a number: ").toDouble
    x-=x*2
    println(x)
  }
}
