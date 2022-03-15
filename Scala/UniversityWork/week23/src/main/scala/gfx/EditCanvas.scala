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
        for(y <- 0 to 54){
            if(y%3==0||y==0){
                setXY(y,0)
                move(3)
                for(x <- 1 to 14){
                    if(x%2!=0){ // Turn Left
                        stopWriting()
                        repeat(2){
                            turn(left,2)
                            move(1)
                        }
                        startWriting()
                    }else if(x%2==0){ //Turn Right
                        stopWriting()
                        if(y==0){
                            turn(right,2)
                            move(1)
                            turn(right,2)
                        }else{
                            repeat(2){
                                turn(right,2)
                                move(1)
                            }
                        }
                        startWriting()
                    }

                    if(x%3==0){
                        if(getNib=='x'){
                            setNib('O')
                        }else if(getNib=='O'){
                            setNib('x')
                        }
                    }
                    move(3)
                }
                if(getNib=='x'){
                    setNib('O')
                }else if(getNib=='O'){
                    setNib('x')
                }
            }
        }
    }
}