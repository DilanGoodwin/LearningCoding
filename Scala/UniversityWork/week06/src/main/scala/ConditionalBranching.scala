import scala.io.StdIn._

object ConditionalBranching{
    def main(args: Array[String]): Unit={
        var userInput: Int=readLine("Please enter a number: ").toInt
        var result=if(userInput==0){
            "zero"
        }else if(userInput==1){
            "one"
        }else if(userInput==2){
            "two"
        }else if(userInput==3){
            "three"
        }else if(userInput==4){
            "four"
        }else if(userInput==5){
            "five"
        }else if(userInput==6){
            "six"
        }else if(userInput==7){
            "seven"
        }else if(userInput==8){
            "eight"
        }else if(userInput==9){
            "nine"
        }else{
            "not a digit"
        }

        println(result.toUpperCase())
    }
}