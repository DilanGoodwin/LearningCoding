package cw

class Game(wall: List[(Int, Int)], coin: List[(Int, Int, Int)], initialX: Int, initialY: Int) {

  private var field: Array[Array[Int]] = Array.ofDim[Int](10, 10)
  private var score: Int = 0
  private var positionX: Int = initialX
  private var positionY: Int = initialY
  private var saveX: Int = -1
  private var saveY: Int = -1

  for (i <- 0 until 10; k <- 0 until 10) field(i)(k) = -1
  wall.foreach(w => field(w._1)(w._2) = 0)
  coin.foreach(w => field(w._1)(w._2) = w._3)

  def rpt(n: Int)(commands: => Unit): Unit={
    for (i <- 1 to n) { commands }
  }

  def printField(): Unit ={
    for(k<-0 until 10){
      for(i<-0 until 10){
        if(positionX==i && positionY==k){
          print("p")
        }else if(saveX==i && saveY==k){
          print("s")
        }else if(field(i)(k)== 0){
          print("w")
        }else if(field(i)(k)== -1){
          print(".")
        }else{
          print("c")
        }
      }
      println()
    }
  }

  def getPlayerPos(): (Int,Int)=(positionX,positionY) // Returns the players current position on the gameboard
  def getScore(): Int=score // Returns the current score of the player

  //START

  /**
    * The following functions all have the same notes attached to them
    * moveLeft(), moveRight(), moveUp(), moveDown()
    * Checks that the player is not currently at the edge of the gameboard 
    * Also checks that there is not a wall where the player would like to move to on the gameboard 
    * If both checks clear then the player is moved & `checkCoin()` is run
    */
  def moveLeft(): Unit={
    if((positionX!=0)&&(field(positionX-1)(positionY)!=0)){
      positionX-=1
      checkCoin()
    }
  }

  def moveRight(): Unit={
    if((positionX!=9)&&(field(positionX+1)(positionY)!=0)){
      positionX+=1
      checkCoin()
    }
  }

  def moveUp(): Unit={
    if((positionY!=0)&&(field(positionX)(positionY-1)!=0)){
      positionY-=1
      checkCoin()
    }
  }

  def moveDown(): Unit={
    if((positionY!=9)&&(field(positionX)(positionY+1)!=0)){
      positionY+=1
      checkCoin()
    }
  }

  /**
    * The following functions all have the same notes attached to them
    * moveLeft(n:Int), moveRight(n:Int), moveUp(n:Int), moveDown(n:Int)
    * Creates a loop for a number provided by the user for which to move in a given direction
    * As all the checks are done in the functions called there is not need to extra checks within the functions calling them
    */
  def moveLeft(n: Int): Unit={
    for(x<-1 to n){
      moveLeft()
    }
  }

  def moveRight(n: Int): Unit={
    for(x<-1 to n){
      moveRight()
    }
  }

  def moveUp(n: Int): Unit={
    for(x<-1 to n){
      moveUp()
    }
  }

  def moveDown(n: Int): Unit={
    for(x<-1 to n){
      moveDown()
    }
  }

  /**
    * checkCoin()
    * Checks to see if the players current position on the field is a coin
    * It does this by checking the value stored in that fields position
    * Ifthe value is greater than 0 then there is a coin there
    * The coins value is then added to score & the value of the field position set to -1
    * Field position is reset to stop the player from being able to collect the same coin over & over again
    */
  def checkCoin(): Unit={
    if(field(positionX)(positionY)>0){
      score+=field(positionX)(positionY)
      field(positionX)(positionY)= -1
    }
    checkCoins()
  }

  /**
    * move(s:String)
    * Takes a string inputted by the user
    * Then creates a for loop for the length of the string
    * Takes a string character from the string at a time 
    * Runs a match statement against the character, running the corressponding movement 
    */
  def move(s: String): Unit={
    for(x<-1 to s.length){
      s.substring(x-1,x) match{
        case "w" => moveUp()
        case "s" => moveDown()
        case "a" => moveLeft()
        case "d" => moveRight()
        case _ => None
      }
    }
  }

  /**
    * maxScore()
    * Goes through all the fields on the gameboard, checking value greater than 1
    * If value is greater than 1 it adds that value to tmpScore
    * tmpScore is returned at the end of its operation
    */
  def maxScore(): Int={
    var tmpScore: Int=score
    for(y<-0 until 10;x<-0 until 10){
      if(field(x)(y)>0){
        tmpScore+=field(x)(y)
      }
    }
    return tmpScore
  }

  /**
    * checkCoins()
    */
  def checkCoins(): Unit={
    var movedX: Int=0
    var movedY: Int=0

    if((saveX!= -1)&&(saveY!= -1)){
      if(saveX<positionX){
        movedX=1+(positionX-saveX)
      }else if(saveX>positionX){
        movedX=1+(saveX-positionX)
      }
      if(saveY<positionY){
        movedY=1+(positionY-saveY)
      }else if(saveY>positionY){
        movedY=1+(saveY-positionY)
      }

      if((movedX*movedY)>9){
        for(y<-saveY to positionY){
          for(x<-saveX to positionX){
            if(field(x)(y)>0){
              score+=field(x)(y)
              field(x)(y)= -1
            }
          }
        }
        saveX= -1
        saveY= -1
      }

    }
  }

  /**
    * 
    */
  def suggestSolution(): String={
    var playerPositionX: Int=positionX
    var playerPositionY: Int=positionY

    // Needs to find the positions of all the coins within the current map
    // Needs to work out how to get to each coin 
    // Returns the moves required to get to each of the coins

    return ""
  }

  /**
    * 
    */
  def suggestMove(x: Int, y: Int): String={
    var suggestedMove: String=""
    
    if(((x>(field.length-1))||(y>field.length-1))||(field(x)(y)==0)){
      return suggestedMove
    }else{
      return suggestedMove
    }
  }

// END

  def save(): Unit = {
    saveX = positionX
    saveY = positionY
  }

  def getSavePos(): (Int, Int) = {
    return (saveX, saveY);
  }

  def setSavePos(saveX: Int, saveY: Int): Unit = {
    this.saveX = saveX
    this.saveY = saveY
  }

}

object GameBuilder {
  def initialiseGame1(): Game = {
    return new Game(List((3, 0), (3, 1), (3, 2)), List((4, 1, 100), (3, 3, 250)), 0, 0)
  }
  def initialiseGame2(): Game = {
    return new Game(List((3,3),(3,4),(3,5),(5,3),(5,4),(5,5)), List((4,4,200),(6,3,200)), 3, 2)
  }
  def initialiseGame3(): Game = {
    return new Game(List((3,0),(3,1),(3,2)), List((4,1,300),(3,3,150)), 4, 1)
  }
}
