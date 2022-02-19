import scala.io.StdIn._
import scala.util.Random

object CombiningWhileAndIfStatements{
    def main(args: Array[String]): Unit={
        var secret: Int=new Random().nextInt(21)
        var guess: Int=readLine("Please enter your guess: ").toInt

        do{
            if(guess<secret){
                println("Higher")
            }else{
                println("Lower")
            }

            guess=readLine("Guess: ").toInt
        }while(guess!=secret)

        println("Well done")
    }
}