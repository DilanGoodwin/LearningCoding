import scala.io.StdIn._

object AdvancedTimesTableGrid{
    def main(args: Array[String]): Unit={
        var tableSize: Int=readLine("Please enter table size: ").toInt
        var col: Int=1
        var row: Int=0
        var firstRun: Boolean=true

        while(row<=tableSize){
            print(f"$row%4d |")
            row +=1
        }

        row=0
        println()

        while(row<=tableSize){
            print("------")
            row +=1
        }

        println()

        while(col<=tableSize){
            row=1
            if(firstRun==true){
                print(f"$col%4d |")
                firstRun=false
            }else{
                while(row<=tableSize){
                var result: Int=(col*row)
                print(f"$result%4d |")
                row +=1
            }
            col +=1
            println()
            firstRun=true
            }
        }
    }
}