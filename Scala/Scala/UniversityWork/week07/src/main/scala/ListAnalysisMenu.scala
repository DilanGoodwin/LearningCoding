import scala.io.StdIn._

object ListAnalysisMenu{
    def main(args: Array[String]): Unit={
        println("Enter start value of list ")
        var start=readInt()

        print("Enter end value of list (exclusive) ")
        var end=readInt()

        var xs=List.range(start,end)

        var cmd=""

        do{
            println("\nMenu\n====")
            println("Take: take from list")
            println("TakeR: take from right of list")
            println("Drop: drop from list")
            println("DropR: drop from right of list")
            println("End: exit program")

            cmd=readLine()

            if(cmd == "Take"){
                var takeNumb: Int = readLine("How many would you like to take: ").toInt
                println("You are taking "+takeNumb+" leaving: "+xs.take(takeNumb))
            }else if(cmd == "TakeR"){
                var takeRNumb: Int = readLine("How many would you like to take: ").toInt
                println("You are taking "+takeRNumb+" leaving: "+xs.takeRight(takeRNumb))
            }else if(cmd == "Drop"){
                var dropNumb: Int = readLine("What would you like to drop: ").toInt
                println("Dropped list is: "+xs.drop(dropNumb))
            }else if(cmd == "DropR"){
                var dropRNumb: Int = readLine("What would you like to drop: ").toInt
                println("Dropped right list is: "+xs.dropRight(dropRNumb))
            }
        }while(cmd!="End")

        println("Exiting program...")
    }
}