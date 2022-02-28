import scala.io.StdIn._

object SimpleSort{
    def main(args: Array[String]): Unit={
        var a: Int=readLine("Please enter a number: ").toInt
        var b: Int=readLine("Please enter a number: ").toInt
        var c: Int=readLine("Please enter a number: ").toInt

        if(a<b && a<c){
            if(b<c){
                println(a+", "+b+", "+c)
            }else{
                println(a+", "+c+", "+b)
            }
        }else if(b<a && b<c){
            if(a<c){
                println(b+", "+a+", "+c)
            }else{
                println(b+", "+c+", "+a)
            }
        }else{
            if(a<b){
                println(c+", "+a+", "+b)
            }else{
                println(c+", "+b+", "+a)
            }
        }
    }
}