import scala.io.StdIn._
import scala.annotation.varargs

object UpsideDownTriangle{
    def main(args: Array[String]): Unit={
        var baseHeight: Int=readLine("Please enter a number: ").toInt
        var col: Int=1

        while(col<=baseHeight){
            var row: Int=1
            while(row<=baseHeight){
                print("* ")
                row +=1
            }
            baseHeight -=1
            println()
        }
    }
}