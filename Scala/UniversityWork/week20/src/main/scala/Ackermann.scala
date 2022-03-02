import scala.io.StdIn._

object Ackermann{

    def ackermann(a:Int,b:Int): Int={
        if(a==0){
            b+1
        }else if((a>0)&&(b==0)){
            ackermann(a-1,1)
        }else{
            ackermann(a-1,ackermann(a,b-1))
        }
    }

    def main(args: Array[String]): Unit={
        var numb1: Int=readLine("Please enter a number: ").toInt
        var numb2: Int=readLine("Please enter a number: ").toInt

        println(ackermann(numb1,numb2))
    }
}