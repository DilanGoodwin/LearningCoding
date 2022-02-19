import scala.io.StdIn._

object DrawingARectangle{
    def main(args: Array[String]): Unit={
        var rowNumb: Int=readLine("Please enter height: ").toInt
        var colNumb: Int=readLine("Please enter width: ").toInt

        var row: Int=1

        while(row<=rowNumb){
            var col: Int=1
            while(col<=colNumb){
                print("* ")
                col +=1
            }
            print("\n")
            row +=1
        }
    }
}