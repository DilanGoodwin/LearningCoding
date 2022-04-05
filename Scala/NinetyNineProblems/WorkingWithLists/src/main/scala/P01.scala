
object P01{
  def main(args:Array[String]): Unit={
    var last: List[Int]=List(1,1,2,3,5,8)

    var method1: Int=last.last
    var method2: Int=last(last.length-1) // The length calculated will start from 1 meaning it will produce the number 6 but because the list positioning actually starts at 0 the program the last position within the list would be its length minus 1
  }
}
