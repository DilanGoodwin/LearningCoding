object UsingVariablesForCalculations{
    def main(args: Array[String]): Unit={
        var diameter: Int=25
        var pie: Double=3.1415
        var circumference: Double=(pie*diameter)

        println("A circle with diameter "+diameter+" has a circumference of "+f"$circumference%1.2f")
    }
}