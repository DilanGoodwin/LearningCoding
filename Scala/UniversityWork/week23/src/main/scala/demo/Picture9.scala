package demo

import gfx.Canvas._
import gfx.Digit2Canvas._
import gfx.Compass._

object Picture9{
    def main(args: Array[String]): Unit={
        setXY(0,0)
        setNib('#')
        setBackground(' ')
        setDirection(N)
        startWriting()
        number(22)
        paint()
    }
}