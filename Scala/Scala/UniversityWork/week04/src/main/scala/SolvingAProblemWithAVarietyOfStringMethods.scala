import scala.io.StdIn._

object SolvingAProblemWithAvarietyOfStringMethods{
    def main(args: Array[String]): Unit={
        var fullName: String=readLine("Please enter your full name: ")

        println("Your initials are: "+fullName.toUpperCase.charAt(0)+fullName.toUpperCase.charAt(fullName.indexOf(" ")+1))

        println("Your email is: "+fullName.toLowerCase.charAt(0)+"."+fullName.substring(fullName.indexOf(" ")+1)+"@email.university.ac.uk")
    }
}