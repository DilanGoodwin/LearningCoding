object YouOnlyNeedOne{
  def main(args:Array[String]): Unit={
    val seq: List[Int]=List(78, 117, 110, 99, 104, 117, 107, 115)
    val elem: Int=8
    
    var answer: Boolean=false


    for(x<-0 to seq.length-1){
      if(seq(x)==elem){
        answer=true
      }
    }

    if(answer==true){
      return true
    }else{
      return false
    }
  }
}
