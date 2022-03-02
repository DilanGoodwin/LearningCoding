import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import TestingWithJUnit._

class TestModuleMarks {
  
  @Test def testFail {
    assertEquals("20 from {0..39}", Fail, getClassification(20))
  }
  
  @Test def testThird {
    assertEquals("45 from {40..49}", Third, getClassification(45))
  }
  
  @Test (expected = classOf[ IllegalArgumentException]) def testIllegalNegative {
    getClassification(-5)
  }
}

class EquivalencePartitioning{
    @Test (expected = classOf[IllegalArgumentException]) def epTestIllegalNegative{
        getClassification(-5)
    }
    @Test def epTestFail{
        assertEquals("20 from {0..39}", Fail, getClassification(20))
    }
    @Test def epTestThird{
        assertEquals("45 from {40..49}", Third, getClassification(45))
    }
    @Test def epTestLowerSecond{
        assertEquals("55 from {50..59}",LowerSecond,getClassification(55))
    }
    @Test def epTestUpperSecond{
        assertEquals("65 from {60..69}",UpperSecond,getClassification(65))
    }
    @Test def epTestFirst{
        assertEquals("75 from {70..100}",First,getClassification(75))
    }
    @Test (expected = classOf[IllegalArgumentException]) def epTestIllegalPositive{
        getClassification(105)
    }
}

class BVA{
    @Test (expected=classOf[IllegalArgumentException]) def bvaTestIllegalNegative{
        getClassification(Int.MinValue)
    }
    @Test (expected=classOf[IllegalArgumentException]) def bvaTestIllegalNegative1{
        getClassification(-1)
    }

    @Test def bvaFail{
        assertEquals("0 from {0..39}",Fail,getClassification(0))
        assertEquals("39 from {0..39}",Fail,getClassification(39))
    }
    @Test def bvaThird{
        assertEquals("40 from {40..49}",Third,getClassification(40))
        assertEquals("49 from {40..49}",Third,getClassification(49))
    }
    @Test def bvaLowerSecond{
        assertEquals("50 from {50..59}",LowerSecond,getClassification(50))
        assertEquals("59 from {50..59}",LowerSecond,getClassification(59))
    }
    @Test def bvaUpperSecond{
        assertEquals("60 from {60..69}",UpperSecond,getClassification(60))
        assertEquals("69 from {60..69}",UpperSecond,getClassification(69))
    }
    @Test def bvaFirst{
        assertEquals("70 from {70..100}",First,getClassification(70))
        assertEquals("100 from {70..100}",First,getClassification(100))
    }

    @Test (expected=classOf[IllegalArgumentException]) def bvaTestIllegalPositive{
        getClassification(101)
    }
    @Test (expected=classOf[IllegalArgumentException]) def bvaTestIllegalPositive1{
        getClassification(Int.MaxValue)
    }
}