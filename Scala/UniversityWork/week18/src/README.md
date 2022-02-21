# Week 18: Functions 2
## 1. Multi Parameter Functions
Previous week learned how map functions with single input to single output. But functions become more useful when they can accept multiple inputs & provide the user with a single output. Create a program called `MultipleArgs` & copy the code below:
```
object MultipleArgs {

 def largerOf(c: Int, d: Int): Int = if (c>d) c else d

 def main(args: Array[String]): Unit = {

   for(a <- 1 to 3; b <- 1 to 3)
     println(s"Larger of $a and $b is ${largerOf(a,b)}")
 }
}
```
Do you see how it differs when accepting multiple inputs?
* <placeholder>
<br/><br/>
Add a function smaller of `smallerOf: (Int,Int)->Int` returns smaller values 2 inputs.

## 2. More Multi Parameter Functions
Using the program from previous exercise, add the following functions to program & demonstrate them in similar way to previous functions.
* Smaller of 3 function `smallerOf3: (Int,Int,Int)->Int` returns smaller 3 input values.
* Median of 3 function `medianOf3: (Int,Int,Int)->Int` returns median value of 3 inputs. Median value is the number in the middle when all the numbers have been placed into numerical order.

## 3. Complex Multi Parameter Functions

