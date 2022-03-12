package demo

import gfx.Canvas._
import gfx.EditCanvas._
import gfx.Compass._

object Picture3{
    def main(args: Array[String]): Unit={
        setXY(30,7)
        setNib('x')
        setBackground('.')
        setDirection(E)
        startWriting()
        fillRectangle(8,6)
        paint()
    }
}