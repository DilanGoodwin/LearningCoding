import scala.io.StdIn._

object AdvancedFunctions5{

    def leapYear(n:Int): Boolean={
        if(n%400==0){
            return true
        }else if(n%100==0){
            return false
        }else if(n%4==0){
            return true
        }else{
            return false
        }
    }

    def main(args: Array[String]): Unit={
        var userInput: Int=readLine("Please enter a year: ").toInt
        println(leapYear(userInput))
    }
}