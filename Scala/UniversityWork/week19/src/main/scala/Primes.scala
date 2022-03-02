object Primes{

    def isPrime(x:Int): Boolean= (x==2)||(x>1)&&(x%2==1)&&((3 to Math.round(Math.sqrt(x)).toInt by 2) forall (x%_!=0))

    def getNextCandidate(x:Int): Int=if(x<=2) 2 else x+(if(x%2==0) 1 else 2)

    def findNextPrime(i:Int): Int={
        var p: Int=i
        while(! isPrime(p)){
            p=getNextCandidate(p)
        }
        p
    }

    def main(args: Array[String]): Unit={
        print("Input starting value: ")
        val n: Int=scala.io.StdIn.readInt()
        println(findNextPrime(n))
    }
}