import scala.io.StdIn.readInt

object NestedIfStatements{
    def main(args: Array[String]): Unit={
        println("Type in a number: ")
        var number: Int=readInt()

        if(number==0){
            println(number+" is zero")
        }else{
            if(number<0){
                println(number+" is negative")
            }else{
                println(number+" is positive")
            }
        }
    }
}