import scala.io.StdIn._

object SumList{

    def sumList(xs:List[Int]): Int={
        if(xs.isEmpty){
            0
        }else{
            xs.head+sumList(xs.tail)
        }
    }
    def prodList(xs:List[Int]): Int={
        if(xs.isEmpty){
            1
        }else{
            xs.head*prodList(xs.tail)
        }
    }
    def lenList(xs:List[Int]): Int={
        if(xs.isEmpty){
            0
        }else{
            1+lenList(xs.tail)
        }
    }
    def allTrue(xs:List[Boolean]): Boolean={
        if(xs.isEmpty){
            true
        }else if(xs.head==false){
            false
        }else{
            allTrue(xs.tail)
        }
    }
    def anyTrue(xs:List[Boolean]): Boolean={
        if(xs.isEmpty){
            false
        }else{
            xs.head||anyTrue(xs.tail)
        }
    }

    def main(args: Array[String]): Unit={
        val xList: List[Int]=List(1,2,3,4,5)
        val yList: List[Boolean]=List(true,true,true,false)
        println(sumList(xList)+"\n")
        println(prodList(xList)+"\n")
        println(lenList(xList)+"\n")
        println(allTrue(yList)+"\n")
        println(anyTrue(yList)+"\n")
    }
}