object ListsAndStrings{
    def main(args: Array[String]): Unit={
        var s1: List[String]=List("Mary","had","a","little","lamb")
        println(s1(0).head+" "+s1(1).toUpperCase.head+" "+s1(2).toUpperCase.head+" "+s1(3).toUpperCase.head+" "+s1(4).toUpperCase.head)
    }
}