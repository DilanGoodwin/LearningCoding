object template{
  def main(args:Array[String]): Unit={
    var answer: Int=0
    if((a+b+c)>answer){
      answer=a+b+c
    }
    if((a*b*c)>answer){
      answer=a*b*c
    }
    if(((a*b)+c)>answer){
      answer=(a*b)+c
    }
    if(((a+b)*c)>answer){
      answer=(a+b)*c
    }
    if((a+(b*c))>answer){
      answer=a+(b*c)
    }
    if((a*(b+c))>answer){
      answer=a*(b+c)
    }
    return answer
  }
}
