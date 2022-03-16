package gfx

object DigitCanvas{
    import Array._
    import Compass._
    import Canvas._

    def zero(): Unit={
        square(7)
        turn(right,1)
        move(7)
    }

    def one(): Unit={
        var startPositionX: Int=getX
        setDirection(E)
        move(7)
        setDirection(N)
        setX(startPositionX+3)
        move(7)
        turn(left,3)
        move(2)
    }

    def two(): Unit={
        setX(getX+7)
        setDirection(W)
        move(7)
        turn(right,2)
        move(3)
        turn(right,2)
        move(7)
        turn(left,2)
        move(3)
        turn(left,2)
        move(8)
    }

    def two2(): Unit={
        setX(getX+7)
        setDirection(W)
        move(7)
        turn(right,3)
        move(5)
        turn(left,1)
        move(2)
        turn(left,2)
        move(3)
        turn(left,1)
        move(2)
    }

    def three(): Unit={
        setDirection(E)
        move(7)
        turn(left,2)
        move(3)
        var currentPosition: Int=getX
        turn(left,2)
        move(8)
        turn(right,2)
        setX(currentPosition)
        move(3)
        turn(left,2)
        move(8)

    }

    def four(): Unit={
        setX(getX+4)
        move(3)
        setDirection(S)
        move(1)
        setDirection(N)
        turn(right,2)
        move(3)
        turn(right,4)
        move(7)
        turn(right,2)
        move(4)
    }

    def five(): Unit={
        turn(right,2)
        move(7)
        turn(left,2)
        move(3)
        turn(left,2)
        move(7)
        turn(right,2)
        move(3)
        turn(right,2)
        move(8)
    }

    def six(): Unit={
        var defaultX: Int=getX
        var defaultY: Int=getY

        turn(right,2)
        move(7)
        turn(left,2)
        move(3)
        turn(left,2)
        move(7)
        turn(right,2)

        setXY(defaultX,defaultY)

        move(6)
        turn(right,2)
        move(7)
    }

    def seven(): Unit={
        setY(getY+7)
        turn(right,2)
        move(7)
        turn(right,3)
        move(7)
    }

    def eight(): Unit={
        repeat(4){
            move(6)
            turn(right,2)
        }
        move(3)
        turn(right,2)
        move(6)
    }

    def nine(): Unit={
        setX(getX+7)
        move(6)
        turn(left,2)
        move(6)
        turn(left,2)
        move(3)
        turn(left,2)
        move(6)
    }
}