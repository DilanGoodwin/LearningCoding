import scala.io.StdIn._

object AdvancedFunctions4{

    def wordToDigit(n:String): Int={
        n match {
            case "one" => 1
            case "two" => 2
            case "three" => 3
            case "four" => 4
            case "five" => 5
            case "six" => 6
            case "seven" => 7
            case "eight" => 8
            case "nine" => 9
            case _ => -1
        }
    }

    def main(args: Array[String]): Unit={
        var userInput: String=readLine("Please type out a number: ").toLowerCase()
        println(wordToDigit(userInput))
    }
}