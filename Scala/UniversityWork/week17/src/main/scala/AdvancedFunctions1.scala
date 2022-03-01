import scala.io.StdIn._

object AdvancedFunctions1{

    def prime(n:Long): Boolean={
        if(n%2!=0 || n==2){
            for(loop <- 1 until n.toInt){
                if(n%loop==0 || loop==1 || loop==n){
                    return true
                }
            }
        }
        return false
    }

    def main(args: Array[String]): Unit={
        var userInput: Long=readLine("Please enter a number: ").toLong
        println(prime(userInput))
    }
}