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
          print(field(i)(k))
        }
      }
      println()
    }
  }

  def getPlayerPos(): (Int, Int) = {
    return (0, 0);
  }

  def getScore(): Int = 0

  def moveLeft() {
  }

  def moveRight() {
  }

  def moveUp() {
  }

  def moveDown() {
  }

  def moveLeft(n: Int) {
  }

  def moveRight(n: Int) {
  }

  def moveUp(n: Int) {
  }

  def moveDown(n: Int) {
  }

  def checkCoin() {
  }

  def move(s: String) {
  }

  def maxScore(): Int = 0

  def checkCoins() {
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
    return new Game(List(), List(), 0, 0)
  }

  def initialiseGame3(): Game = {
    return new Game(List(), List(), 0, 0)
  }
}