
package gfx
import Array._
import Compass._

class Layer(horiz:Int,vert:Int,fg:Char,bg:Char,dir:Direction,wr:Boolean){

    // Fills Blanks User Input Creating Instance Class
    def this(horiz:Int,vert:Int,fg:Char,bg:Char,dir:Direction)={
        this(horiz,vert,fg,bg,dir,false)
    }
    def this(horiz:Int,vert:Int,fg:Char,bg:Char)={
        this(horiz,vert,fg,bg,N,false)
    }
    def this(horiz:Int,vert:Int,fg:Char)={
        this(horiz,vert,fg,'.',N,false)
    }
    def this(horiz:Int,vert:Int)={
        this(horiz,vert,'*','.',N,false)
    }

    // Private Values Layer Class
    private val Xmax: Int=horiz-1
    private val Ymax: Int=vert-1
    private var x: Int=_
    private var y: Int=_
    private var direction: Direction=_
    private var nib: Char=_
    private var background: Char=_
    private var writing: Boolean=_
    private var grid: Array[Array[Option[Char]]]=ofDim[Option[Char]](horiz,vert)

    // Resets Canvas Initial State
    def reset(): Unit={
        x=0
        y=0
        direction=dir
        background=bg
        nib=fg
        writing=wr

        for(i<-0 to Xmax;j<-0 to Ymax){
            grid(i)(j)=None
        }
    }

    // Accessor Methods
    def getX: Int=x
    def getY: Int=y
    def getXY: (Int,Int)=(x,y)
    def getDirection: Direction=direction 
    def getBackground: Char=background
    def getNib: Char=nib 
    def isWriting: Boolean=writing
    def getXmax: Int=Xmax
    def getYmax: Int=Ymax 

    def getPixelAt(i:Int,j:Int): Option[Char]={
        if((i>=0)&&(i<=Xmax)&&(j>=0)&&(j<=Ymax)){
            grid(i)(j)
        }else{
            None
        }
    }

    // Mutator/Setter Methods
    def setX(newX:Int): Unit={
        x=Math.min(Math.max(0,newX),Xmax)
    }
    def setY(newY:Int): Unit={
        y=Math.min(Math.max(0,newY),Ymax)
    }
    def setXY(newX:Int,newY:Int): Unit={
        setX(newX)
        setY(newY)
    }
    def setBackground(bg:Char): Unit={
        background=bg
    }
    def setNib(n:Char): Unit={
        nib=n 
    }
    def setDirection(d:Direction): Unit={
        direction=d 
    }
    def startWriting(): Unit={
        writing=true
    }
    def stopWriting(): Unit={
        writing=false
    }

    // Painting Canvas
    def paint(): Unit={
        for(j<-Ymax to 0 by -1){
            for(i<-0 to Xmax){
                grid(i)(j) match{
                    case None => print(background)
                    case Some(c) => print(c)
                }
            }
            println()
        }
    }

    // Move Cursor
    def move(): Unit={
        if(isWriting){
            grid(x)(y)=Some(nib)
        }

        direction match{
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
            case SE => if((y>0)&&(x>0)){
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

    // Turn Pen Direction
    def turn(leftOrRight:Direction=>Direction): Unit={
        direction=leftOrRight(direction)
    }

    // Repeat Given Action Set n Times
    def repeat(n:Int)(a: =>Unit): Unit={
        for(i<-1 to n){
            a
        }
    }

    // Move n Times
    def move(n:Int): Unit={
        repeat(n){
            move()
        }
    }

    // Turn Right/Left n Times
    def turn(leftOrRight:Direction=>Direction,n:Int): Unit={
        repeat(n){
            turn(leftOrRight)
        }
    }

    // Filled Square
    def filledSquare(n:Int): Unit={
        for(i<-n to 1 by -2){
            square(i)
            turn(right,1)
            move()
            turn(left,1)
        }
    }

    // Square
    def square(n:Int): Unit={
        if(n<2){
            move()
        }else{
            repeat(4){
                move(n-1)
                turn(right,2)
            }
        }
    }

    // Isosoceles Triangle Base Length n
    def tri(n:Int): Unit={
        move(n)
        turn(right,3)
        move(n/2)
        turn(right,2)
        move(n/2)
        turn(right,3)
    }

    // Reflect Canvas About Imaginary Line Vertically
    def flipAboutVertical(): Unit={
        for(i<-0 to Xmax;j<-0 to (Ymax/2)){
            val temp=grid(i)(j)
            grid(i)(j)=grid(i)(Ymax-j)
            grid(i)(Ymax-j)=temp
        }
    }

    // Reflect Canvas Abount Imaginary Line Horizontally
    def flipAbountHorizontal(): Unit={
        for(j<-0 to Ymax;i<-0 to (Xmax/2)){
            val temp=grid(i)(j)
            grid(i)(j)=grid(Xmax-i)(j)
            grid(Xmax-i)(j)=temp
        }
    }

    // Shift All Pixels One Place Right
    def shiftRight(): Unit={
        for(j<-0 to Ymax;i<-Xmax to 1 by -1){
            grid(i)(j)=grid(i-1)(j)
        }
    }

    // Mask
    def mask(other:Layer): Unit={
        for(i<-0 to Xmax;j<-0 to Ymax){
            if(other.getPixelAt(i,j).isEmpty){
                grid(i)(j)=None
            }
        }
    }

    // Week 23 Edit Canvas
    def filledRectangle(width:Int,height:Int): Unit={
        for(x<-1 until width){
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

    def starShape(n:Int): Unit={
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

    def spiralShape(n:Int): Unit={
        for(i<-1 to n){
            repeat(i){
                move(i)
                turn(right,1)
            }
        }
    }

    def checkerBoard(): Unit={
        for(x<-0 to 54){
            if((x%3==0)||(x==0)){
                setXY(x,0)
                move(3)

                for(y<-1 to 14){
                    if(y%2!=0){
                        // Turn Left
                        stopWriting()

                        repeat(2){
                            turn(left,2)
                            move(1)
                        }
                        startWriting()
                    }else if(y%2==0){
                        // Turn Right
                        stopWriting()

                        if(x==0){
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

                    if(y%3==0){
                        if(getNib=='x'){
                            setNib('O')
                        }else if(getNib=='O'){
                            setNib('x')
                        }
                    }
                }
            }
        }
    }

    reset()

}