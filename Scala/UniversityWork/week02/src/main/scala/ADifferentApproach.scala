object ADifferentApproach{
    def main(args: Array[String]): Unit={
        var diameter: Int=25
        var pie: Double=3.1415
        var circumference: Double=(pie*diameter)

        printf("A circle with diameter "+diameter+" has a circumference of %1.2f".format((pie*diameter)))
    }
}