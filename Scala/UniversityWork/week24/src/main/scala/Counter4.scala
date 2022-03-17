
import scala.io.StdIn._

class LimitCounter{
    private var lowerLimit: Int=0
    private var upperLimit: Int=10
    private var currentCounter: Int=0

    // Mutator Methods
    def reset(lo:Int,up:Int): Unit={
        lowerLimit=lo
        upperLimit=up
        currentCounter=lo
    }
    def setLowerLimit(lo:Int): Unit={
        lowerLimit=lo

        if(currentCounter<lowerLimit){
            currentCounter=lo
        }
    }
    def setUpperLimit(up:Int): Unit={
        upperLimit=up

        if(currentCounter>upperLimit){
            currentCounter=upperLimit
        }
    }
    def setToLowerLimit(): Unit={
        currentCounter=lowerLimit
    }
    def setToUpperLimit(): Unit={
        currentCounter=upperLimit
    }
    def inc(): Unit={
        currentCounter +=1
        if(currentCounter>upperLimit){
            currentCounter=lowerLimit
        }
    }
    def dec(): Unit={
        currentCounter -=1
        if(currentCounter<lowerLimit){
            currentCounter=upperLimit
        }
    }

    // Accessor Methods
    def getLowerLimit(): Int=lowerLimit
    def getUpperLimit(): Int=upperLimit
    def getValue(): Int=currentCounter

    def isAtLowerLimit(): Boolean={
        if(currentCounter==lowerLimit){
            true
        }else{
            false
        }
    }
    def isAtUpperLimit(): Boolean={
        if(currentCounter==upperLimit){
            true
        }else{
            false
        }
    }
}

object UseLimitCounter{
    def main(args: Array[String]): Unit={
        var counter1: LimitCounter=new LimitCounter()
        var counter2: LimitCounter=new LimitCounter()

        counter1.setLowerLimit(readLine("Please enter lower limit counter 1: ").toInt)
        counter1.setUpperLimit(readLine("Please enter upper limit counter 1: ").toInt)
        counter2.setLowerLimit(readLine("Please enter lower limit counter 2: ").toInt)
        counter2.setUpperLimit(readLine("Please enter upper limit counter 2: ").toInt)

        counter1.reset(counter1.getLowerLimit(),counter1.getUpperLimit())
        counter2.reset(counter2.getLowerLimit(),counter2.getUpperLimit())
    }
}