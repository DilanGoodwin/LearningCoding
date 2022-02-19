import scala.io.StdIn._

object ReflectedTriangle{
    def main(args: Array[String]): Unit={
        var baseHeight: Int=readLine("Please enter a number: ").toInt
        var col: Int=1
        var spacing: Int=baseHeight

        while(col<=baseHeight){
            var row: Int=1
            while(row<=baseHeight){
                if(spacing<=row){
                    print("* ")
                }else{
                    print("  ")
                }
                row +=1
            }
            col +=1
            spacing -=1
            println()
        }
    }
}