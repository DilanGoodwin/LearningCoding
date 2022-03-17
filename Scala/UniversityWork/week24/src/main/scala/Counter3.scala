
class Counter{
    private var value: Int=0

    def inc(): Unit={
        value+=1
    }
    def getValue(): Int={
        return value
    }
    def inc(n:Int): Unit={
        for(i <- 1 to n){
            inc()
        }
    }
    def setValue(newValue:Int): Unit={
        value=newValue
    }
    def reset(): Unit={
        value=0
    }
}

object UseCounter{
    def main(args: Array[String]): Unit={
        var counter1: Counter=new Counter()
        println("counter 1: "+counter1.getValue)
        counter1.inc()
        println("counter 1: "+counter1.getValue)
        counter1.inc(5)
        println("counter 1: "+counter1.getValue)
    }
}