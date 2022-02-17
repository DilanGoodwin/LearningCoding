import scala.io.StdIn._

object ModuleMarkCalculator{
    def main(args: Array[String]): Unit={
        var courseWork: Int=readLine("Please enter your Coursework percentage mark: ").toInt
        var examMark: Int=readLine("Please enter your examination percentage mark: ").toInt

        println("Your overall moudle mark: "+((courseWork+examMark)/2))

        if((courseWork+examMark)/2 >= 40){
            println("The module was passed overall.")
        }else{
            println("The module was not passed overall.")
            if(courseWork < 40){
                println("Coursework was below 40% passing rate.")
            }else if(examMark < 40){
                println("Exam mark was below 40% passing rate.")
            }else{
                println("There was an error.")
            }
        }
    }
}