object IntroducingDifferentTypes{

    def incr(x:Int): Int=x+1
    def decr(x:Int): Int=x-1
    def sqr(x:Int): Int=x*x
    def db1(x:Int): Int=x*2

    def even(x:Int): Boolean=x%2==0
    def odd(x:Int): Boolean=x%2!=0
    def inv(x:Boolean): Boolean=x==true
    def negative(x:Int): Boolean=x<0
    def pal(x:String): Boolean=x==x.reverse
    def strlen(x:String): Int=x.length
    def bracket(x:String): String="( "+x+" )"

    def main(args: Array[String]): Unit={
        println("\n\t\t3.1")
        println(even(5))
        println(even(6))
        println((1 to 10) map even)
        println((1 to 10) filter even)
        println((1 to 10) filter even map sqr)
    }
}