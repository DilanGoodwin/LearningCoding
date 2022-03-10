
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
    def selLowerLimit(lo:Int): Unit={
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
    def isAtLoverLimit(): Boolean={
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
    def main(args: Array[String]): Unit={
        // Make it so the user enters two values
        // Program counts up from the smaller value to bigger value
        // Then back from bigger value to lower value
        // Use all of the functions within the LimitCounter object
    }
}