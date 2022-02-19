import scala.io.StdIn._

object GeneratingATimesTable{
    def main(args: Array[String]): Unit={
        var tableNumb: Int=readLine("Please enter number: ").toInt
        var countCol: Int=1

        while(countCol<=tableNumb){
            var countRow: Int=1
            
            while(countRow<=tableNumb){
                var result: Int=countCol*countRow
                print(f"$result%5d")
                countRow +=1
            }
            countCol +=1
            println()
        }
    }
}