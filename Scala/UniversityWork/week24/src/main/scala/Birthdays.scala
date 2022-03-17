
import scala.io.StdIn._

class Birthday(private var name: String,private var dateBirth:String,private var dayBirth: Int=0,private var monthBirth: Int=0,private var yearBirth: Int=0){

    def this(name:String,dateBirth:String)={
        this(name,dateBirth,0,0,0)
    }
    def expandData(): Unit={
    }
}

object CreateBirthdays{
    def main(args: Array[String]): Unit={

    }
}