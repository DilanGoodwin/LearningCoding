object Counter{
    private var counter: Int=0

    def getValue: Int=counter
    def inc(): Unit={
        counter=counter+1
    }
    
    def inc(n:Int): Unit={
        for(i<-1 to n) inc()
    }
}

object UseCounter{
    def main(args: Array[String]): Unit={
        println(Counter.getValue)
        Counter.inc()
        println(Counter.getValue)
        Counter.inc()
        println(Counter.getValue)
        Counter.inc()
        println(Counter.getValue)
    }
}