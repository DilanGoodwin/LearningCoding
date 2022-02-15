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
The function above is an example of recursion where the function is calling itself until a specific requirement is met. For the function above the requirement is the variable `n` meeting the value of `0`. <br/>
Using the function above as a guide create a function called `countTo10` that prints out the numbers up to & including 10.

## 2. countToN
Using the previous program add another function called `countToN`. Allow user to enter the integer variable they would like to count to.

## 3. Reverse countToN
Create another functions within the previous program called `reverseCountToN`, with the reverse process of `countToN`. 

## 4. factorial


## 5. sumFromTo
