import scala.io.StdIn.readInt

object UsingIfAsAnExpression{
    def main(args: Array[String]): Unit={
        println("Type in a number: ")
        var number: Int=readInt()

        var result=if(number%2==0){
            "even"
        }else{
            "odd"
        }

        var result1=if(number>=0){
            "positive"
        }else{
            "negative"
        }

        println("Your number is "+result+" and "+result1)
    }
}