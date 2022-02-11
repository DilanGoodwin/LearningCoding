object MoreOperatorsInTheInterpreter{
    def main(args: Array[String]): Unit={
        var x: Int=3
        var y: Int=7
        var z: Double=5.5

        // 3.1
        println("Average of "+x+" & "+y+" = "+(x+(y/2)))

        // 3.2
        println("Remainder of division of "+y+" & "+x+" = "+(y%x))

        // 3.3
        var result: Double =(x+y)/z
        println(result)

        // 3.4
        println("3.4 result = "+((z-x)/y))

        // 3.5
        x += 1

        // 3.6
        y -= x

        // 3.7
        println(y*3)
    }
}