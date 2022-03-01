import scala.io.StdIn._

object AdvancedFunctions2{

    def perfect(n:Long): Boolean={
        var sum: Int=0
        for(loop <-1 until n.toInt){
            if(n%loop==0 && loop!=n){
                sum = sum + loop
            }
        }
        if(sum==n){
            return true
        }else{
            return false
        }
    }

    def main(args: Array[String]): Unit={
        var userInput: Long=readLine("Please enter a number: ").toLong
        println(perfect(userInput))
    }
}