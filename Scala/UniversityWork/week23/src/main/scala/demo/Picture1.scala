package demo

import gfx.Canvas._
import gfx.Compass._

object Picture1{
  def main(args: Array[String]): Unit={
    setXY(30,7)
    setNib('x')
    setBackground('.')
    setDirection(E)
    startWriting()
    repeat(4){
      square(5)
      turn(right,2)
    }
    paint()
  }
}