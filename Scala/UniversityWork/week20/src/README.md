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

