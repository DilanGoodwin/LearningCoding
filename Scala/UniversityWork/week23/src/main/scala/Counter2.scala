
import scala.io.StdIn._

object LimitCounter{
    private var lowerLimit: Int=0
    private var upperLimit: Int=10
    private var counter: Int=0

    // Mutator Methods
    def reset(lo:Int,up:Int): Unit={
        lowerLimit=lo
        counter=lo
        upperLimit=up
    }
    def setLowerLimit(lo:Int): Unit={
        lowerLimit=lo
        if(counter<lo){
            counter=lo
        }
    }
    def setUpperLimit(up:Int): Unit={
        upperLimit=up
        if(counter>up){
            counter=up
        }
    }
    def setToLowerLimit(): Unit={
        counter=lowerLimit
    }
    def setToUpperLimit(): Unit={
        counter=upperLimit
    }
    def inc(): Unit={
        counter +=1
    }
    def dec(): Unit={
        counter -=1
    }

    //Accessor Methods
    def getLowerLimit(): Int={
        lowerLimit
    }
    def getUpperLimit(): Int={
        upperLimit
    }
    def getValue(): Int={
        counter
    }
    def isAtLowerLimit(): Boolean={
        if(counter==lowerLimit){
            true
        }else{
            false
        }
    }
    def isAtUpperLimit(): Boolean={
        if(counter==upperLimit){
            true
        }else{
            false
        }
    }

}

object UseLimitCounter{

    def callingLowerLimit(count:Int,iteration:Int): Unit={
        if(count==iteration){
            println("END")
        }else{
            print(LimitCounter.getValue+", ")
            while(LimitCounter.getValue>LimitCounter.getUpperLimit()){
                LimitCounter.dec()
                if(LimitCounter.isAtUpperLimit()){
                    print(LimitCounter.getValue()+"\n")
                }else{
                    print(LimitCounter.getValue()+", ")
                }
            }
            LimitCounter.setToLowerLimit()
            callingLowerLimit(count,iteration+1)
        }
    }
    def callingUpperLimit(count:Int,iteration:Int): Unit={
        if(count==iteration){
            println("END")
        }else{
            print(LimitCounter.getValue+", ")
            while(LimitCounter.getValue<LimitCounter.getUpperLimit()){
                LimitCounter.inc()
                if(LimitCounter.isAtUpperLimit()){
                    print(LimitCounter.getValue()+"\n")
                }else{
                    print(LimitCounter.getValue()+", ")
                }
            }
            LimitCounter.setToLowerLimit()
            callingUpperLimit(count,iteration+1)
        }
    }

    def main(args: Array[String]): Unit={
        println("\n\t\tMethod 1\n")
        LimitCounter.setLowerLimit(readLine("Please enter lower limit: ").toInt)
        LimitCounter.setUpperLimit(readLine("Please enter upper limit: ").toInt)
        LimitCounter.reset(LimitCounter.getLowerLimit(),LimitCounter.getUpperLimit())

        var count: Int=readLine("How many times would you like it to loop: ").toInt
        var iteration: Int=0

        if(LimitCounter.getLowerLimit()>LimitCounter.getUpperLimit()){
            callingLowerLimit(count,iteration)
        }else if(LimitCounter.getUpperLimit()>LimitCounter.getLowerLimit()){
            callingUpperLimit(count,iteration)
        }
    }
}