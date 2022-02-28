import scala.io.StdIn._

object InputtingDifferentTypesB{
    def main(args: Array[String]): Unit={
        var firstName: String=readLine("Please enter your first name: ")
        var lastName: String=readLine("Please enter your last name: ")
        var firstInitital: Char=readLine("Please enter your first initial: ").charAt(0)
        var houseNumber: Int=readLine("Please eneter your house number: ").toInt
        var homeAddress: String=readLine("Please enter your address: ")
        var phoneNumber: String=readLine("Please enter your phone number: ")
        var madeSalary: Double=readLine("Please enter your salary: ").toDouble

        println("Your name is "+firstName+" "+lastName+". Your first initial is "+firstInitital+", your complete address is: "+houseNumber+" "+homeAddress+". Phone number is "+phoneNumber+" & salary is: "+madeSalary+".")
    }
}