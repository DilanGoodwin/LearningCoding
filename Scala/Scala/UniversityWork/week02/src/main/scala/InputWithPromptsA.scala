import scala.io.StdIn._

object InputWithPrompts{
    def main(args: Array[String]): Unit={
        print("Enter your first name: ")
        var firstName: String=readLine()
        var lastName: String=readLine("Enter your last name: ")

        println("Your name is "+firstName+" "+lastName)
    }
}