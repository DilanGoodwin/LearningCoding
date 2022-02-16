# Week 7: While Loops
## 1. Introducing Iteration
### 1.1
Copy the code below into a program called `OneToX`:
```
import scala.io.StdIn.readInt

object OneToX {
  def main(args: Array[String]): Unit = {
    println("Type in a maximum between 2 - 1000: ")
    var max = readInt()
    
    var count: Int = 1 //start value - of the counter
    
    while (count <= max) { //condition - iterate whilst true
      println(f"$count%4d")
      count = count + 1 //update - by incrementing count
    }
  }
}
```
While loop will repeat the code inside body based value provided by user. Code will repeat until the specified condition is met. <br/>
Looking at the program above, it will repeat until the `count` value is less than or equal to the `max` value provided by the user. Each time the while loop runs it prints the current `count` value to the terminal. In order to make sure that the program increases over time the `count` value is incremented by 1 each time. 

### 1.2
Using the code above as a reference create a program called `XToOne` that prints the numbers in descending order rather than ascending order. 

## 2. Writing Your First While Loop
Create a new program called `TimesTable` that does the following:
* Prompts the user to enter an integer value
* Using while loop print out the times table for the given integer value. 
<br/>
Try to make it so the output of the times table is formatted nicely, each row/column should be the same width & length.

## 3. Producing a Character Sequence 
Copy the code below into a Scala program called `CharSeq1`:
```
import scala.io.StdIn.readChar

object CharSeq1 {
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()
    
    println("End character? ")
    var end: Char = readChar()
    
    while (start <= end) {
      print(start + " ")
      start = (start + 1).toChar
    }
  }
}
```
How does the program work?
* <placeholder>

## 4. Order Independent Character Sequence
Create a program called `CharSeq2` that acts like `CharSeq1` with added feature that order 2 characters are entered not significant. Meaning regardless whether higher/lower character entered first sequence still displayed ascending order lowest to highest.

## 5. Ascedning & Descending Character Sequences
Write a program called `CharSeq3` which acts like `CharSeq1` with added functionality:
* First character entered lower than second then sequence printed out ascending order.
* First character entered higher than second then sequence prined descedning order

## 6. Inputting Numbers into a List
Create a Scala program using the code below called `InputNumbersUntil`:
```
import scala.io.StdIn.readInt

object InputNumbersUntil {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List()
 
    print("First number? ")
    var num = readInt()
    
    while (num >= 0) {
      xs = xs :+ num
      
      print("Another number? ")
      num = readInt()
    }
 
    println(xs.reverse)
  }
}
```
What is the program doing?
* <placeholder>

## 7. Producing a Checkout Receipt
Write a Scala program called `Checkout` which adds up numbers as they're typed in. Make sure to use a variable that can store decimals. When 0 entered into program should stop reading numbers & print out grand total & number items entered.

## 8. Using do-while
`do-while` loop ensures that the loop is executed atleast once. 
```
import scala.io.StdIn._

object StringMenu {
  def main(args: Array[String]): Unit = {
    println("Enter a string to analyse ")
    var sentence = readLine()
 
    var cmd = ""

    do {
      println("\nMenu\n====")
      println("Len: string length")
      println("At: character at index")
      println("Sub: substring")
      println("End: exit program")

      cmd = readLine()

      if (cmd == "Len") {
        println("Length is " + sentence.length)

      } else if (cmd == "At") {
        println("Please provide an index")
        var index = readInt()
 
        println("Character at index " + index + " is " + sentence.charAt(index))

      } else if (cmd == "Sub") {
        println("Please provide a start index")
        var sIndex = readInt()
 
        println("Please provide an end index")
        var eIndex = readInt()

        println("Substring between index " + sIndex + " and " + eIndex + " is " + sentence.substring(sIndex, eIndex))
      }

    } while (cmd != "End")

    println("Exiting program...")
  }
}
```
Use the code above to create a program called `StringMenu`.

## 9. List Analysis Menu
Copy code below create a program called `ListMenu`:
```
import scala.io.StdIn._

object ListMenu {
  def main(args: Array[String]): Unit = {
    println("Enter start value of list ")
    var start = readInt()
 
    print("Enter end value of list (exclusive) ")
    var end = readInt()
 
    var xs = List.range(start, end)
 
    var cmd = ""

    do {
      println("\nMenu\n====")
      println("Take: take from list")
      println("TakeR: take from right of list")
      println("Drop: drop from list")
      println("DropR: drop from right of list")
      println("End: exit program")

      cmd = readLine()
      
      //TO COMPLETE...
      
      
    } while (cmd != "End")
 
    println("Exiting program...")
  }
}
```
The program is incomplete, to complete the program add the code so `take`, `takeRight`, `drop` & `dropRight` commands can be run by the program.

## 10. Combining While & If Statements
Create a Scala program called `HighLow` which plays a guessing game. USer keep entering number with program responding saying `Higher` or `Lower` until the user guesses number correctly. In order to make a number for the user to guess you can use a random number generator, this can be done using the following lines of code:
* `import scala.util.Random` - This adds the random number function to the current Scala program
* `var secret: Int=new Random().nextInt(21)` - Creates a new variable with a random number assigned to it between 0-20

## 11. Nested While Loops
Using the code below create a program called `Square`:
```
import scala.io.StdIn.readInt

object Square {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the height and width of the square? ")
    val heightWidth = readInt()
    
    println()
    
    var row: Int = 1
    
    while (row <= heightWidth) {
      
      var col: Int = 1
      
      while (col <= heightWidth) {
        print("* ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
    
  }
}
```
Notice how this program uses a nested while loop. Play around with the numbers within the program to see how it affects the output.

## 12. Drawing a Rectangle
Create a new Scala program called `Rectangle` which behaves similarly to `Square` but draws a rectangle instead. The program should ask the user for the width & height of the rectangle they would like printed to the terminal.

## 13. Generating a Times Table Grid
### 13.1 
Using the programs above as guidance create a program called `TimesTable2` which does the following:
* Ask the user to enter an integer value
* Generates a times table grid up to the integer in either row or column
* Uses formatting to make sure all the columns line up

### 13.2 
Extend the program so that the columns & rows reach equal values.

## 14. Drawing a Trinagle 
Copy the code provided below into a new program called `Triangle1`:
```
import scala.io.StdIn.readInt

object Triangle1 {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()
    
    println()
    
    var row: Int = 1
    
    while (row <= baseHeight) {
      
      var col: Int = 1
      
      while (col <= row) {
        print("* ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
    
  }
}
```
Program above prints out tringale of predetermined base & height. How does this program different from `Square` & `Rectangle`?
* <placeholder>

## 15. Upside Down Triangle 
### 15.1
Create a Scala program called `Triangle2` that prints an upside down triangle of predetermined length to the terminal. <br/> How does this differ from `Triangle1`?
* <placeholder>

### 15.2
To further expand on the program you should make it so the program accepts an integer input from the user, choosing the base size for the triangle.

## 16. Reflected Triangle
Create a program called `Triangle3` which draws a reflected right-angled trianged that accepts its base value from the user.

## 17. Advanced Times Table Grid
Make a copy of the program `TimesTable2` & rename it to `TimesTable3` but change the program so that the row headers & column headers are separated from the rest of the table using `|` & `-`.





























