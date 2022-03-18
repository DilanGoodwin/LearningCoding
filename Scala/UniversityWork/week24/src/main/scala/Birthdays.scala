
import scala.io.StdIn._

class Birthday(private var name: String,private var dayBirth: Int=0,private var monthBirth: Int=0,private var yearBirth: Int=0){
    def getName(): String=name
    def getDay(): Int=dayBirth
    def getMonth(): Int=monthBirth
    def getYear(): Int=yearBirth
}

object CreateBirthdays{
    def main(args: Array[String]): Unit={
        var bList: List[Birthday]=List(new Birthday("John Smith",1,1,1990),new Birthday("Alice Hamilton",24,12,1983),new Birthday("Chelsea McLean",29,3,2002),new Birthday("Joseph Wallace",5,4,1992))

        bList.filter(fYear => fYear.getYear >= 1990).foreach(fYear => println(fYear.getName))
        println()
        bList.filter(fMonth => fMonth.getMonth < 4).foreach(fMonth => println(fMonth.getName))

    }
}
