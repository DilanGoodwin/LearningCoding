
import scala.io.StdIn._

object TicTacToe {
  
    import Array._
    
    class Player
    case object O extends Player
    case object X extends Player
    
    var player: Player = _
    var turn: Int = 1
    
    def optPlayerToChar(p: Option[Player]): Char = p match {
      case None    => ' '
      case Some(O) => 'O'
      case Some(X) => 'X'
    }
    
    private var grid: Array[Array[Option[Player]]] = ofDim[Option[Player]](3,3)

    def reset() {
      player = X
      turn = 1
      for (i <- 0 to 2; j <- 0 to 2)
        grid(i)(j) = None
    }
    
    def showGrid() {
      println()
      for(j <- 0 to 2) {
          print("  "  + optPlayerToChar(grid(0)(j)))
          print(" | " + optPlayerToChar(grid(1)(j)))
          print(" | " + optPlayerToChar(grid(2)(j)))
          println()
          if (j<2) println(" --- --- --- ")
      }
      println()
    }
    
    def winner(p: Player): Boolean = {
        for(i <- 0 to 2){
            var playResult: Int=0
            var playResult2: Int=0
            for(j <- 0 to 2){
                if((grid(i)(j)!=None)&&(grid(i)(j).get==p)){
                    playResult+=1
                }
                if((grid(j)(i)!=None)&&(grid(j)(i).get==p)){
                    playResult2+=1
                }
            }
            if(playResult==3||playResult2==3){
                return true
            }
        }
      false
    }
    
    def inputMove() {
        var xPosition: Int=0
        var yPosition: Int=0
        do{
            xPosition=readLine("Please enter x position of move: ").toInt -1
            yPosition=readLine("Please enter y position of move: ").toInt -1
        }while((grid(xPosition)(yPosition)!=None)&&(xPosition>0)&&(yPosition>0)&&(xPosition<2)&&(yPosition<2))

        grid(xPosition)(yPosition)=Some(player)

        if(player==X){
            player=O
        }else{
            player=X
        }
    }
    
    def main(args: Array[String]): Unit = {
      reset()
      while(turn < 9 && !winner(X) && !winner(O)) {
      println(s"It is ${optPlayerToChar(Some(player))}'s turn")
        showGrid()
        inputMove()
      }
      showGrid()
      if (winner(X))
        println(s"${optPlayerToChar(Some(X))} won")
      else if (winner(O))
        println(s"${optPlayerToChar(Some(O))} won")
      else
        println("It's a draw")
    }
  
  }