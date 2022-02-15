import scala.io.StdIn._

object Caesar{
    def main(args: Array[String]): Unit={
        var char: Char=readLine("Please enter character to encrypt: ").charAt(0)
        var int: Int=readLine("Please enter a number: ").toInt
        
        println("Modified character: "+(char+int).toChar)

    }
}