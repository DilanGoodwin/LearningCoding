import scala.io.StdIn._

object AdvancedFunctions3{

    def digitToWord(n:Int): String={
        n match {
            case 1 => "one"
            case 2 => "two"
            case 3 => "three"
            case 4 => "four"
            case 5 => "five"
            case 6 => "six"
            case 7 => "seven"
            case 8 => "eight"
            case 9 => "nine"
            case _ => "bad digit"
        }
    }

    def main(args: Array[String]): Unit={
        var userInput: Int=readLine("Please enter a number: ").toInt
        println(digitToWord(userInput))
    }
}