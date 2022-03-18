object template{
  def main(args:Array[String]): Unit={
    var repeat: Boolean=true
    var s1: String="()"
    var num: Int=s1.length-1
    
    if(s1.length%2!=0){
      println("False")
    }else{
      while(s1.length-1>2&&repeat==true){
        var x: Int=0
        num=0
        while(x<s1.length-1){
          if(s1(x).toString=="{"||s1(x).toString=="("||s1(x).toString=="["){
            num+=1
          }else{
            x=s1.length
          }
          x+=1
        }
        if(num==0){
          repeat=false
        }else{
          if((s1(num-1).toString=="{" && s1(num).toString=="}") || (s1(num-1).toString=="(" && s1(num).toString==")") || (s1(num-1).toString=="[" && s1(num).toString=="]")){
            s1=s1.substring(0,num-1)+s1.substring(num+1,s1.length)
          }else{
            repeat=false
          }
        }
      }

      if(num==2){
        num-=1
      }
      println(s1)
      println(num)
      if(num==0||num<0){
        println("false")
      }
      if((s1(num-1).toString=="{" && s1(num).toString=="}") || (s1(num-1).toString=="(" && s1(num).toString==")") || (s1(num-1).toString=="[" && s1(num).toString=="]")){
        println(true)
      }else{
        print(false)
      }
    }
  }
}
