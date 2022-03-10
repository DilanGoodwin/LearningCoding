# Week 23: Encapsulating State
## 1. Counter 1
Below there are two Scala object (`Counter` & `UseCounter`), use that code to create a program:
```
object Counter{
  privae var counter: Int=0

  def getValue: Int=counter
  def inc(){
    counter=counter+1
  }
}

object UseCounter{
  def main(args: Array[String]): Unit={
    println(Counter.getValue)
    Counter.inc()
    println(Counter.getValue)
  }
}
```

### 1.1 UseCounter
Run `UseCounter` program & make sure that the correct output is displayed within the terminal/console.

### 1.2 Counter.inc()
Add additional calls to `Counter.inc()` & make sure the outputs are as expected.

### 1.3 Additional Counter
Add a new function to the `Counter` object:
```
  def inc(n: Int){
    for(i<- 1 to n) inc()
  }
```
Call this function within Use.Counter main program checking that the ouput is as expected.

### 1.4 Another Counter
Create the functions below within the `Counter` object & call them within `UseCounter` main program.
* `def setValue(newValue: Int)`
* `def reset() //Resets counter to 0`

## 2. Counter 2
Create a new counter object called `LimitCounter`, purpose of counter is to count either up or down in steps of 1 between lower value & upper value. When the counter reaches the upper value it should wrap around to the lower value. If the counter at a lower value then should wrap around to the upper value.

### 2.1 Mutator Methods
Functions that set or change the encapsulated state value:
* `def reset(lo:Int,up:Int)` Initialises/resets the sate of lower limit=lo, upper limit=up, counter=lo
* `def setLowerLimit(lo:Int)` If counter below new lower limit then makes counter equal new lower limit
* `def setUpperLimit(up:Int)` If counter above new upper limit then make counter equal new upper limit
* `def setToLowerLimit()` Set/resets counter to lower limit
* `def setToUpperLimit()` Set/resets counter to upper limit
* `def inc()` Increment counter - wrapping lower limit when upper limit reached
* `def dec()` Decrement counter - wrapping upper limit when lower limit reached

### 2.2 Accessor Methods
Functions that return values from encapsulated state:
* `def getLowerLimit: Int` Returns current lower limit value
* `def getUpperLimit: Int` Returns current upper limit value
* `def getValue: Int` Returns current counter value
* `def isAtLowerLimit: Boolean` Returns true if counter at lower limit, else false
* `def isAtUpperLimit: Boolean` Returns true if counter at upper limit, else false

### 2.3 Program
Develop Scala object which encapsulates private state & provides functions updating & inspecting state. Write main program another object `UseLimitCounter` demonstrate all functions used. Answer the following questions:
* What happens when lower & upper limits set same value?
</n>
<placeholder>
* What happens when set lower limit above upper limit?
</n>
<placeholder>
* Can you introduce method sets counter value directly `def setValue(newValue:Int)`?

