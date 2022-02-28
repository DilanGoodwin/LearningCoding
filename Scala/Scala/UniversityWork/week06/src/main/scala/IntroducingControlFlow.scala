import scala.io.StdIn._

object IntroducingControlFlow{
    def main(args: Array[String]): Unit={
        var firstName: String=readLine("Please enter your first name: ")
        var lastName: String=readLine("Please enter your last name: ")
        var error: String=""

        if(firstName.isEmpty()){
            error += "You did not type in a first name\n"
        }
        if(lastName.isEmpty()){
            error += "You did not type in a lst name\n"
        }
        if(error.isEmpty()){
            println("Your name is "+firstName+" "+lastName)
        }else{
            println(error)
        }
    }
}