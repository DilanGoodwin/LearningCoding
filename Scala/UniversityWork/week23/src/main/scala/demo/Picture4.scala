package demo

import gfx.Canvas._
import gfx.EditCanvas._
import gfx.Compass._

object Picture4{
    def main(args: Array[String]): Unit={
        setXY(30,7)
        setNib('x')
        setBackground('.')
        setDirection(E)
        startWriting()
        fillSquare(8)
        paint()
    }
}