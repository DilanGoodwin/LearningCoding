import scala.io.StdIn._

object SafeArithmetics{

    def add(x:Int,y:Int): Option[Int]={
        if((x<0&&y>0)||(x>0&&y<0)||x==0||y==0){
            Some(x+y)
        }else if(x>0){
            if(Int.MaxValue-x>=y){
                Some(x+y)
            }else{
                None
            }
        }else{
            if(Int.MinValue-x<=y){
                Some(x+y)
            }else{
                None
            }
        }
    }

    def analyseAdd(x:Int,y:Int): Unit={
        add(x,y) match{
            case Some(n) => println(s"Adding $x to $y produces $n")
            case None => println(s"Adding $x to $y causes under/overflow")
        }
    }

    def div(x:Int,y:Int): Option[Int]={
        if(x==0||y==0){
            None
        }else{
            Some(x/y)
        }
    }

    def analyseDiv(x:Int,y:Int): Unit={
        div(x,y) match{
            case Some(n) => println(s"Dividing $x by $y produces $n")
            case None => println(s" Dividing $x by $y causes under/overflow")
        }
    }

    def sub(x:Int,y:Int): Option[Int]={
        var numb1: Int=x
        var numb2: Int=y
        if((x==Int.MinValue&&y>1)||(x==Int.MaxValue&&y>1)){
            None
        }else if(y==0){
            Some(x)
        }else{
            numb1=numb1-1
            numb2=numb2-1
            sub(numb1,numb2)
        }
    }

    def analyseSub(x:Int,y:Int): Unit={
        sub(x,y) match{
            case Some(n) => println(s"Subtracting $x from $y produce $n")
            case None => println(s"Subtracting $x from $y causes under/overflow")
        }
    }

    def main(args: Array[String]): Unit={
        val big: Int = 2147483647
        val small: Int = -2147483648
        val mid0: Int = 46340
        val mid1: Int = 46341

        println("\n\t\tAdding\n")
        analyseAdd(small,small)
        analyseAdd(small,-1)
        analyseAdd(small,big)
        analyseAdd(big,big)
        analyseAdd(big,1)
        analyseAdd(big,small)

        println("\n\t\tDividing\n")
        analyseDiv(small,small)
        analyseDiv(small,-1)
        analyseDiv(small,big)
        analyseDiv(big,big)
        analyseDiv(big,1)
        analyseDiv(big,small)

        println("\n\t\tSubtracting\n")
        analyseSub(small,small)
        analyseSub(small,-1)
        analyseSub(small,big)
        analyseSub(big,big)
        analyseSub(big,1)
        analyseSub(big,small)
    }
}