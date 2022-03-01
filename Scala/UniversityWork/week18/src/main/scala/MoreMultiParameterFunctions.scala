object MoreMultiParameterFunctions{

    def smallerOf3(a:Int,b:Int,c:Int): Int={
        if(a<b&&a<c){
            a
        }else if(b<a&&b<c){
            b
        }else{
            c
        }
    }
    def medianOf3(a:Int,b:Int,c:Int): Int={
        if((a<b&&a>c)||(a>b&&a<c)){
            a
        }else if((b<a&&b>c)||(b<c&&b>a)){
            b
        }else{
            c
        }
    }

    def main(args: Array[String]): Unit={
        for(a<- 1 to 3;b<- 1 to 3;c<- 1 to 3){
            println(s"Smaller of $a and $b and $c is ${smallerOf3(a,b,c)}")
        }
        for(a<- 1 to 3;b<- 1 to 3;c<- 1 to 3){
            println(s"Median of $a and $b and $c is ${medianOf3(a,b,c)}")
        }
    }
}