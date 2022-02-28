import scala.io.StdIn._

object InputAndCalculation{
    def main(args: Array[String]): Unit={
        var n: Int=readLine("Please enter a number:").toInt
        var sumcubes: Int=(n*n)*((n+1)*(n+1))/4

        println(sumcubes)
    }
}