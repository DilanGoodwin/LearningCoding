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

  def getPlayerPos(): (Int,Int)={
    return(positionX,positionY)
  }

  def getScore(): Int = score

  def moveLeft(): Unit={
    if(positionX!=0){
      if(field(positionX-1)(positionY)!=0){
        positionX-=1
        checkCoin()
        checkCoins()
      }
    }
  }

  def moveRight(): Unit={
    if(positionX!=9){
      if(field(positionX+1)(positionY)!=0){
        positionX+=1
        checkCoin()
        checkCoins()
      }
    }
  }

  def moveUp(): Unit={
    if(positionY!=0){
      if(field(positionX)(positionY-1)!=0){
        positionY-=1
        checkCoin()
        checkCoins()
      }
    }
  }

  def moveDown(): Unit={
    if(positionY!=9){
      if(field(positionX)(positionY+1)!=0){
        positionY+=1
        checkCoin()
        checkCoins()
      }
    }
  }

  def moveLeft(n: Int): Unit={
    for(x<-1 to n){
      if(positionX!=0){
        if(field(positionX-1)(positionY)!=0){
          positionX-=1
          checkCoin()
          checkCoins()
        }
      }
    }
  }

  def moveRight(n: Int): Unit={
    for(x<-1 to n){
      if(positionX!=9){
        if(field(positionX+1)(positionY)!=0){
          positionX+=1
          checkCoin()
          checkCoins()
        }
      }
    }
  }

  def moveUp(n: Int): Unit={
    for(x<-1 to n){
      if(positionY!=0){
        if(field(positionX)(positionY-1)!=0){
          positionY-=1
          checkCoin()
          checkCoins()
        }
      }
    }
  }

  def moveDown(n: Int): Unit={
    for(x<-1 to n){
      if(positionY!=9){
        if(field(positionX)(positionY+1)!=0){
          positionY+=1
          checkCoin()
          checkCoins()
        }
      }
    }
  }

  def checkCoin(): Unit={
    if(field(positionX)(positionY)>0){
      score+=field(positionX)(positionY)
      field(positionX)(positionY)= -1
    }
  }

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

  def maxScore(): Int={
    var tmpScore: Int=score
    for(y<-0 until 10){
      for(x<-0 until 10){
        if(field(x)(y)>0){
          tmpScore+=field(x)(y)
        }
      }
    }
    return tmpScore
  }

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
        println("Started Coin Collection")
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

  def suggestSolution(): String = ""

  def suggestMove(x: Int, y: Int): String = {
    return ""
  }

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