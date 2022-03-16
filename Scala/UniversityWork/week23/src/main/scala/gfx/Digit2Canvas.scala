package gfx

object Digit2Canvas{
    import Array._
    import Compass._
    import Canvas._
    import DigitCanvas._

    def matchNumbers(n:Int): Unit={
        n match{
            case 0 => zero()
            case 1 => one()
            case 2 => two()
            case 3 => three()
            case 4 => four()
            case 5 => five()
            case 6 => six()
            case 7 => seven()
            case 8 => eight()
            case 9 => nine()
        }
    }

    def number(n:Long): Unit={
        var startX: Int=getX
        var startY: Int=getY
        var firstDigit: Int=0
        var secondDigit: Int=0

        firstDigit=(n%10).toInt
        if(n>10){
            secondDigit=((n%100)/10).toInt
            matchNumbers(secondDigit)
            setXY(startX+10,startY)
            setDirection(N)
            matchNumbers(firstDigit)
        }

        // Separate enter number
        // Print each digit separately with appropriate spacing
    }
}