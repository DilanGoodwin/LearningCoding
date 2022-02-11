import scala.io.StdIn._

object MultipleInput{
    def main(args: Array[String]): Unit={
        var userInput1: Int=readLine("Please enter a number: ").toInt
        var userInput2: Int=readLine("Please enter another number: ").toInt

        println("You entered the numbers "+userInput1+" & "+userInput2)
        println("The sum of those two numbers is: "+(userInput1+userInput2))
        println("The product of those numbers is: "+(userInput1*userInput2))
    }
}