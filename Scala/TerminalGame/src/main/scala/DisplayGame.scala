
import scala.io.StdIn._

object DisplayGame{
    def main(args:Array[String]): Unit={
        var input:String=""
        var round:Int=1
        var currentGame:Game=GameBuilder.initialiseGame1()

        while(!input.equals("q")){
            println("Round: "+round)
            println("Score: "+currentGame.getScore)
            println("Max Score: "+currentGame.maxScore)
            currentGame.DisplayField()
            input=readLine("Enter move: ")

            println()
        }
    }
}