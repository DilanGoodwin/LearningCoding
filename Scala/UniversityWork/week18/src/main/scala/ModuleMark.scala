import scala.io.StdIn._

object ModuleMark{

    def getResults(course:Int,module:Int): String={
        if((course+module)/2>=40){
            "passed"
        }else if((course+module)/2<40){
            if(course<40){
                "resit coursework"
            }else if(module<40){
                "resit exam"
            }else{
                "resit module"
            }
        }else{
            "invalid inputs"
        }
    }

    def main(args: Array[String]): Unit={
        var courseworkMark: Int=readLine("Please enter coursework percentage: ").toInt
        var examMark: Int=readLine("Please enter exam percentage: ").toInt
        println(getResults(courseworkMark,examMark))
    }
}