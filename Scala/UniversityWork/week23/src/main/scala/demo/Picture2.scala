package demo

import gfx.Canvas._
import gfx.Compass._

object Picture2{
  def main(args: Array[String]): Unit={
    setXY(0,7)
    setNib('*')
    setBackground(' ')
    setDirection(N)
    startWriting()
    repeat(8){
      move(3)
      turn(right)
    }
    setXY(0,0)
    setDirection(E)
    move(20)
    turn(left,2)
    move(14)
    turn(right,3)
    move(14)
    turn(left,3)
    move(14)
    turn(right,2)
    move(21)
    setXY(50,2)
    setDirection(W)
    move(5)
    turn(right,2)
    move(5)
    square(5)
    paint()
  }
}