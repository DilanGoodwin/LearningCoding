
class Car(private var colour:String,private var make:String,private var maxSpeed:Int,private var currentSpeed:Int){
    def this(colour:String,make:String,maxSpeed:Int)={
        this(colour,make,maxSpeed,0)
    }
    def this(colour:String,make:String)={
        this(colour,make,150)
    }
    def accelerate(): Unit={
        if(currentSpeed<maxSpeed){
            currentSpeed+=1
        }
    }
    def getInfo: String=s"Your $colour $make deives at $currentSpeed, but could go $maxSpeed if you want."
}

object UseCar{
    def main(args: Array[String]): Unit={
        val c1: Car=new Car("silver","Opel")
        val c2: Car=new Car("black","Mercedes",200,50)
        val c3: Car=new Car("faded blue","Trabant",80)

        println(c1.getInfo)
        println(c2.getInfo)
        println(c3.getInfo)

        for(i <- 0 to 300){
            c1.accelerate
        }

        println(c1.getInfo)
    }
}