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

  //Addons
  @Test (expected = classOf[IllegalArgumentException]) def testIllegalNegativeMin{
      getClassification(Int.MinValue)
  }
  @Test def testFailLower{
      assertEquals("0 from {0..39}", Fail, getClassification(0))
  }
  @Test def testFailUpper{
      assertEquals("39 from {0..39}", Fail, getClassification(39))
  }
  @Test def testThirdLower{
      assertEquals("40 from {40..49}", Third, getClassification(40))
  }
  @Test def testThirdUpper{
      assertEquals("49 from {40..49}", Third, getClassification(49))
  }
  @Test def testLowerSecondLower{
      assertEquals("50 from {50..59}",LowerSecond, getClassification(50))
  }
  @Test def testLowerSecond{
      assertEquals("55 from {50..59}",LowerSecond,getClassification(55))
  }
  @Test def testLowerSecondUpper{
      assertEquals("59 from {50..59}",LowerSecond,getClassification(59))
  }
  @Test def testUpperSecondLower{
      assertEquals("60 from {60..69}",UpperSecond,getClassification(60))
  }
  @Test def testUpperSecond{
      assertEquals("65 from {60..69}",UpperSecond,getClassification(65))
  }
  @Test def testUpperSecondUpper{
      assertEquals("69 from {60..69}",UpperSecond,getClassification(69))
  }
  @Test def testFirstLower{
      assertEquals("70 from {70..Int.MaxValue}",First,getClassification(70))
  }
  @Test (expected = classOf[IllegalArgumentException]) def testIllegalFirst{
      getClassification(105)
  }
  @Test (expected = classOf[IllegalArgumentException]) def testIllegalPositiveMax{
      getClassification(Int.MaxValue)
  }
}