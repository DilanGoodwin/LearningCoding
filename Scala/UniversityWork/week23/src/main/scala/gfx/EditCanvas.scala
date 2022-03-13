package gfx

object EditCanvas{
    import Array._
    import Compass._
    import Canvas._

    def fillRectangle(width:Int,height:Int): Unit={
        for(x <- 1 until width){
            move(height)
            if(x%2==0){
                turn(left,2)
                move(1)
                turn(left,2)
            }else{
                turn(right,2)
                move(1)
                turn(right,2)
            }
        }
    }
    def fillSquare(n:Int){
        for(x <- 1 until n){
            move(n)
            if(x%2==0){
                turn(left,2)
                move(1)
                turn(left,2)
            }else{
                turn(right,2)
                move(1)
                turn(right,2)
            }
        }
    }
    def starShape(n:Int){
        repeat(2){
            move(n)
            turn(right,5)
            move(n)
            turn(right,2)
        }
        turn(right,7)
        move(n)
        turn(right,5)
        move(n)
        turn(right,1)
        move(n)
        turn(right,6)
        move(n)
        turn(right,1)
        move(n)
        turn(right,5)
        move(n)
    }
    def spiralShape(n:Int){
        for(i <- 1 to n){
            repeat(i){
                move(i)
                turn(right,1)
            }
        }
    }
    def checkerBoard(){
        def movingLeft(){
            stopWriting
            repeat(2){
                turn(left,2)
                move(1)
            }
            startWriting()
        }

        def movingRight(){
            stopWriting()
            turn(right,2)
            move(1)
            turn(right,2)
            startWriting()
        }

        for(x <- 1 to 1){
            move(3)
            movingLeft()
            move(3)
            movingRight()
            move(3)

            setNib('O')

            movingLeft()
            move(3)
            movingRight()
            move(3)
            movingLeft()
            move(3)

            setNib('X')

            movingRight()
            move(3)
        }
    }
}