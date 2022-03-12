package demo

import gfx.Canvas._
import gfx.EditCanvas._
import gfx.Compass._

object Picture5{
    def main(args: Array[String]): Unit={
        setXY(10,5)
        setNib('x')
        setBackground('.')
        setDirection(S)
        startWriting()
        starShape(4)
        paint()
    }
}