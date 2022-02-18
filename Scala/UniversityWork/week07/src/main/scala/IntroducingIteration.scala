import scala.io.StdIn.readInt

object IntroducingIteration{
    def main(args: Array[String]): Unit={
        println("Type in a maximum between 2 - 1000: ")
        var max: Int=readInt()
        var max1: Int=max
        var count: Int=1 //Start value of the counter

        while(count<=max){ //condition - iterate whilst true
            println(f"$count%4d")
            count=count+1 //update - by incrementing count
        }

        count=1

        while(count<=max1){
            println(f"$max1%4d")
            max1=max1-1
        }
    }
}