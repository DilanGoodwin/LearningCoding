# Week 20: Recursion
## 1. countdown
Create a Scala program using the code below:
```
def countdown(n: Int): Unit = {
  print(s"$n ")
  if (n==0)
    println("Stopped")
  else
    countdown(n-1)
}
```
The function above is an example of recursion where the function is calling itself until a specific requirement is met. For the function above the requirement is the variable `n` meeting the value of `0`. 
<br/>
Using the function above as a guide create a function called `countTo10` that prints out the numbers up to & including 10.

## 2. countToN
Using the previous program add another function called `countToN`. Allow user to enter the integer variable they would like to count to.

## 3. Reverse countToN
Create another functions within the previous program called `reverseCountToN`, with the reverse process of `countToN`. 

## 4. factorial
Create a Scala program called `FactorialsWorking` & add the function below to the program:
```
def factorial (n: Long): Long = {
  if (n == 0)
    1
  else
    n * factorial(n - 1)
}
```
Within the main function that shows the `factorial(0)` to `factorial(20)`. 
<br/>
What would happen if you tried to evaluate `factorial(21)`?
* <placeholder>

## 5. sumFromTo
Complete the recursive function `def sumFromTo (a: Int, b: Int): Int =` so that it calculates the sum of numbers from a to b (inclusive).

## 6 sumList
Recursion not only used with numeric functions. An example could be suming the elements within a list:
```
def sumList(xs: List[Int]): Int =
  if (xs.isEmpty) 0
  else xs.head + sumList(xs.tail)
```
Base case when list is empty, recursive call makes progress towards base case by reducing the size of the list one by one. Function itself sums the elements in teh list by adding the value at the head of the list to the sum of the values within the tail. Create a Scala object which enter this function & demonstrate it working summing different values. 
<br/><br/>
Add the following functions to the program using recursion & show how they could be used.

### 6.1 prodList
`prodList: List[Int] -> Int` multiplies elements in list together, product empty list defined as 1.

### 6.2 lenList
`lenList: List[Int] -> Int` returns length list of integer values.

### 6.3 allTrue
`allTrue: List[Boolean] -> Boolean` returns true if all elements in list are true.

### 6.4 anyTrue
`anyTrue: List[Boolean] -> Boolean` returns true if one element within list is true.

## 7. Fibonacci
Fibonacci sequence is number sequence where each number is sum previous two nubers. Below is a function for calculating the n-th fibonacci number:
```
def fibonacci(n: BigInt): BigInt =
  if (n==0) 0
  else if (n==1) 1
  else fib(0, 1, n-2)
  
def fib(a: BigInt, b: BigInt, n: BigInt): BigInt =
  if (n==0) a+b
  else fib(b, a+b, n-1)
```
Notice type BigInt which represents unbounded integers which cannot overflow. BigInt is build on top of Java's BigInteger type. Also the `fibonacci` function itself is not recursive, instead an auxiliary function `fib` is recursive instead.
<br/>
Create a Scala program using the code above that asks a user to enter a number to strat the fibonacci sequence at.

# Week 20 Challenges
## 8.Fibo
### 8.1
Create a fibonacci sequence that does not use an auxiliary function. `def fibo(n: BigInt): BigInt =`.
<br/><br/>
Using the code below get the system clock time in nanoseconds before & after the two functions.
```
var t0 = System.nanoTime()
var fib32 = fibonacci(32)
var t1 = System.nanoTime()
println(s"Fib(32) = $fib32. Took ${t1-t0}ns")
t0 = System.nanoTime()
fib32 = fibo(32)
t1 = System.nanoTime()
println(s"Fib(32) = $fib32. Took ${t1-t0}ns")
```
Which one took longer/
* <placeholder>
<br/><br/>
Can you make the program faster?
* <placeholder>

## 9. qsort
Famous quick sort algorithm can be written recursively:
```
def qsort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) xs
  else {
    val lesser = xs.tail.filter(_ <= xs.head)
    val greater = xs.tail.filter(_ > xs.head)
    qsort(lesser) ++ (xs.head :: qsort(greater))
  }
```
Create some experiments to show the algorithm in practice.

## 10. ackermann
Look up the ackermann function & code a recursive Scala function for the ackermann function.
