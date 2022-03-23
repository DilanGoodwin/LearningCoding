
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
}