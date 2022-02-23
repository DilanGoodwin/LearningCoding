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
The import statements include the relevant unit testing framework components to the program. The `import ModuleMarks._` brings the contents of the ModuleMarks program into the test. `@Test` is an annotation that states the following function is a test case which take in no input values & return on output. `assertEquals` is a JUnit assertation, first argument is string describes the test which is optional but good practice to include. Second argument is the expected value with the third argument being the actual value. 
<br/>
`(ecpected = classOf[IllegalArgumentException])` how tell test case that an exception is expected, ensures that when functions is tested & throws an exception then the test has succeeded. 

## 2. Extending the Test Case Using Equivalence Partitions
Equivalence partitionaing is based on dividing inputs into disjointed partitions which any value from within partition is similar any other. Similarity is if the test fails with any particular partition then likely fail with any other value drawn same partition. On the other hand if it passes the tast with particular value chosen from a partition then likely pass test with any other value from same partition. 
<br/>
An example for using this would be if we wanted to test function `sign(x:Int): Int` which returns `-1` if input parameter is negative, `0` if the input parameter is `0` & `1` if the parameter is positive. Overall there are a possible 4294967296 inputs but they can be split into 3 partitions: negative numbers, zero & positive numbers. If function correctly categorises any negative number then expect it categorise all negative numbers correctly. This allows you to test all inputs using just 3 examples rather than creating tests for all 4294967296. 

### Rules for Equivalence Paritioning
Two rules to apply for equivalence partitioning:
* Partitions must pairwise disjoint, means no two partitions overlap.
* Partitions must cover entire domain, means partitions taken together must contain all possible values in input domain.
<br/><br/>
Dealing number ranges quite straightforward ensure two conditions met, split number range on boundaries starting minimum integer & working throught to maximum integer. However same principles should apply when dealing with non-numeric types.
<br/>
Extend `TestModuleMarks` by adding test for each of the rows within the following table. Each row represents an equivalence partition.

| Partition           | (EP) Typical Input Value | Expected Result          | Comment       |
| ------------------  | -------------------------|:------------------------:|:-------------:|
| {Int.MinValue..-1}  | -5                       | IllegalArgumentException | Invalid Input |
| {0..39}             | 20                       | Fail                     | Valid Input   |
| {40..49}            | 45                       | Third                    | Valid Input   |
| {50..59}            | 55                       | LowerSecond              | Valid Input   |
| {60..69}            | 65                       | UpperSecond              | Valid Input   |
| {70..100}           | 75                       | First                    | Valid Input   |
| {101..Int.MaxValue} | 105                      | IllegalArgumentException | Invalid Input |
| ------------------- | ------------------------ | ------------------------ | ------------- |

## 3. Introducing Errors
Now we are going to introduce some errors into the `getClassification` function. Remove 2 lines of code so you are left with the following:
```
if (grade < 0) throw new IllegalArgumentException
    else if (grade < 60) LowerSecond
    else if (grade < 70) UpperSecond
    else if (grade <101) First
    else throw new IllegalArgumentException
```
By doing this all of the cases are not covered properly. Purpose of this is to show what happens in JUnit when errors are foound. Run the JUnit test & see what happens.

## 4. Introducing More Errors
Put the testing function back to its original state & then modify the code again to introduce a new error type, specifically change all the conditions so that you check for less than or equal to instead of less than.
```
  def getClassification(grade: Int): Degree =
    if (grade <= 0) throw new IllegalArgumentException
    else if (grade <= 40) Fail
    else if (grade <= 50) Third
    else if (grade <= 60) LowerSecond
    else if (grade <= 70) UpperSecond
    else if (grade <=101) First
    else throw new IllegalArgumentException
```
Re-run the JUnit test, does it find the errors?
* <placeholder>

## 5. BVA
Given program errors likely revealed at boundaries, useful choose some test values either side boundary between 2 partitions. Increases number tests within partitions themselves but not significantly. Possibility catching errors at boundaries high makes effective testing technique. All test cases can be summarised within table:

| Partition         | (EP) Typical Value | (BVA) Boundary Values |
| ----------------- | ------------------ | --------------------- |
| Negative Integers | -300               | -2147483648, -1       |
| Zero              | 0                  |                       |
| Positive Integers | 300                | 1, 2147483647         |
| ----------------- | ------------------ | --------------------- |

Time add some more tests cases to `ModuleMarks` program. So far test cases only performed equivalence partitioning. Now generate cases boundary analysis, first identify the boundary values & write JUnit test cases each one. 

