import scala.io.StdIn._

object ComplexMultiParameterFunctions{

    def gcd(a:Int,b:Int): Int={
        var largestDivisor: Int=0
        if(a<b){
            for(x<- 1 until b){
                if((a%x==0)&&(b%x==0)){
                    if(x>largestDivisor){
                        largestDivisor=x
                    }
                }
            }
        }else{
            for(x<- 1 until a){
                if((a%x==0)&&(b%x==0)){
                    if(x>largestDivisor){
                        largestDivisor=x
                    }
                }
            }
        }
        largestDivisor
    }

    def main(args: Array[String]): Unit={
        var numb1: Int=readLine("Please enter a number: ").toInt
        var numb2: Int=readLine("Please enter a number: ").toInt
        println(gcd(numb1,numb2))
    }
}