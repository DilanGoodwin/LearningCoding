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

