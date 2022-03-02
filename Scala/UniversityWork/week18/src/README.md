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
Within the previous program add function `gcd: (Int,Int)->Int` & demonstrate it similar way other functions. 
<br/>
Greatest common divisor 2 integer numbers largest integer that be divided into both numbers. The answer may be one of the two integers.

## 4. Module Mark
Assume a particular module has an assessment piece & coursework piece. Each component is equally weighted. Pass module overall mark must be greater or equal 40%. Resits applied any component that failed.
<br/>
Create program called `ModuleResults` & write Scala function `getResult: (Int,Int)->String`
* Inputs 2 integer values - one representing coursework mark & other as representing examination mark both represented as percentage.
* Calculates overall module mark
* Returns one following results depending on outcome:
```
"passed"		if the overall mark is greater than or equal to 40
"resit coursework"	if the overall mark is less than 40 but only the coursework was failed
"resit exam"		if the overall mark is less than 40 but only the exam was failed
"resit module"		if the overall mark is less than 40 and both components were failed
"invalid inputs"	if any of the input values was invalid (out of permitted range)
```
Test the function with mutliple inputs to show a range of outputted results.

## 5.mathfuns4
Consider the Scala program below:
```
object MathFuns4 {

 def add(x: Int, y: Int): Int = x+y
 def sub(x: Int, y: Int): Int = x-y
 def mul(x: Int, y: Int): Int = x*y
 val div: (Int,Int) => Int = (x,y) => x/y

 def main(args: Array[String]): Unit = {

   println( (1 to 10) map (add(_,1)) )
   println( (1 to 10) map (sub(0,_)) )
   println( (1 to 10) map (mul(_,2)) )
   println( (1 to 10) map (div(100,_)) )
 }
}
```
Look at the data type of the functions. Can you see a potential problem?
* <placeholder>
<br/><br/>
Due to data type `Int` only having fixed representation 4 bytes if the number reaches its maximum values `2147483647` if 1 is added to it then the number will just loop round. Add the code below to the program for the code above:

```
   val big: Int = 2147483647
   val small: Int = -2147483648
   val mid0: Int = 46340
   val mid1: Int = 46341

//    println( s"$big + 1 = ${add(big, 1)}" )
//    println( s"$big + $small = ${add(big, small)}" )
//    println( s"$small + (-1) = ${add(small, -1)}" )
//    println( s"$small - 1 = ${sub(small, 1)}" )
//    println( s"$big * 2 = ${mul(big, 2)}" )
//    println( s"$mid0 * $mid0 = ${mul(mid0, mid0)}" )
//    println( s"$mid0 * $mid1 = ${mul(mid0, mid1)}" )
//    println( s"$mid1 * $mid1 = ${mul(mid1, mid1)}" )
//    println( s"$big / 0 = ${div(big, 0)}" )
```

These last experiments are dramatic because causes program throw exception, better identify error & handle it rather than ignore it. There are several different ways to stop these errors from occuring:
* Using `try ... catch` mechanism
* Testing preconditions by checking values before calling functions that can cause errors. This could be done by wrapping an if statement around the function call.
* Lifting return type from `T` to `option[T]`. Faster way handling exceptional results & approach that developed within further exercises.

# Week 18 Challenges 
## 6. mathfuns5
Program crashes & overflow errors that go unchecked allow for exploitation. Working with functions that are unchecked means the user should be checking the results to make sure the inputs do not cause errors. Scala includes an `Option` type which can return the result from the program or an empty container. Look at the program below:
```
def add(x: Int, y: Int): Option[Int] = {
   if ((x<0 && y>0) || (x>0 && y<0) || x==0 || y==0)
     // if x and y have different signs or x or y equal zero then cannot overflow
     Some(x+y)      // therefore safe to add
   else if (x>0) {
     // both x and y must be greater than zero and overflow could occur
     if (Int.MaxValue - x >= y)
       Some(x+y)   // it is safe to add
     else
       None        // overflow would occur
   }
   else {
     // both x and y must be less than zero and underflow could occur
     if (Int.MinValue - x <= y)
       Some(x+y)   // it is safe to add
     else
       None        // underflow would occur
   }
 }
```
Note the following:
* Function signature is now `add: (Int,Int)->Option[Int]`
* Where a result is possible it is returned by `Some(result)`
* As function returns optional integers they cannot be treated just as normal integer values. 
* Function becomes more complex which adds time before execution, while in this example it adds only nanoseconds of time the more complex your program the bigger the time increase.
<br/><br/>
Create a program called `MathFuns5` & add the following code:

```
object MathFuns5 {

 def add(x: Int, y: Int): Option[Int] = {
   if ((x<0 && y>0) || (x>0 && y<0) || x==0 || y==0)
     // if x and y have different signs or x or y equal zero then cannot overflow
     Some(x+y)      // therefore safe to add
   else if (x>0) {
     // both x and y must be greater than zero and overflow could occur
     if (Int.MaxValue - x >= y)
       Some(x+y)   // it is safe to add
     else
       None        // overflow would occur
   }
   else {
     // both x and y must be less than zero and underflow could occur
     if (Int.MinValue - x <= y)
       Some(x+y)   // it is safe to add
     else
       None        // underflow would occur
   }
 }

 def analyseAdd(x: Int, y: Int): Unit = {
   add(x, y) match {
     case Some(n) => println(s"Adding $x to $y produces $n")
     case None    => println(s"Adding $x to $y causes under/overflow")
   }
 }

 def main(args: Array[String]): Unit = {
   val big: Int = 2147483647
   val small: Int = -2147483648
   val mid0: Int = 46340
   val mid1: Int = 46341

   analyseAdd(small,small)
   analyseAdd(small,-1)
   analyseAdd(small,big)
   analyseAdd(big,big)
   analyseAdd(big,1)
   analyseAdd(big,small)
 }
}
```

Looking at the program code a functions has been added called `analyseAdd` this is done so that when an empty container is returned it doesn't create a hole in the output & instead runs the `case None` avoiding an error. `match` statement has also returned & is only used when displaying the result of the `add` function.
<br/>
Using the `add` functions & `analyseAdd` function as guidelines create the function `div: (Int, Int)->Option[Int]`. The only error that you have to account for is division by 0. Write an `analyseDiv` function to display the results from `div` function.

## 7. Safe Arithmetics
Look at the `MathFuns5` program & complete the operations by adding safe subtraction & multiplication functions to the program. You can use a type conversion to `Long` to test whether a number will exceed the 4 byte limit of `Int`.

## 8. logic3
Within a 2 values logic system a variable is either true or false, if it is not true then it is false & if it is not false then it is true. However 3 valued logic system uses NULL as well as true & false, when something is not true & it is not false then it is classed as NULL. It is possible to represent a 3 valued logic table using Int using the following:
* T represented by 1
* F represented by 0
* N represented another value
<br/><br/>
Create a program `Logic3` that:
* Defines each following function for 3 valued logic:<br/>
`and: (Int,Int)->Int`<br/>
`or: (Int,Int)->Int`<br/>
`not: Int->Int`
* Prints out truth table for each operation
