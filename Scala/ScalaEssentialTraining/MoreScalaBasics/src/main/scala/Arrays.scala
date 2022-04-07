import scala.util.Random

object Arrays{

  def averagesArray(x:Array[Int]): Int={
    return (sumArray(x)/x.length)
  }
  def minArray(x:Array[Int]): Int={
    var minValue: Int=100
    for(i<-0 until x.length){
      if(x(i)<minValue){
        minValue=x(i)
      }
    }
    return minValue
  }
  def maxArray(x:Array[Int]): Int={
    var maxValue: Int=0
    for(i<-0 until x.length){
      if(x(i)>maxValue){
        maxValue=x(i)
      }
    }
    return maxValue
  }
  def sumArray(x:Array[Int]): Int={
    var sumValues: Int=0
    for(i<-0 until x.length){
      sumValues +=x(i)
    }
    return sumValues
  }

  def main(args:Array[String]): Unit={
    var numbs: Array[Int]=Array.ofDim[Int](10)
    for(x<-0 until 10){
      var newNumber: Int=new Random().nextInt(100)
      numbs(x)=newNumber
      print(newNumber+", ")
    }

    println()
    
    println("Average values within array: "+averagesArray(numbs))
    println("Min value within array: "+minArray(numbs))
    println("Max value within array: "+maxArray(numbs))
    println("Sum values within array: "+sumArray(numbs))
  }
}
