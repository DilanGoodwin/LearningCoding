# Week 9: For Expressions

## 1. Introducing the For Expression
Create new Scala workspcae called `Week 9` to store your files for this week. During Week 7 we looked at while loops & their use as control structures used mainly for iteration within Scala. Just like a while loop, for loops are also iterative control structures. Create & run a program called `PrintingNumbers` using the code below:
```
object PrintingNumbers {
  def main(args: Array[String]): Unit = {
    
    println("Using 'to':")
    for (x <- 1 to 10) {
      print(x + " ")
    }
    
    println("\n\nUsing 'until':")
    for (x <- 1 until 10) {
      print(x + " ")
    }
    
    println("\n\nUsing 'by':")
    for (x <- 1 to 10 by 2) {
      print(x + " ")
    }
    
    println("\n\nUsing 'by':")
    for (x <- 10 to 1 by -1) {
      print(x + " ")
    }
    
  }
}
```
Looking at the code you can work out how a for loop works. The loop itself is contained within brackets `for(x<-1 to 10)`. The code within the brackets is referred to as a generator & determines how the for expression behaves. In this programs case it produces a range of numbers from 1 to 10. Each iteration of the loop can be called upon using the variable `x` which has the iterations current value state stored within it.
</n>
Now that you have a basic understanding of how for loops work lets look at some more complex values.

## 2. Ranges of Characters
Copy the code below into a program called `PrintingCharacters` & run it:
```
object PrintingCharacters {
  def main(args: Array[String]): Unit = {
    
    println("Using 'to':")
    for (x <- 'a' to 'e') {
      print(x + " ")
    }
    
    println("\n\nUsing 'until':")
    for (x <- 'a' until 'e') {
      print(x + " ")
    }
    
    println("\n\nUsing 'by':")
    for (x <- 'a' to 'z' by 3) {
      print(x + " ")
    }
  }
}
```
Do you see how the different iterations of similar for loops behave, what are the differences & defining differing factors?

## 3. Revisiting Character Sequences
Create and run the followung program:

```
import scala.io.StdIn._

object CharacterSequence{
  def main(args:Array[String]): Unit={
    println("Start character? ")
    var start: Char=readChar()

    println("End character? ")
    var end: Char=readChar()

    if(start<end){
      for(x<-start to end){
        println(x)
      }
    }else{
      for(x<-start.toInt to end.toInt by -1){
        println(x.toChar)
      }
    }
  }
}
```

Program above is similar to the one created when learning about loops. However, this program works out which order the characters have been entered and iterates through them in the appropriate order.

## 4. Numeric Sequence Chooser
Create a program that:
* Prompts the user to enter two integer values
* If first number less than second prints out ascending numeric sequence
* If first number greater than second prints out decending numeric sequence

## 5. Refactoring Previous Solution
Create a new scala program called `TimesTable` that does the following:
* Prompts user to enter integer value
* Uses `for` expression print out times tables of the given value.

## 6.Processing Arrays
### 6.1
Copy the code below into a program:
```
object ProcessingArrays{
  def main(args:Array[String]): Unit={
    var nums=new Array[Int](10)

    for(1<0 until nums.length){
      nums(i)=i+1
    }

    for(x<-nums){
      print(x+" ")
    }
  }
}
```
Within the program above a for loop expression is used to populate each element of an array. A second expression is then used to print out each element within the array.

### 6.2
Update tge program so the size of the array is provided by the user and each elements within the array is also provided by the user.

## 7. An Array of Counters
Create & run the following program:
```
import scala.io.StdIn.readLine

object CharCount{
  def main(args:Array[String]): Unit={
    println("Enter a sentence: ")
    var sentence=readLine()
    
    sentence=sentence.toLowerCase()
    var count=new Array[Int](26)
    
    for(x<-sentence if x.isLetter){
      count(x-97)+=1
    }
    for(x<-'a' to 'z'){
      print(x+": "+count(x-97)+" ")
    }
  }
}
```
Program counter the number of instances there are of each letter within a sentence. Ignores non alphabetical characters.

## 8. Processing Strings
### 8.1 
Create & run the following program:
```
import scala.io.StdIn.readLine

object ProcessingStrings{
  def main(args:Array[String]): Unit={
    println("Type in a sentence: ")
    var sentence: String=readLine()
    
    for(x<-sentence){
      println(x)
    }

    var letterCount: Int=0
    for(x<-sentence if x.isLetter){
      println("Letter: "+x)
      letterCount+=1
    }

    println("Number of letters? "+letterCount)
  }
}
```
For expressions used to iterate through each character stored within the string. 

### 8.2
Update the program so that an additional expression iterates through the sentence & provides a guard filter only characters that are digits. Print out the number of digits at the end of the program.

## 9. Yielding Values
### 9.1
Create & run the following program:
```
object YieldingValues{
  def main(args:Array[String]): Unit={
    var nums=for(x<-1 to 10) yield x*2
    println("1. "+nums)

    var nums2=for(x<-(10 until 0 by -2).toList) yield x
    println("2. "+nums2)

    var nums3=for(x<-(10 to 0 by -2).toList if x<5) yield x
    println("3. "+nums3)

    var nums4=for(x<-(1 until 10).toArray) yield x
    println("4. Array: "+nums4.mkString(" ")) //Printing Values of Array

    var nums5=for(x<-List(10,20,30)) yield x/10
    println("5. "+nums5)

    var chars=for(x<-('a' to 'e').toList) yield x.toUpper
    println("6. "+chars)

    var str=for(x<-"Hello World" if x.isLower) yield x
    println("7. "+str)

  }
}
```

### 9.2
Change some of the examples & experiemnt further with yielding values to produce different types of collections.

## 10. Yielding Dates
Write a program called YearOfBirth that:
* Prompts user to enter year representing their birth
* Uses for expression to yield a `List` of years between entered year & current year
* Uses a second for expression to print each value within the list on a new line

## 11. Filter & Replace Characters
### 11.1
Create & run the following program copying the code:
```
import scala.io.StdIn.readLine

object FilterAndReplace{
  def main(args:Array[String]): Unit={
    println("Enter a sentence: ")
    var sentence:String=readLine()
  }
}
```
