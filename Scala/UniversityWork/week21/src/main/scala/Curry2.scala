object Curry2{
    
    def eq(c:Char)(d:Char)=c==d

    def main(args:Array[String]): Unit={
        println("aardvark".toList filter (eq('a')))
    }
}