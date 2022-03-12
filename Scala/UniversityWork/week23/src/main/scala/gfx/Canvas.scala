package gfx

object Canvas{
    import Array._
    import Compass._

    private val DEFAULT_DIRECTION: Direction=N 
    private val DEFAULT_BACKGROUND: Char=' '
    private val DEFAULT_NIB: Char='.'
    private val DEAFULT_WIDTH: Int=60
    private val DEFAULT_HEIGHT: Int=15
    private val Xmax: Int=DEAFULT_WIDTH-1
    private val Ymax: Int=DEFAULT_HEIGHT-1

    private var x: Int=0
    private var y: Int=0
    private var direction: Direction=DEFAULT_DIRECTION
    private var background: Char=DEFAULT_BACKGROUND
    private var nib: Char=DEFAULT_NIB
    private var writing: Boolean=false
    private var grid: Array[Array[Option[Char]]]=ofDim[Option[Char]](DEAFULT_WIDTH,DEFAULT_HEIGHT)

    // Accessor Methods - Public Functions Return Current State Values
    def getX: Int=x
    def getY: Int=y
    def getXY: (Int,Int)=(x,y)
    def getDirection: Direction=direction
    def getBackground: Char=background
    def getNib: Char=nib
    def isWriting: Boolean=writing

    // Mutator Methods Set x,y Coordinates - Use Min & Max Ensure Pen Not Placed Outside Border Canvas
    def setX(newX:Int){
        x=Math.min(Math.max(0,newX),Xmax)
    }
    def setY(newY:Int){
        y=Math.min(Math.max(0,newY),Ymax)
    }
    def setXY(newX:Int,newY:Int){
        setX(newX)
        setY(newY)
    }

    // Mutator Methods Set Drawing Attributes
    def setDirection(d:Direction){
        direction=d
    }
    def setBackground(bg:Char){
        background=bg
    }
    def setNib(n:Char){
        nib=n
    }

    // Mutator Methods Switch On/Off Pens Writing Action
    def startWriting(): Unit={
        writing=true
    }
    def stopWriting(): Unit={
        writing=false
    }

    // Reset Canvas Initial State - All Cells Set Blank Represented By Value None Option Value
    def reset(): Unit={
        x=0
        y=0
        direction=DEFAULT_DIRECTION
        background=DEFAULT_BACKGROUND
        nib=DEFAULT_NIB
        writing=false
        for(i <- 0 to Xmax; j <- 0 to Ymax){
            grid(i)(j)=None
        }
    }

    // Paint Canvas On Screen Do By Traversing Each Row & Within Rows Printing Each Cell Grid
    // Cell Empty Print Background Character Otherwise Print Character Written Into Cell
    def paint(): Unit={
        for(j <- Ymax to 0 by -1){
            for(i <- 0 to Xmax){
                grid(i)(j) match{
                    case None => print(background)
                    case Some(c) => print(c)
                }
            }
            println()
        }
    }

    // Move Cursor One Place Current Direction Travel Writing Nib Down Leave Mark
    // Adjust (x,y) Coordinates Reflect New Position Without Moving Off Canvas
    def move(): Unit={
        if(isWriting){ // Pen Down Mark On Canvas
            grid(x)(y)=Some(nib)
        }
        direction match{ // Adjust (x,y) Without Moving Off Canvas
            case N => if(y<Ymax){
                y+=1
            }
            case NE => if((y<Ymax)&&(x<Xmax)){
                y+=1
                x+=1
            }
            case E => if(x<Xmax){
                x+=1
            }
            case SE => if((y>0)&&(x<Xmax)){
                y-=1
                x+=1
            }
            case S => if(y>0){
                y-=1
            }
            case SW => if((y>0)&&(x>0)){
                y-=1
                x-=1
            }
            case W => if(x>0){
                x-=1
            }
            case NW => if((y<Ymax)&&(x>0)){
                y+=1
                x-=1
            }
        }
    }

    // Turn Pen Direction Either Left/Right By 45 Degrees
    def turn(leftOrRight:Direction => Direction){
        direction=leftOrRight(direction)
    }

    // Repeat Action n Time (n) Shorthand Writing for(i <- 1 to n)
    // Works Scala Curried Function Whose Second Argument Block Code
    // Scala Written Braces {...} Result Looks Like Conventional Control Structure
    def repeat(n:Int)(a: => Unit)=for(i <- 1 to n){
        a
    }

    // Move n Times Makes Use Repeat Function
    def move(n:Int){
        repeat(n){
            move()
        }
    }

    // Turn Left/Right n Times Makes Use Repeat Function
    def turn(leftOrRight:Direction => Direction,n:Int){
        repeat(n){
            turn(leftOrRight)
        }
    }

    // Quick Way Draw Square Side n Draw Line Side n & Turn 90 Degrees 4 Times
    def square(n:Int){
        repeat(4){
            move(n)
            turn(right,2)
        }
    }

    //Quick Way Draw Isosceles Triangle Base Length b Only Looks Good Base Even Length
    def tri(b:Int){
        move(b)
        turn(right,3)
        move(b/2)
        turn(right,2)
        move(b/2)
        turn(right,3)
    }

    //Before Anything Happens
    reset()
}