import scala.io.StdIn.readInt

object SpecifyingCommonPatterns{
    def main(args: Array[String]): Unit={
        println("Type in a day number: ")
        var choice: Int=readInt()

        val day=choice match{
            case 1|2|3|4|5 => "Weekday"
            case 6|7 => "Weekend"
            case _ => "Unknown Day"
        }

        println(day)
    }
}