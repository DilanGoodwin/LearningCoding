import scala.io.StdIn._

object SumFromTo{

    def sumFromTo(a:Int,b:Int): Int={
        if(a==b){
            a
        }else{
            a+sumFromTo(a+1,b)
        }
    }

    def main(args: Array[String]): Unit={
        var numb1: Int=readLine("Please enter a number: ").toInt
        var numb2: Int=readLine("Please enter a number: ").toInt

        println(sumFromTo(numb1,numb2))
    }
}