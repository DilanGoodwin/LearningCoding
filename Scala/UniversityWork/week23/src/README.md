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

# Challange - ASCII Graphics Library
Note packages are used within this project, packages will be properly explained in Week 25.

## An Example for a Complex Object: gfx
Simple ASCII graphics library will be developed during these challenges to develop skills writing methods/functions operating on mutable state. Graphics library is creating pictures that printed onto console using standard print statements. Examples will develop a `Canvas` object which ASCII art is drawn. Canvas simple 2D array characters which will be maintained using private variable within the Canvas object. There is an example below to demonstrate what the library is able to do:
```
package demo
import gfx.Canvas._
import gfx.Compass._

object Picture1{
  def main(args: Array[String]): Unit={
    setXY(30,7)
    setNib('x')
    setBackground('.')
    setDirection(E)
    startWriting()
    repeat(4){
      square(5)
      turn(right,2)
    }
    paint()
  }
}
```
Above example explained:
* Program has been placed inside a new package called `demo`. The program could have been placed in default package along with the previous programs but instead we created a new package for demo programs.
* Content of 2 objects have been imported: `Canvas` & `Compass`, both programs are within the package `gfx`. Note that an underscore has been used so that everything public within the objects is imported into the current namespace. Private data within `Canvas` & `Compass` are not imported.
* Main program made series function calls that are imported from within `Canvas` & `Compass`. By reading each program you should be able to understand how they work. 
<\n><\n>
When the demo program (`Picture1`) is run it should produce the output below:
```
............................................................
............................................................
.........................xxxxxxxxxxx........................
.........................x....x....x........................
.........................x....x....x........................
.........................x....x....x........................
.........................x....x....x........................
.........................xxxxxxxxxxx........................
.........................x....x....x........................
.........................x....x....x........................
.........................x....x....x........................
.........................x....x....x........................
.........................xxxxxxxxxxx........................
............................................................
............................................................
```
The output shows a canvas painted in dots & a pen nib of 'x'. There is another demo program below for comparision: 
```
package demo
import gfx.Canvas._
import gfx.Compass._

object Picture2{
  def main(args: Array[String]): Unit={
    setXY(0,7)
    setNib('*')
    setBackground(' ')
    setDirection(N)
    startWriting()
    repeat(8){
      move(3)
      turn(right)
    }
    setXY(0,0)
    setDirection(E)
    move(20)
    turn(left,2)
    move(14)
    turn(right,3)
    move(14)
    turn(left,3)
    move(14)
    turn(right,2)
    move(21)
    setXY(50,2)
    setDirection(W)
    move(5)
    turn(right,2)
    move(5)
    square(5)
    paint()
  }
}
```
Ouput of the program above is below:
```
                    *             *********************     
   ****             **            *                         
  *    *            * *           *          ******         
 *      *           *  *          *          *    *         
*        *          *   *         *          *    *         
*        *          *    *        *          *    *         
*        *          *     *       *          *    *         
*        *          *      *      *          ******         
 *      *           *       *     *          *              
  *    *            *        *    *          *              
   ****             *         *   *          *              
                    *          *  *          *              
                    *           * *          ******         
                    *            **                         
*********************             * 
```

# Week 23 Challenges
## 1. Compass
Graphics library uses compass points to indicate each 8 directions. Code for that program is below:
```
package gfx

object Compass {
  class Direction
  case object N  extends Direction
  case object NE extends Direction
  case object E  extends Direction
  case object SE extends Direction
  case object S  extends Direction
  case object SW extends Direction
  case object W  extends Direction
  case object NW extends Direction

  def left(d:Direction): Direction=d match{
    case N  => NW
    case NE => N
    case E  => NE
    case SE => E
    case S  => SE
    case SW => S
    case W  => SW
    case NW => W
  }
  def right(d:Direction): Direction=d match{
    case N  => NE
    case NE => E
    case E  => SE
    case SE => S
    case S  => SW
    case SW => W
    case W  => NW
    case NW => N
  } 
}
```

### 1.1 Package
Within your `src` folder create a package called `gfx`, within that package create `Compass` program above.

### 1.2 Code
Look at the code within compass. What is the purpose of the `left/right` functions?
* <placeholder>

