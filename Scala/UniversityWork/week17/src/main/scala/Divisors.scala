object Divisors{

    def countDivisors(n:Int): Int={
        var d: Int=0
        for(k <-1 until n){
            if(n%k==0){
                d +=1
            }
        }
        d
    }

    //def countDivisors1(n:Int): Int=(1 until n)filter(k=>n%k==0)length

    def main(args: Array[String]): Unit={
        
    }
}