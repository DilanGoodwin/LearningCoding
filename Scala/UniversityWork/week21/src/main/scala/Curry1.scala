object Curry1{

    def add(x:Int)(y:Int)=x+y
    def sub(x:Int)(y:Int)=x-y
    def mul(x:Int)(y:Int)=x*y
    def div(x:Int)(y:Int)=x/y
    def mod(x:Int)(y:Int)=x%y

    def main(args: Array[String]): Unit={
        println((1 to 10) map add(2))
        println((1 to 10) map sub(1))
        println((1 to 10) map mul(2))
        println((1 to 10) map div(2))
        println((1 to 10) map mod(2))
    }
}