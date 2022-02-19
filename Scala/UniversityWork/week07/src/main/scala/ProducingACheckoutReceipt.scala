import scala.io.StdIn._

object ProducingACheckoutReceipt{
    def main(args: Array[String]): Unit={
        var recipt: Double=readLine("Please enter the amount paid: ").toDouble
        var count: Int=0
        var total: Double=0

        while(recipt!=0){
            total=total+recipt
            count +=1
            println(f"Item $recipt%2.2f")
            recipt=readLine("Please enter the amount paid: ").toDouble
        }

        println(f"Total: $total%2.2f (items $count)")
    }
}