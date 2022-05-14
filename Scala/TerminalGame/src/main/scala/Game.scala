
import scala.io.StdIn._

class AdventureGame(wall:List[(Int,Int)],coin:List[(Int,Int,Int)],enemy:List[(Int,Int,Int)],fieldWidth:Int,fieldLength:Int,startX:Int,startY:Int){
    private var gameField: Array[Array[Int]]=Array.ofDim[Int](fieldWidth,fieldLength)
    private var score: Int=0
    private var positionX: Int=startX
    private var positionY: Int=startY
    
    for(x<-0 until fieldWidth;y<-0 until fieldLength){gameField(x)(y)= -1}
    wall.foreach(x=>gameField(x._1)(x._2)=0)
    coin.foreach(x=>gameField(x._1)(x._2)=x._3)

    def DisplayField(): Unit={
        for(y<-0 until fieldLength){
            for(x<-0 until fieldWidth){
                if((positionY==y)&&(positionX==x)){
                    print("P")
                }else if(gameField(x)(y)==0){
                    print("W")
                }else if(gameField(x)(y)== -1){
                    print(".")
                }else{
                    print("C")
                }
            }
            println()
        }
    }

    def playerPosition(): (Int,Int)=(positionX,positionY)
    def getScore(): Int=score

    def platerMovement(moves:String): Unit={
      for(x<-0 until moves.length){
        moves.toLowerCase.charAt(x) match{
          case 'w' => if((positionY!=0)&&(gameField(positionX)(positionY-1)!=0)){positionY-=1}
          case 'a' => if((positionX!=0)&&(gameField(positionX-1)(positionY)!=0)){positionX-=1}
          case 's' => if((positionY!=(fieldLength-1))&&(gameField(positionX)(positionY+1)!=0)){positionY+=1}
          case 'd' => if((positionX!=(fieldWidth-1))&&(gameField(positionX+1)(positionY)!=0)){positionX+=1}
          case _ => null
        }
        checkCoin()
      }
    }

    def checkCoin(): Unit={
      if(gameField(positionX)(positionY)>0){
        score+=gameField(positionX)(positionY)
        gameField(positionX)(positionY)= -1
      }
    }
    def maxScore(): Int={
      var calculatedMaxScore: Int=0
      for(y<-0 until fieldLength){
        for(x<-0 until fieldWidth){
          if(gameField(x)(y)>0){
            calculatedMaxScore+=gameField(x)(y)
          }
        }
      }
      return calculatedMaxScore
    }

}

object GameBuilder{
  // AdevntureGame(WallList,CoinList,EnemyList,Width,Length,StartingX,StartingY)
  def initialiseGame1(): AdventureGame={
    return new AdventureGame(List((3,0),(3,1),(3,2)),List((4,1,100),(3,3,250)),List(),10,10,0,0)
  }
  def initialiseGame2(): AdventureGame={
    return new AdventureGame(List((3,3),(3,4),(3,5),(5,3),(5,4),(5,5)), List((4,4,200),(6,3,200)),List(),10,10, 3, 2)
  }
}

object DisplayGame{
  def main(args:Array[String]): Unit={
    var userInput: String=""
    var round: Int=1
    var level:AdventureGame=GameBuilder.initialiseGame1()
    var levelMax: Int=level.maxScore()

    while(userInput!="q"){
      println("Round: "+round)
      println("Score: "+level.getScore+"/"+levelMax)
      level.DisplayField()

      userInput=readLine("Enter move: ")
      level.platerMovement(userInput)

      round+=1
      println()
    }
  }

  def startGame(levelNumb:Int){
    var listLevels: List[String]=List("initialiseGame1()","initialiseGame2()")

    var userInput: String=""
    var round: Int=1
    var level:AdventureGame=GameBuilder.listLevels(levelNumb)
    var levelMaxScore: Int=level.maxScore()

    while(userInput!="q"){
      println("Round: "+roun+"\nScore: "+level.getScore+"/"+levelMax)
      level.DisplayField()


    }
  }
}
