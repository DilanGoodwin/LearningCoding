object IntroducingAnonymousFunctions{
    def main(args: Array[String]): Unit={
        println(5%2==0)
        println(6%2==0)
        println((1 to 10) map (x=>x%2==0))
        println((1 to 10) filter (x=>x%2==0))
        println((1 to 10) filter (x=>x%2==0) map (x=>x*x))
    }
}