object template{
  def main(args:Array[String]): Unit={
    var points: Int=0
    games.foreach((x:String)=> if((x.substring(0,1).toInt)==(x.substring(2,3).toInt)){
      points+=1
    }else if((x.substring(0,1).toInt)>(x.substring(2,3).toInt)){
      points+=3
    })
    return points
  }
}