# Week 19 Challenges
## 6. Stepwise Refinement 
During implementation phase technique used called stepwise refinement where incomplete executable code produced. Functions which not been developed are subsituted by stubs (incomplete functions simulate behaviour by returning pre-selected values. 
<br/>
Example: suppose program required get input from user & print next number that prime. Code:
* `main` function read starting value call `findNextPrime` function & print result
* `findNextPrime` function takes starting value & finds next number that prime number. Achieves this by iterating loop testing current number see if prime or not.
* `getNextCandidate` function generates next candidate number that could be prime. Dummy implementation returns next number ascending order but not optimal because even numbers cannot be prime.
* `isPrime` functions tests see if input parameter prime number, not been implemented at stage. Make comple set return true, clearly need refinement later.
<br/><br/>
```
def isPrime(x: Int): Boolean = true       // not written - dummy value returned

def getNextCandidate(x: Int): Int = x+1   // not written - dummy calculation 
    
def findNextPrime(i: Int): Int = {
  var p: Int = i
  while (! isPrime(p)) {           // control specified through the use
    p = getNextCandidate(p)        // of a while loop and function calls
  }
  p
}
  
def main(args: Array[String]): Unit = {
  print("Input starting value: ")
  val n: Int = scala.io.StdIn.readInt()
  println(findNextPrime(n))
}
```
Program consists code that compiles & runs. However not meet specification until incomplete functions been implemented. Neertheless working code provides outline structure which evolve into working solution. `isPrime` function refined by replacing arbitary return value code performs calculation:
```
def isPrime(x: Int): Boolean =
  (x==2) || (x>1) &&
            (x%2==1) &&
            ((3 to Math.round(Math.sqrt(x)).toInt by 2) forall (x % _ != 0))
```
Version function program closer working solution. Proceed refine `getNextCandidate` function. Stub wrote earlier contains arbitary calculation simply adding one. Further refinement be: `def getNextCandidate(x: Int): Int = x + (if (x%2==0) 1 else 2)`

## 7. Primes
Now that stepwise refinement has been introduced create the following Scala object & run the program to understand how it operates:
```
object FindNextPrime {
  
  def isPrime(x: Int): Boolean =
    (x==2) || (x>1) &&
              (x%2==1) &&
              ((3 to Math.round(Math.sqrt(x)).toInt by 2) forall (x % _ != 0))

  def getNextCandidate(x: Int): Int = x + (if (x%2==0) 1 else 2)

  def findNextPrime(i: Int): Int = {
    var p: Int = i
    while (! isPrime(p)) {           // control specified through the use
      p = getNextCandidate(p)        // of a while loop and function calls
    }
    p
  }
  
  def main(args: Array[String]): Unit = {
    print("Input starting value: ")
    val n: Int = scala.io.StdIn.readInt()
    println(findNextPrime(n))
  }

}
```
Create a JUnit test for the program above, purpose is to allow testing individual functions. Following code will start you off. There are two new JUnit attributes: `assertTrue` & `assertFalse` which are used for testing the behaviour of Boolean variables.
```
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import FindNextPrime._

class TestFindNextPrime {
  
  @Test def testIsPrime1 {
    assertFalse("Negative numbers are not prime", isPrime(-5))
  }
  
  @Test def testIsPrime2 {
    assertFalse("0 is not prime", isPrime(0))
  }
  
  @Test def testIsPrime3 {
    assertFalse("1 is not prime", isPrime(1))
  }
  
  @Test def testIsPrime4 {
    assertTrue("2 is the lowest prime", isPrime(2))
  }
  
  @Test def testIsPrime5 {
    assertTrue("3 is prime", isPrime(3))
  }
 
  @Test def testIsPrime6 {
    assertFalse("4 is not prime", isPrime(4))
  }
}
```
The table below can be used as reference for `isPrime` function testing:

| Partition                           | (EP) Typical Input Value | Expected Result |
| -------------------------------     | ------------------------ | --------------- |
| {Int.MinValue..-1}                  | -5                       | False           |
| {0..1}                              | 0                        | False           |
| primes between 2 & Int.MaxValue     | 7                        | True            |
| non-primes between 2 & Int.MaxValue | 10                       | False           |
| ----------------------------------- | ------------------------ | --------------- |

Make sure test cases are created that complete the table above, consider boundaries extreme cases each partition.

## 8. Next Candidate
Within the `getNextCandidate` function care is taken to move to the next odd integer value. Returning even integers doesn't merit value as they cannot be prime numbers, unless the integer is 2. Considering the fact that the program contains a bug design a test case for the function to find the bug.
<br/>
Once the bug has been located fix the program to pass the test that you have created.
