# Week 8: Arrays
## 1. Introducing Arrays
An array is a data structure used store collections data, they're made up of a sequence of cells/elements containing data. Number cells within given array is fixed at time creation & cells are accessed by index starting at position 0. 

### 1.1 
Copy the code below into a program called `UsingArrays`:
```
object UsingArrays {
  def main(args: Array[String]): Unit = {
    var letters = new Array[Char](5)
    letters(0) = 'a'
    letters(1) = 'b'
    letters(2) = 'c'
    letters(3) = 'd'
    letters(4) = 'e'
    
    println("The letters in your array are:")
    println(letters(0))
    println(letters(1))
    println(letters(2))
    println(letters(3))
    println(letters(4))
  }
}
```
At time of creation the `letters` array is assigned the size of 5, allowing the storing of 5 values with a max indexing value of 4. The indexing value is one lower than the assigned size because indexing starts at 0 rather than 1.

### 1.2
Create a new program called `UsingArrays2` which uses an array (size of your choosing) which stores integer values & prints them out in descending order. Do this without using a loop.

## 2. Processing Arrays
### 2.1 
Copy the code below into a program called `ProcessingArrays`:
```
object ProcessingArrays {
  def main(args: Array[String]): Unit = {
    var nums = new Array[Int](10)
    
    var i = 0
    while (i < nums.length) {
      nums(i) = i
      i += 1
    }
    
    i = nums.length - 1
    while (i >= 0) {
      println(nums(i))
      i -= 1
    }
  }
}
```
More efficient way of adding variables into an array is a loop. Notice how when printing out the variables within the array `nums.length -1` is used, this is because the function `length` starts at 1 but the indexing value of an array starts at 0 so in order to make the length equal to the array index 1 needs to be taken away.

### 2.2
Create new Scala program called `ProcessingArrays2` that acts in a similar way to `ProcessingArrays` but creates an array of 10 strings & uses while loop populate each cell dynamically reading each value from user.

## 3. Arrays in the Interpreter
Enter each of the following pieces of code into the interpreter individually and look at the output & how it changes.
```
new Array[Int](10)
new Array[Char](5)
new Array[Double](8)
new Array[Boolean](6)
new Array[String](5)
new Array[List[Int]](5)
Array[Int](5)
Array[Int](20)
Array[Boolean](5)
Array[Double](5)
Array(5)
Array(10, 20, 30)
Array(1.1, 2.2, 3.3, 4.4)
Array('a','b','c')
Array("pear", "banana", "kiwi")
Array(List(1,2,3), List(4,5,6), List(7,8,9))
Array.range(1, 20)
Array.range(0, 10, 2)
Array.fill(3)("foo")
List(1, 2, 3).toArray
"Hello World".toArray
Array.tabulate(11)(n => n * n)
var x = Array(10, 20, 30, 40, 50)
x(0)
x(10)
x(4)
x(3) = 100
x
x.length
var y = Array(60, 70)
Array.concat(x, y)
var z = new Array[Int](10)
Array.concat(x, z)
new Array(100, 200)
Array(100, 200)
```

## 4. Shorthand Array Initialisation 
Learn how construct array with prefefined values.

### 4.1
Create & run following program, studying the code.
```
object EvenIndex {
  def main(args: Array[String]): Unit = {
     var nums = Array(1,2,3,4,5,6,7,8,9,10)
   
     var i = 0
     while (i < nums.length) {
       println("Index: " + i + " ; Value: " + nums(i))
       i += 2
     }
  }
}
```
Use shorthand initialsiation provide values point creating array instead initially having default values given data type. Size array determine amount values provided point construction. 

### 4.2
Create new Scala object called `OddIndex` behaves similar manner to `EvenIndex` but creates array 10 double values initialised values choice point construction. Use while loop print out elements at each odd index array reverse order.

## 5. Array of Dynamic Sizes
Create array dynamic size provided by user. Create & run following program:
```
import scala.io.StdIn.readInt

object DynamicArrays {
  def main(args: Array[String]): Unit = {
    println("How many numbers would you like to store? ")
    var size = readInt()
    
    var nums = new Array[Int](size)
    
    var i = 0
    while (i < nums.length) {
      println("Number " + (i+1) + " ? ")
      nums(i) = readInt()
      i += 1
    }
    
    println("You typed in: ")
    i = 0
    while (i < nums.length) {
      print(nums(i) + " ")
      i += 1
    }
    
    
    println("\n\nSum of numbers: ")
    var sum = 0
    i = 0
    while (i < nums.length) {
      sum += nums(i)
      i += 1
    }
    println(sum)
    
    
    println("\nSmallest number: ")
    var smallest = nums(0)
    i = 1
    while (i < nums.length) {
      if (nums(i) < smallest) {
        smallest = nums(i)
      }
      i += 1
    }
    println(smallest)
    
    
    println("\nIndex of largest number: ")
    var largestIndex = 0
    var largest = nums(0)
    i = 1
    while (i < nums.length) {
      if (nums(i) > largest) {
        largest = nums(i)
        largestIndex = i
      }
      i += 1
    }
    println(largestIndex)
    

    println("\nNumber of negative numbers: ")
    var count = 0
    i = 0
    while (i < nums.length) {
      if (nums(i) < 0) {
        count += 1
      }
      i += 1
    }
    println(count)
    
    
    println("\nSearch for which number? ")
    var lookup = readInt()
    var found = false
    i = 0
    while (i < nums.length && found == false) {
      if (nums(i) == lookup) {
        found = true
      }
      i += 1
    }
    println("Number found? " + found)
    
  }
}
```
Extend program so it prints out average all numbers within array.

