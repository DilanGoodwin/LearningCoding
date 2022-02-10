object ReusingVariables{
    def main(args: Array[String]): Unit={
        var fullName: String="John"
        fullName=fullName+" Smith"

        println("My name is "+fullName)
    }
}