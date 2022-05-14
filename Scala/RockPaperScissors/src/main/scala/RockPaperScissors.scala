
import scala.io.StdIn._
import scala.util.Random

class RockPaperScissors{
  private var score: Int=0

  def getScore: Int=score

  def userChoice: String={
    var userChoiceVerified: Boolean=false
    var userChosenOption: String =""

    while(userChoiceVerified==false){
      userChosenOption=readLine("Please pick an option: \n*\tRock \n*\tPaper \n*\tScissors \nChoice:")
      userChosenOption.toLowerCase match{
        case "rock" => userChoiceVerified=true
        case "paper" => userChoiceVerified=true
        case "scissors" => userChoiceVerified=true
        case _ => println("Error Occurred")
      }
    }
    return userChosenOption.toLowerCase
  }

  def computerChoice(): String={
    var computerNumb = new Random
    computerNumb.nextInt(3) match{
      case 0 => return "rock"
      case 1 => return "paper"
      case 2 => return "scissors"
      case _ => null
    }
  }

  def calculateScore(): Unit={
    var user: String=userChoice
    var computer: String=computerChoice

    if(user==computer){
      println("\nDraw!\nNo Points Awarded")
    }else if(((user=="rock")&&(computer=="paper"))||((user=="paper")&&(computer=="scissors"))||((user=="scissors")&&(computer=="rock"))){
      println("\nComputer Wins!")
    }else{
      println("\nYou Win!")
      score+=1
    }

  }
}

object StartRockPaperScissorsGame{
  def main(args:Array[String]): Unit={
    
    var numbRounds: Int=readLine("Please enter number rounds to play: ").toInt
    var Game = new RockPaperScissors

    for(x<-1 to numbRounds){
      println("\nRound: "+x)
      println("Score: "+Game.getScore)
      Game.calculateScore
    }

    println("\nFinal Score: "+Game.getScore+"/"+numbRounds)
    if(Game.getScore < (numbRounds/2)){
      println("Better luck next time.")
    }else if(Game.getScore == numbRounds){
      println("Well done you go full marks.")
    }else{
      println("You got over half marks, well done.")
    }
  }
}