## 6. Writing Your Own Program Using Arrays
Create a program called `Words` which:
* Prompts user to enter an integer determining number words store
* Creates array type String given size
* Populates each cell of array using while loop read words from user
* Uses another loop output each word in upper case on new line, printing out average word length at the end

## 7. Fibonacci Sequence
Fibbonacci number sequence begins: `1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...` Each number sequence is sum previous two numbers. Create a program that:
* Declares integer array size 40 called `fibs` used store first 40 fibonacci numbers
* Assign value 1 each first two elements within array
* Uses while loop dynamically assign correct values each rest array based hardcoded values first two cells
* Once array populated print it out

## 8. Combining Array with Different Control Structures
Run the program below:
```
import scala.io.StdIn.readChar

object LettersMatch {
  def main(args: Array[String]): Unit = {
    var choice = ' '
    var letters = new Array[Int](7)
    do {
      println("Type in a character (! to stop) ")
      choice = readChar()
      choice = choice.toLower
      if (choice.isLetter) {
        choice match {
          case 'a' => letters(0) += 1
          case 'e' => letters(1) += 1
          case 'i' => letters(2) += 1
          case 'o' => letters(3) += 1
          case 'u' => letters(4) += 1
          case _ => letters(5) += 1
        }
      } else {
        letters(6) += 1
      }
    } while (choice != '!')
      
      println("In total you entered the following: ")
      println("a: " + letters(0))
      println("e: " + letters(1))
      println("i: " + letters(2))
      println("o: " + letters(3))
      println("u: " + letters(4))
      println("Consonant: " + letters(5))
      println("Non-Alpha: " + letters(6))
  }
}
```
Extend the program to print out the total number of vowels.

## 9. National Lottery
Learn how to use pre-populated array produce histogram. Using the following declared variable:

```
var lottery = Array(23,16,18,19,26,13,22,    /*  1 ..  7 */
                    20,14,22,18,21,15,17,    /*  8 .. 14 */
                    24,15,18,20,13,14,20,    /* 15 .. 21 */
                    18,22,20,16,19,11,20,    /* 22 .. 28 */
                    16,28,22,20,15,17,17,    /* 29 .. 35 */
                    21,21,19,20,14,22,25,    /* 36 .. 42 */
                    19,17,26,18,20,23,12);   /* 43 .. 49 */
```

Create a program that prints out a histogram showing the information from the array above graphically. 
```
 1 (23)  | ***********************
 2 (16)  | ****************
 3 (18)  | ******************
 4 (19)  | *******************
 5 (26)  | **************************
 6 (13)  | *************
 7 (22)  | **********************
 8 (20)  | ********************
 9 (14)  | **************
10 (22)  | **********************
11 (18)  | ******************
12 (21)  | *********************
13 (15)  | ***************
14 (17)  | *****************
15 (24)  | ************************
16 (15)  | ***************
17 (18)  | ******************
18 (20)  | ********************
19 (13)  | *************
20 (14)  | **************
21 (20)  | ********************
22 (18)  | ******************
23 (22)  | **********************
24 (20)  | ********************
25 (16)  | ****************
26 (19)  | *******************
27 (11)  | ***********
28 (20)  | ********************
29 (16)  | ****************
30 (28)  | ****************************
31 (22)  | **********************
32 (20)  | ********************
33 (15)  | ***************
34 (17)  | *****************
35 (17)  | *****************
36 (21)  | *********************
37 (21)  | *********************
38 (19)  | *******************
39 (20)  | ********************
40 (14)  | **************
41 (22)  | **********************
42 (25)  | *************************
43 (19)  | *******************
44 (17)  | *****************
45 (26)  | **************************
46 (18)  | ******************
47 (20)  | ********************
48 (23)  | ***********************
49 (12)  | ************
```

## 10. Lottery Bars
Rewrite the program from aboce to display bars using underscores & vertical bars as shown below:
```
1 (23)	|_______________________|
 2 (16)	|________________|_
 3 (18)	|__________________|
 4 (19)	|___________________|______
 5 (26)	|__________________________|
 6 (13)	|_____________|________
 7 (22)	|______________________|
 8 (20)	|____________________|
 9 (14)	|______________|_______
10 (22)	|______________________|
11 (18)	|__________________|__
12 (21)	|_____________________|
13 (15)	|_______________|_
14 (17)	|_________________|______
15 (24)	|________________________|
16 (15)	|_______________|__
17 (18)	|__________________|_
18 (20)	|____________________|
19 (13)	|_____________|
20 (14)	|______________|_____
21 (20)	|____________________|
22 (18)	|__________________|___
23 (22)	|______________________|
24 (20)	|____________________|
25 (16)	|________________|__
26 (19)	|___________________|
27 (11)	|___________|________
28 (20)	|____________________|
29 (16)	|________________|___________
30 (28)	|____________________________|
31 (22)	|______________________|
32 (20)	|____________________|
33 (15)	|_______________|_
34 (17)	|_________________|
35 (17)	|_________________|___
36 (21)	|_____________________|
37 (21)	|_____________________|
38 (19)	|___________________|
39 (20)	|____________________|
40 (14)	|______________|_______
41 (22)	|______________________|__
42 (25)	|_________________________|
43 (19)	|___________________|
44 (17)	|_________________|________
45 (26)	|__________________________|
46 (18)	|__________________|_
47 (20)	|____________________|__
48 (23)	|_______________________|
49 (12)	|____________|
```

