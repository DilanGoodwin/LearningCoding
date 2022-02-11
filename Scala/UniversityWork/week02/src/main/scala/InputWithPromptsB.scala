import scala.io.StdIn._

object InputWithPromptsB{
    def main(args: Array[String]): Unit={
        var firstName: String=readLine("Please enter your first name: ")
        var lastName: String=readLine("Please enter your last name: ")
        var title: String=readLine("Please enter your title: ")

        println("Your name is: "+firstName+" "+lastName+". And your title is: "+title)
    }
}