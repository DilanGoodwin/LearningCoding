import scala.io.StdIn._

object ColourMatching{
    def main(args: Array[String]): Unit={
        var userInput: Int=readLine("Please enter a number between 1 & 7: ").toInt
        var result=userInput match{
            case 1 => "red"
            case 2 => "orange"
            case 3 => "yellow"
            case 4 => "green"
            case 5 => "blue"
            case 6 => "indigo"
            case 7 => "violet"
            case _ => "not a match"
        }

        println(result.toUpperCase())
    }
}