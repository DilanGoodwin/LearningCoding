object Counter{
    private var counter: Int=0

    def getValue: Int=counter
    def inc(): Unit={
        counter=counter+1
    }
    
    def inc(n:Int): Unit={
        for(i<-1 to n) inc()
    }

    def setValue(newValue:Int): Unit={
        counter=newValue
    }
    def reset(): Unit={
        counter=0
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
        Counter.setValue(10)
        println(Counter.getValue)
        Counter.reset()
        println(Counter.getValue)
    }
}