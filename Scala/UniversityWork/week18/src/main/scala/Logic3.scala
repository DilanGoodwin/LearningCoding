object Logic3{

    def and(a:Int,b:Int): Int={
        if((a==1)&&(b==1)){
            1
        }else if((a== -1)&&(b== -1)){
            -1
        }else{
            0
        }
    }
    def or(a:Int,b:Int): Int={
        if((a==1)||(b==1)){
            1
        }else if((a== -1)&&(b== -b)){
            -1
        }else{
            0
        }
    }
    def not(a:Int): Int={
        if(a==1){
            0
        }else if(a== -1){
            -1
        }else{
            1
        }
    }

    def main(args: Array[String]): Unit={
        println("| a | b | a&b | a||b | `a | `b |")
        println("| T | T | "+and(1,1))
        println("| F | T |")
        println("| N | T |")
        println("| F | F |")
        println("| N | F |")
        println("| N | N |")
    }
}