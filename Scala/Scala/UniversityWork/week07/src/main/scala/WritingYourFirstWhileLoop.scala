import scala.io.StdIn._

object WritingYourFirstWhileLoop{
    def main(args: Array[String]): Unit={
        var userNumb: Int=readLine("Please enter a number: ").toInt
        var counter: Int=1

        while(counter<=userNumb){
            var result: Int=(userNumb*counter)
            println(f"$counter%4d x $userNumb = $result")
            counter +=1 
        }
    }
}