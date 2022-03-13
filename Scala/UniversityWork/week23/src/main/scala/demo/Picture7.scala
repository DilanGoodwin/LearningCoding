package demo

import gfx.Canvas._
import gfx.EditCanvas._
import gfx.Compass._

object Picture7{
    def main(args: Array[String]): Unit={
        setXY(0,0)
        setNib('x')
        setBackground('.')
        setDirection(E)
        startWriting()
        checkerBoard()
        paint() 
    }
}