## 11. Multi-Dimensional Arrays in the Interpreter
Open the Scala interpreter & enter the following commands:
```
Array.ofDim[Int](2,3)
Array.ofDim[Boolean](3,3)
Array(Array(1,2,3,4), Array(5,6,7,8))
Array(Array("pear", "banana"), Array("apple", "kiwi"))
var table = Array(Array(1,2,3), Array(4,5,6), Array(7,8,9))
table(0)
table(1)
table(5)
table(0)(0)
table(2)(0)
table(2)(2)
table(3)(2)
table(1)(1) = 1000
table
table.length
table(0).length
table(1).length
table(0) = Array(22, 44)
table
table(0).length
table(1).length
table.flatten
```

## 12. Two-Dimensional Arrays
Within the project create a new Scala program called `MultiDimensional` & copy the code from below into it:
```
import scala.io.StdIn.readInt

object MultiDimensional {
  def main(args: Array[String]): Unit = {
    println("Rows? ")
    var rows = readInt();	
    
    println("Cols? ")
    var cols = readInt()
    
    var table = Array.ofDim[Int](rows,cols) 
    var i = 0

    while (i < table.length) {	     //could be i < rows
      var j = 0
      while (j < table(i).length) {  //could be j < cols
        table(i)(j) = i + j
        j += 1
      }
      i += 1
    }
    

    i = 0
    
    while (i < table.length) {
      var j = 0
      while (j < table(i).length) {
        print(f"${table(i)(j)}%4d")
        j += 1
      }
      print("\n")
      i += 1
    }
  }
}
```
Program creates a multi-dimensional array (an array within an array). 'ofDim' constructor (ofDimension) used & accepts number rows & columns.

## 13. Processing Multi-Dimensional Arrays
Within your project create Scala program called `MultiDimensionalReverse` & copy code from below into it:
```
import scala.io.StdIn.readInt

object MultiDimensionalReverse {
  def main(args: Array[String]): Unit = {
    println("Rows? ")
    var rows = readInt();	
    
    println("Cols? ")
    var cols = readInt()
    
    var table = Array.ofDim[Int](rows,cols) 
    var i = 0

    while (i < table.length) {
      var j = 0
      while (j < table(i).length) {
        table(i)(j) = i + j
        j += 1
      }
      i += 1
    }  


    i = table.length - 1
    
    while (i >= 0) {	    
      var j = table(i).length - 1
      while (j >= 0) {
        print(f"${table(i)(j)}%4d")
        j -= 1
      }
      print("\n")
      i -= 1
    }
  }
}
```
Program similar to `Two-Dimensional Arrays` program but prints out the array in reverse order. </n></n>
Extend the program so the table is populated randomly. Import Scala's random class using `import scala.utli.Random` & assign new variable using `new Random().nextInt(41)` each cell within the array.

## 14. Multi-Dimensional Times Table
Create a program called `MultiDimensionalTimesTable` & produce a program that creates a times table gird by populating a two dimensional array based on user input of the number rows & columns.

## 15. Patters & Pictures
Make a new program called `Pattern` & copy the code from below into it:
```
object Pattern {
  def main(args: Array[String]): Unit = {
    val rows, cols = 20
    val on = 'X'
    val off = ' '
    
    var grid = Array.ofDim[Char](rows, cols)
    
    var i, j = 0
    
    //populate the grid with patterns
    while (i < rows) {
      j = 0
      while (j < cols) {
        grid(i)(j) = if (i != j) on else off
        j +=1
      }
      i +=1
    }
       

    i = 0
    
    //print the grid
    while (i < rows) {
      j = 0
      while (j < cols) {
        print(" " + grid(i)(j))
        j +=1
      }
      print("\n")
      i +=1
    }
  }
}
```
Program declares a rectangular picture `Char`. Pattern specifically generated by line `grid(i)(j)=if(i!=j) on else off`. Modify the program with different patterns:
```
grid(i)(j) = if (i <= j) on else off
grid(i)(j) = if (i >= j) on else off
grid(i)(j) = if (i <= cols - j - 1) on else off
grid(i)(j) = if (i >= cols - j - 1) on else off
grid(i)(j) = if (i % 4 != j % 4) on else off
grid(i)(j) = if (i % 4 <= j % 4) on else off
grid(i)(j) = if (i % 4 < 2 && j % 4 < 2) on else off
```
