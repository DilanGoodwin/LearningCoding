import scala.io.StdIn._

object FurtherExploringOperators{
    def main(args: Array[String]): Unit={
        var y: Int=readLine("Enter a number: ").toInt
        var z: Int=readLine("Enter another number: ").toInt
        println("1 x " + y + " = " + (1 * y))
        println("10 x " + y + " = " + (10 * y))
        println("100 x " + y + " = " + (100 * y))

        println(y+z)
        println(y*z)
        println(y-z)
        println((y*y)+(z*z))
    }
}