package gfx

object Canvas{
    import Array._
    import Compass._

    private val DEFAULT_DIRECTION: Direction=N 
    private val DEFAULT_BACKGROUND: Char='.'
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
    private var grid: Array[Array[Option[Char]]]=ofDim[Option[char]](DEAFULT_WIDTH,DEFAULT_HEIGHT)

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
    
}