
import scala.io.StdIn._

object SimpleMultiplication{
  def main(args:Array[String]): Unit={
    var x: Int=readLine("Please enter a number: ").toInt
    if(n%2==0){
      println(n*8)
    }else{
      println(n*9)
    }
  }
}
