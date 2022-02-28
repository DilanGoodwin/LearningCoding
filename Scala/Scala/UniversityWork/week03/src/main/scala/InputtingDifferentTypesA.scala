import scala.io.StdIn._

object InputtingDifferentTypesA{
    def main(args: Array[String]): Unit={
        print("Enter your first name:v")
        var firstName: String=readLine()

        var lastName: String=readLine("Enter your last name: ")

        println("Your name is "+firstName+" "+lastName)
    }
}