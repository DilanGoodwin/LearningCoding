import scala.io.StdIn._

object InputtingLotsOfNumbersIntoAList{
    def main(args: Array[String]): Unit={
        var numbList: List[Int] = List()
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt
        numbList = numbList :+ readLine("Enter number: ").toInt

        println(numbList.reverse)
    }
}