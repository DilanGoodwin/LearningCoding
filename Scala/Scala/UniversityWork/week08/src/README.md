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

