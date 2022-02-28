import scala.io.StdIn.readInt

object  IntroducingIfElseIfElse{
    def main(args: Array[String]): Unit={
        println("Type in a number: ")
        var number=readInt()

        if(number>0){
            println(number+" is positive")
        }else if(number<0){
            println(number+" is negative")
        }else{
            println(number+" is zero")
        }

        var message=if(number>0){
            number+" is positive"
        }else if(number<0){
            number+" is negative"
        }else{
            number+" is zero"
        }
        println(message)
    }
}