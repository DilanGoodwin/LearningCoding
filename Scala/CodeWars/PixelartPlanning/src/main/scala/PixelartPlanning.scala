
import scala.io.StdIn._

object PixelartPlanning{
  def main(args:Array[String]): Unit={
    var wallLength: Int=readLine("Please enter the length of the wall: ").toInt
    var pixelArtSize: Int=readLine("Please enter the size of the pixelart: ").toInt
    
    if(wallLength%pixelArtSize==0){
      println(true)
    }else{
      println(false)
    }
  }
}
