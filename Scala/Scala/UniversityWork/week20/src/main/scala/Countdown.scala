import scala.io.StdIn._

object Countdown{

    def countdown(n:Int): Unit={
        print(s"$n ")
        if(n==0){
            println("Stopped")
        }else{
            countdown(n-1)
        }
    }

    def countTo10(n:Int): Unit={
        print(s"$n ")
        if(n>=10){
            println("Stopped")
        }else{
            countTo10(n+1)
        }
    }

    def countToN(a:Int, b:Int): Unit={
        print(s"$a ")
        if(a>=b){
            println("Stopped")
        }else{
            countToN(a+1,b)
        }
    }

    def reverseCountToN(a:Int, b:Int): Unit={
        print(s"$b ")
        if(b<=a){
            println("Stopped")
        }else{
            reverseCountToN(a,b-1)
        }
    }

    def main(args: Array[String]): Unit={
        var userNumb: Int=readLine("Please enter a number: ").toInt
        var countTo: Int=readLine("Please enter number to count to: ").toInt
        countdown(userNumb)
        countTo10(userNumb)
        countToN(userNumb, countTo)
        reverseCountToN(userNumb,countTo)
    }
}