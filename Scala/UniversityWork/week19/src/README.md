# Week19: Unit-Based Testing
Depending on the development environment you are using for these Scala programs will depend on whether the code within this week will work. For those using Eclipse the code will run fine. However, those running Visual Studio code will need to make some changes to how they write the separate testing classes.
<br/>
Rather than adding the testing classes to `src/main/scala/` they will need to be added to a separate sub folder of `src/` called `test`. The directory structure for this should look like: `src/test/scala`, any program tests that are written will need to be placed within this sub directory.
<br/>
Also when importing different frameworks or functions outside of the built in Scala environment you will need to make sure to add their path to the `build.sbt` file (or other build file) that you are running. For JUnit testing the library dependencies are as follows (note these dependencies are just the ones I have had the best luck with when running the Junit framework, you may find that some others may be better than the ones below):
* JUnit Dependencies
  * `libraryDependencies += "junit" % "junit" % "4.13.2"`
  * `libraryDependencies += "com.github.sbt" % "junit-interface" % "0.13.2"% Test`
* Scala Check Dependencies
  * `libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.1" % "test"`
  * `lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.13.4"`
<br/><br/>


## 1. Testing with JUnit
Well used unit testing framework is JUnit which can be used with Scala. Framework allows set up series test cases as functions within test class. This is better shown with an example.
<br/>
University honours degree is classified, once students final average mark known then classification based upon following rules:
* 0 to 39	Fail
* 40 to 49	Third(3rd)
* 50 to 59	Lower Second(2ii)
* 60 to 69	Upper Second(2i)
* 70 to 100	First(1st)
<br/><br/>
Copy the code below into a Scala program which defines some degree classifications with a written function calculate students degree classification.
```
object ModuleMarks {

  class DegreeClassification 
  case object Fail         extends DegreeClassification
  case object Third        extends DegreeClassification
  case object LowerSecond  extends DegreeClassification
  case object UpperSecond  extends DegreeClassification
  case object First        extends DegreeClassification

  def getClassification(grade: Int): DegreeClassification =
    if (grade < 0) throw new IllegalArgumentException
    else if (grade < 40) Fail
    else if (grade < 50) Third
    else if (grade < 60) LowerSecond
    else if (grade < 70) UpperSecond
    else if (grade <101) First
    else throw new IllegalArgumentException

}
```
Parts of the program may need explaining:
* `class DegreeClassification` introduces new general type, name represents something relevant problem solving.
* `case object Fail` introduces new constant value called `Fail`, represents fail degree, which introduced keywords `case object` meaning only one them.
* `extends DegreeClassification` means `Fail` object introduces is instance class `DegreeClassification`, similar way have defined each other outcomes. 
<br/> `Third` is `DegreeClassification`
<br/> `LowerSecond` is `DegreeClassification`
<br/> `UpperSecond` is `DegreeClassification`
<br/> `First` is `DegreeClassification`
* Function maps input percentage represented `Int` value to degree classification. Implemented using `if .. else if ..` construct.
* Valid inputs are between 0 & 100. Possible function receive invalid input which any other `Int` value. If invalid input received functions throws an exception.
<br/><br/>
A separate program can be written to test this function but using JUnit is easier. Create a Scala class called `TestModuleMarks` & copy the code below into it.
```
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import ModuleMarks._

class TestModuleMarks {
 
  @Test def testFail {
    assertEquals("20 from {0..39}", Fail, getClassification(20))
  }

  @Test def testThird {
    assertEquals("45 from {40..49}", Third, getClassification(45))
  }

  @Test (expected = classOf[IllegalArgumentException]) def testIllegalNegative {
    getClassification(-5)
  }
 
}
```
