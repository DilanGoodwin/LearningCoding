
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
                x+=1
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
}