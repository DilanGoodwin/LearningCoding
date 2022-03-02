object Curry3{

    def lenString(a:Int)(b:String): Boolean={
        b.length()==a
    }

    def main(args:Array[String]): Unit={
        var words: List[String]=List("apple","pear","banana","peach")
        println(words.filter(lenString(5)))
    }
}