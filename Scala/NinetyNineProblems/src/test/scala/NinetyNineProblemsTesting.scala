import org.junit.Test
import org.junit.Assert._
import scala.util.Random

class WorkingWithLists {
    @Test def P01Test1 {
        assertEquals("10 from List(1...10)",10,Lists.getLast(List.range(1,11)))
    }
    @Test def P01Test2 {
        assertEquals("100 from List(10...100) by 10",100,Lists.getLast(List(10,20,30,40,50,60,70,80,90,100)))
    }
    @Test def P01Test3 {
        var randNumb=new Random
        var randList: List[Int]=List.range(0,randNumb.nextInt(100))
        assertEquals("Random List",randList(randList.length-1),Lists.getLast(randList))
    }
}
