package demo

import gfx.Canvas._
import gfx.DigitCanvas._
import gfx.Compass._

object Picture8{
    def main(args: Array[String]): Unit={
        setXY(0,0)
        setNib('#')
        setBackground(' ')
        setDirection(N)
        startWriting()
        nine()
        paint() 
    }
}