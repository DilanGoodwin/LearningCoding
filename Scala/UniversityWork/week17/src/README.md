# Week 17: Functions 1
## 1. Introducing Functions
What is a function? Function is the mapping of input values to their output values, within mathematics this is done using set theory which would display the information as such: `incr={x:z•(x,x+1)}`. The `incr` function stated takes in an integer value & increments the value by 1, hence `x+1`. This type of function maps an integer to an integer which can be represented using `z -> z` which when added to our set theory notation results in `incr={x:z->z•(x,x+1)}`. <br/>
Whithin Scala notation this can be done in the following way: `def incr(x:Int): Int=x+1`. Looking at the set theory above you should be able to see how it has been translated into the actual Scala syntax. <br/>
Now that the basics have been looked at time to make a program. Copy the code below into a new Scala program called `MathFuns1`:
```
object MathFuns1 {
  
  def incr(x: Int): Int = x+1
  
  def main(args: Array[String]): Unit = {
    println(incr(5))
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)
  }
}
```
Look at how the program works, what are the map commands doing in this context?
* <placeholder>

## 2. Extending the mathFuns Library
### 2.1
Write a decrement function `decr: Int->Int` which returns input minus one. Use the `incr` function as a template. <br/>
Once the function has been created add the following lines of code to experiment with it:
```
println(decr(5))
println((1 to 10) map decr)
println((1 to 10) map decr map decr)
```

### 2.2
Create a square function `sqr: Int->Int` which returns the sqaure of its inputs. Test the functions with the following commands:
```
println(sqr(5))
println((1 to 10) map sqr)
println((1 to 10) map sqr map sqr)
println((1 to 10) map sqr map incr)
```

### 2.3
Write double function `db1: Int->Int` which returns double of input. Add the following lines of code to demonstrate how the `db1` function works:
```
println(db1(5))
println((1 to 10) map db1)
println((1 to 10) map incr map db1)
println((1 to 10) map db1 map incr)
println((1 to 10) map sqr map incr map db1)

## 3. Introducing Different Types
### 3.1
Create a new object program that is a copy of `MathFuns2`. <br/>
The even function tests integer input & returns true if the input is even & false oterwise. For this to be possible the return type of the function is Boolean rather that Integer. Adding this function to the program would be as follows: `def even(x:Int):Boolean= x%2==0`. <br/> Adding the lines of code below will demonstrate how the even function works:
```
println(even(5))
println(even(6))
println((1 to 10) map even)
println((1 to 10) filter even)
println((1 to 10) filter even map sqr)
```

### 3.2
Now that you understand the basics of how the Scala syntax for functions work add the following functions below to `MathFuns2`:
#### 1. Odd
Odd predicate `odd: Int->Int`. Returns true when input is odd number & false otherwise.
#### 2. Inverse
Inverse operator `inv: Boolean->Boolean`. Returns true when input is false & false when input is true.
#### 3. Negative
Negative predicate `negative: Int-> Boolean`. Returns true when input is negative number & false otherwise.
#### 4. Palindrome
Palindrome predicate `pal: String->Boolean`. Returns true when input string is palindrome (is equal to itself in reverse) & false otherwise.
#### 5. Strlen
Strlen function `strlen: String->Int`. Returns length of the input String.
#### 6. Bracket
Bracket function `bracket: String->String`. Returns input string surrounded by brackets.

## 4. Introducing Alternative Function Definitions 
When creating definitions there is a way to create them in a way that is closer to the set theory syntax. Looking at the code below you can see the different way that a function can be defined:
```
object MoreFuns {
  
 val incr: Int => Int = x => x+1
  
 def main(args: Array[String]): Unit = {
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)  
  }
}
```
Breaking this down you can see that `val incr` has been used to define a new immutable value called `incr`, the value has then been defined as an integer using `Int=>Int`, the next section after this defines what the function does `=x=> x+1` where the value of x (passed to the function) is changed.

## 5. Introducing Anonymous Functions
In the previous exercises we created different functions but is there really a need to create different functions for everything? Rather than creating functions we can add the functionality that the function creates directly to the area we are trying to run it. An example of this would be: `println((1 to 10) map (x=>x+1))` the code shows how the `incr` function could be directly added to the print line statement where it is called upon rather than calling to the external function. <br/>
Create a copy of the program `MathFuns2` called `MathFuns3` but replace all the print lines that call functions with print lines that have the functions built into them.

## 6. Divisors
Functions looked at so far have all been comprised of a single line, this is not the only way that a function can be used, after all `main` is a function. Look at the example below:
```
def countDivisors(n: Int): Int = {
   var d: Int = 0
   for (k <- 1 until n)
     if (n%k==0)
       d = d+1
   d
 }
```
The very last line of the function retruns the value, in this case `d`. However sometimes it is easier to adopt a function style rather than using many different types. Following code for `countDivisors` does the same as the program aboe but all on a single line: `def countDivisors(n:Int): Int=(1 until n) filter (k=> n%k==0) length`. It is up to you as the programmer which function style you choose to use.

# Week 17 Challenges
## 7. Advanced Functions 1
Write the following functions into a program called `MyFuns`:
* Prime predicate `prime: Long->Boolean`. Returns true when input is prime & false otherwise.

## 8. Advanced Functions 2
Add the following function into `MyFuns`:
* Perfect predicate `perfect: Long->Boolean`. Returns true when input is perfect & false otherwise. A number is perfect when all of its proper divisors can be added together to create itself.

## 9. Advanced Functions 3
Add the function below to `MyFuns`:
* Digit to work function `digitToWord: Int->String`. Input range 0-9 returns corresponding string, else returns 'bad digit'.

## 10. Advanced Functions 4
Write the following function & add it to `MyFuns`:
* Word-to-digit function `wordToDigit: String->Int`. If input spells one of digits between 0-9, if the input is not valid then function returns `-1`.

## 11. Advanced Functions 5
Create the following function & add to `MyFuns` program.
* Leap year predicate `leapYear: Int->Boolean`. Function takes integer representing year Gregorian calendar & returns true if it is a leap year & false otherwise. 
