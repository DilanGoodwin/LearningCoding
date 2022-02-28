import scala.io.StdIn._

object ShiftingLettersInAString{
    def main(args: Array[String]): Unit={
        var userSentance: String=readLine("Please enter a sentance: ")
        var characterModify: Char=readLine("Please enter the character you wish to modify: ").charAt(0)
        var numb: Int=readLine("Please enter a number: ").toInt

        var modifiedSentance: String=userSentance.replace(characterModify, (characterModify+numb).toChar)

        println("Modified sentance: "+modifiedSentance)
    }
}