import scala.io.StdIn._

object FurtherExploringConditionalLogic{
    def main(args: Array[String]): Unit={
        var numb1: Int=readLine("Please enter a number: ").toInt
        var numb2: Int=readLine("Please enter a number: ").toInt
        var numb3: Int=readLine("Please enter a number: ").toInt

        var result=if((numb1+numb2)==numb3){
            "YES"
        }else if((numb1+numb3)==numb2){
            "YES"
        }else if((numb2+numb3)==numb1){
            "YES"
        }else{
            "NO"
        }

        println(result)
    }
}