## 3. TestCounter2
Possible use JUnit test functionality LimitCounter object. Want test each functions ensure they complete their job according specification. Argument can be made that simple setters & getters not need testing as they can be easily inspected. But below JUnit test have created local `reset()` method initialise state explicitly. First test case `testInitialValues` used ensure values stored state those specified. Subsequent test cases begin call `reset()` so initial state certain. </n> Below example test cases. Note `@Before`, annotation ensures local method `init()` executed start every test. Allows specify precise initial state `LimitCounter` object before each test takes place.
```
 import org.junit.Test
  import junit.framework.TestCase
  import org.junit.Assert._
  import org.junit.Before
  
  class TestLimitCounter {
    
    @Before def init() {
      LimitCounter.reset(0, 10)
    }
    
    @Test def testInitialValues {
      assertEquals("Lower   should be  0", 0, LimitCounter.getLowerLimit)
      assertEquals("Upper   should be 10",10, LimitCounter.getUpperLimit)
      assertEquals("Counter should be  0", 0, LimitCounter.getValue)
    }
    
    @Test def testSetGetLower {
      LimitCounter.setLowerLimit(5)
      assertEquals("Lower should be 5", 5, LimitCounter.getLowerLimit)
    }
    
    @Test def testSetGetUpper {
      LimitCounter.setUpperLimit(12)
      assertEquals("Upper should be 12", 12, LimitCounter.getUpperLimit)
    }
    
    @Test def testSetCounterLower {
      LimitCounter.setLowerLimit(5)
      LimitCounter.setToLowerLimit()
      assertEquals("Counter should be 5", 5, LimitCounter.getValue)
    }
    @Test def testSetCounterUpper {
      LimitCounter.setUpperLimit(12)
      LimitCounter.setToUpperLimit()
      assertEquals("Counter should be 12", 12, LimitCounter.getValue)
    }
    @Test def testResetUpperLimit1 {
      LimitCounter.setUpperLimit(12)
      LimitCounter.setToUpperLimit()
      LimitCounter.setUpperLimit(8) // i.e. below the counter position
      assertEquals("Counter should be 8", 8, LimitCounter.getValue)
    }
    @Test def testResetUpperLimit2 {
      LimitCounter.setUpperLimit(12)
      LimitCounter.setToUpperLimit()
      LimitCounter.setUpperLimit(15) // i.e. above the counter position
      assertEquals("Counter should still be 12", 12, LimitCounter.getValue)
    }
  
  }
```

### 3.1
Enter above JUnit test class & run it. Do you need make changes any of methods in `LimitCounter` class pass any test cases? If so make appropriate changes & re-run tests.

### 3.2
Add more test class so that you test throughly `LimitCounter` functions. 
</n></n>
Many functions not take input parameters so not easy see how equivalence partitioning or boundary value analysis used. However there natural partitions: below lower limit, between lower & upper, above upper limit. Boundary cases can occur at or just around limits. Think experiments increment & decrement close to limit & also safely. When test `setValue` function, there clear invalid & valid partitions tried.

## 4. TicTacToe
Following program play Tic Tac Toe incomplete. It requires 2 of functions written. Complete functions & play game:
```
object TicTacToe {
  
    import Array._
    
    class Player
    case object O extends Player
    case object X extends Player
    
    var player: Player = _
    var turn: Int = 1
    
    def optPlayerToChar(p: Option[Player]): Char = p match {
      case None    => ' '
      case Some(O) => 'O'
      case Some(X) => 'X'
    }
    
    private var grid: Array[Array[Option[Player]]] = ofDim[Option[Player]](3,3)
  
    /**
     * Reset the grid to an initial state.  All the cells are blank.
     * Player X always starts the game
     */
    def reset() {
      player = X
      turn = 1
      for (i <- 0 to 2; j <- 0 to 2)
        grid(i)(j) = None
    }
    
    def showGrid() {
      println()
      for(j <- 0 to 2) {
          print("  "  + optPlayerToChar(grid(0)(j)))
          print(" | " + optPlayerToChar(grid(1)(j)))
          print(" | " + optPlayerToChar(grid(2)(j)))
          println()
          if (j<2) println(" --- --- --- ")
      }
      println()
    }
    
    def winner(p: Player): Boolean = {
      // check to see if player p has won (i.e. any line of three)
      true // incomplete function, so return a dummy value, true
    }
    
    def inputMove() {
      // get a valid coordinate pair for the current player and update
      // the grid at this position with the player's symbol
    }
    
    def main(args: Array[String]): Unit = {
      reset()
      while(turn < 9 && !winner(X) && !winner(O)) {
      println(s"It is ${optPlayerToChar(Some(player))}'s turn")
        showGrid()
        inputMove()
      }
      showGrid()
      if (winner(X))
        println(s"${optPlayerToChar(Some(X))} won")
      else if (winner(O))
        println(s"${optPlayerToChar(Some(O))} won")
      else
        println("It's a draw")
    }
  
  }
```

# Week 23 Challenges
