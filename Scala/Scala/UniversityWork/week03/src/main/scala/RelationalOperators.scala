import scala.io.StdIn._

object RelationalOperators{
    def main(args: Array[String]): Unit={
        var numbOne: Int=readLine("Please enter a number: ").toInt
        var numbTwo: Int=readLine("Please enter another number: ").toInt

        println(numbOne+" < "+numbTwo+" is "+(numbOne<numbTwo))
        println(numbOne+" > "+numbTwo+" is "+(numbOne>numbTwo))
        println(numbOne+" <= "+numbTwo+" is "+(numbOne<=numbTwo))
        println(numbOne+" >= "+numbTwo+" is "+(numbOne>=numbTwo))
        println(numbOne+" == "+numbTwo+" is "+(numbOne==numbTwo))
        println(numbOne+" != "+numbTwo+" is "+(numbOne!=numbTwo))
    }
}