## 2. Canvas
Enter the code below for `Canvas` within the package `gfx`. Once you have copied the code take some time to read through the code looking each aspect. 
```
package gfx

object Canvas {
  import Array._
  import Compass._
  
  private val DEFAULT_DIRECTION: Direction=N
  private val DEFAULT_BACKGROUND: Char='.'
  private val DEFAULT_NIB: Char='*' 
  private val DEFAULT_WIDTH=60
  private val DEFAULT_HEIGHT=15
  private val Xmax: Int=DEFAULT_WIDTH-1
  private val Ymax: Int=DEFAULT_HEIGHT-1

  private var x: Int=0
  private var y: Int=0
  private var direction: Direction=DEFAULT_DIRECTION
  private var background: Char=DEFAULT_BACKGROUND
  private var nib: Char=DEFAULT_NIB
  private var writing: Boolean=false
  private var grid: Array[Array[Option[Char]]]=ofDim[Option[Char]](DEFAULT_WIDTH,DEFAULT_HEIGHT)
  
  /**
   * Accessor methods - public functions to return current state values
   */
  def getX: Int=x
  def getY: Int=y
  def getXY: (Int,Int)=(x,y)
  def getDirection: Direction=direction
  def getBackground: Char=background
  def getNib: Char=nib
  def isWriting: Boolean=writing

  /**
   * Mutator methods to set the x,y coordinates.  The use of max and min
   * ensure that the pen is not placed outside the border of the canvas
   */
  def setX(newX:Int){
    x=Math.min(Math.max(0,newX),Xmax)
  }
  def setY(newY:Int){
    y=Math.min(Math.max(0,newY),Ymax)
  }
  def setXY(newX:Int,newY:Int){
    setX(newX) 
    setY(newY) 
  }

  /**
   * Mutator methods to set the drawing attributes
   */
  def setDirection(d:Direction){
    direction=d
  }
  def setBackground(bg:Char){
    background=bg
  }
  def setNib(n:Char){
    nib=n 
  }

  /**
   * Mutator methods to switch on/off the pen's writing action
   */
  def startWriting(): Unit={
    writing=true
  }
  def stopWriting(): Unit={
    writing=false
  }
  
  /**
   * Reset the canvas to an initial state. All the cells are set to blank. A blank
   * cell is represented by the value None - an Option value that contains nothing.
   */
  def reset(){
    x=0
    y=0
    direction=DEFAULT_DIRECTION
    background=DEFAULT_BACKGROUND
    nib=DEFAULT_NIB
    writing=false
    for(i <- 0 to Xmax; j <- 0 to Ymax){
      grid(i)(j) = None
    }
  }
  
   /**
   * Paint the canvas on the screen (console). Do this by traversing each row and
   * within each row printing each cell in the grid. If the cell is empty (None) then
   * print the background character; otherwise print the character that was written
   * into that cell (i.e. whatever was the nib of the pen at the time). 
   */
  def paint(){
    for (j <- Ymax to 0 by -1){
      for (i <- 0 to Xmax){
        grid(i)(j) match{
          case None => print(background)
          case Some(c) => print(c)
        }
      }
      println()
    }
  }
  
 /**
   * Move the cursor one place in the current direction of travel. If the writing nib
   * is down then leave a mark.  Then adjust the (x, y) coordinates to reflect the new
   * position without moving off the canvas.
   */
  def move(){
    if (isWriting){   // if pen is down then mark the canvas
      grid(x)(y)=Some(nib)
    }
    direction match{ // Adjust (x, y) without moving off the canvas
      case N  => if(y<Ymax){
        y=y+1
      }
      case NE => if((y<Ymax)&&(x<Xmax)){
        y=y+1 
        x=x+1
      }
      case E  => if(x<Xmax){
        x=x+1
      }
      case SE => if((y>0)&&(x<Xmax)){
        y=y-1
        x=x+1
      }
      case S  => if(y>0){
        y=y-1
      }
      case SW => if((y>0)&&(x>0)){
        y=y-1
        x=x-1 
      }
      case W  => if(x>0){
        x=x-1
      }
      case NW => if((y<Ymax)&&(x>0)){
        y=y+1
        x=x-1 
      }
    } 
  }
  
  /**
   * Turn the pen direction either left or right by 45 degrees
   */
  def turn(leftOrRight:Direction => Direction){
    direction=leftOrRight(direction)
  }
  
  /**
   * Repeat an action n times (n). This is just a shorthand for writing
   * for(i <- 1 to n).  This works because in Scala for is a curried function
   * whose second argument is a block of code.  In Scala this can be written
   * in braces { ... } so the result looks like a conventional control structure.
   * Thus we could write   repeat(3){ move() ; turn(right) }
   */
  def repeat(n:Int)(a: =>Unit)=for (i <- 1 to n){
    a
  }

  /**
   * Move n times. This makes use of the repeat function.
   */
  def move(n:Int) {
    repeat(n){
      move()
    }
  }
  
  /**
   * Turn (left or right) n times. This makes use of the repeat function.
   */
  def turn(leftOrRight:Direction => Direction,n:Int){
    repeat(n){
      turn(leftOrRight)
    }
  }

  /**
   * A quick way to draw a square of side n: draw a line of side n and then turn 90
   * degrees, four times.
   */
  def square(n:Int){
    repeat(4){
      move(n)
      turn(right,2)
    }
  }

  /**
   * A quick way to draw an isosceles triangle with base of length b. Only looks
   * good if the base is an even length.
   */
  def tri(b:Int){
    move(b)
    turn(right,3)
    move(b/2)
    turn(right,2)
    move(b/2)
    turn(right,3)
  }

  /* Before anything else, this happens... */  
  reset()
}
```

## 3. EditCanvas
Add following methods `Canvas` library. After each addition create new picture demo program to demonstrate new method action.

### 3.1 Rectangle
Print filled-in rectangle side m by n

### 3.2 Square
Print filled-in square side n

### 3.3 Star
Print star size n

### 3.4 Spiral
Print spiral patter, think parameter need control size spiral printed 

### 3.5 Checkerboard
Print checkerboard m square each size n down each side. Adjust dimensions canvas (`DEFAULT_WIDTH` & `DEAFULT_HEIGHT`) demonstrate method.

## 4. Digits1
Add 10 new methods `Canvas` library, methods should called `zero`,`one`,... Each method print out digit describes within seven by seven box. 

## 5. Digits2
Add new methods canvas library `number(n:Long)` method print number onto canvas. `number(22)` might print:
```
*****    ***** 
*     *  *     *
      *        *
 *****    ***** 
*        *      
*        *      
 ******   ******
```
Once finished method written should print P-number on canvas.

## 6. Canvas2
Canvas not allow cursor (pen nib) move beyond any canvas boundaries. Change behaviour canvas so wraps around. If pen left most column then move left moves nib to corresponding position right most column. Same behaviour should observed top & bottom boundaries. Suggest making copy `Canvas` called `Canvas2`.
<\n><\n>
Write picture program demonstrates painting onto new canvas. Should demonstarte new wrap around feature.
