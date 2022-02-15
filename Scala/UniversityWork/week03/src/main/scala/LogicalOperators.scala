import scala.io.StdIn._

object LogicalOperators{
    def main(args: Array[String]): Unit={
        var userInput1: Boolean=readLine("Please enter true/false: ").toBoolean
        var userInput2: Boolean=readLine("Please enter true/false: ").toBoolean

        println(userInput1 +" AND "+userInput2+" is "+(userInput1&&userInput2))
        println(userInput1+" OR "+userInput2+" is "+(userInput1||userInput2))

        println("\n\n")

        println("     |       |  AND  |  OR  |")
        println(userInput1+" | "+userInput2+" | "+(userInput1&&userInput2)+" | "+(userInput1||userInput2)+" |")
    }
}