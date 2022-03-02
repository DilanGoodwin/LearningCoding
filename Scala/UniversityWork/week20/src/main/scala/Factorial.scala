import scala.io.StdIn._

object Factorial{

    def factorial(n:Long): Long={
        if(n==0){
            1
        }else{
            n*factorial(n-1)
        }
    }

    def main(args: Array[String]): Unit={
        println(factorial(8))
        println(factorial(20))

        println("\n"+factorial(21))

    }
}