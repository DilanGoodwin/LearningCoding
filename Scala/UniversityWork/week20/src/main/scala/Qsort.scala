object Qsort{

    def qsort(xs:List[Int]): List[Int]={
        if(xs.isEmpty){
            xs
        }else{
            var lesser=xs.tail.filter(_<=xs.head)
            var greater=xs.tail.filter(_>xs.head)
            qsort(lesser)++(xs.head::qsort(greater))
        }
    }

    def main(args: Array[String]): Unit={
        var xs: List[Int]=List(5,4,2,3,1)
        println(xs)
        println(qsort(xs))
    }
}