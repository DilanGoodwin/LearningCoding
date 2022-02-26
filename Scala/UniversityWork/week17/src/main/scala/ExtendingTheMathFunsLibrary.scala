object ExtendingTheMathFunsLibrary{

    def incr(x:Int): Int=x+1
    
    def decr(x:Int): Int=x-1
    def sqr(x:Int): Int=x*x
    def db1(x:Int): Int=x*2

    def main(args: Array[String]): Unit={
        println("\n\t\t2.1")
        println(decr(5))
        println((1 to 10) map decr)
        println((1 to 10) map decr map decr)

        println("\n\t\t2.2")
        println(sqr(5))
        println((1 to 10) map sqr)
        println((1 to 10) map sqr map sqr)
        println((1 to 10) map sqr map incr)

        println("\n\t\t2.3")
        println(db1(5))
        println((1 to 10) map incr map db1)
        println((1 to 10) map db1 map incr)
        println((1 to 10) map sqr map incr map db1)
    }
}