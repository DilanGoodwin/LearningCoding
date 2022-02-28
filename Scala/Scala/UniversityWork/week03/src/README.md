# Week 3: Operators & User Input
## 1. Inputting Different Types
### 1.1
Create a new Scala program called `InOutStrings` & code the code below:
```
import scala.io.StdIn._

object InOutStrings {
  def main(args: Array[String]): Unit = {
    print("Enter your first name ")
    var firstName: String = readLine()
    
    var lastName: String = readLine("Enter your last name ")
    
    println("Your name is " + firstName + " " + lastName)
  }
}
```

### 1.2
Extend the program above to ask the user to input `initial, house number, address, telephone number & salary`. Store each of the different variables in the appropriaye variable type within the program.

## 2. Operators in the Interpreter
Open Scala interpreter & enter following commands:
```
5 + 3
-3 + 5
6 - -3 * 2 + 0.5
(6 - -3) * (2 + 0.5)
10 / 3
10 / 3.0
2 / 0
1592482843 * 2
6.6 / 3
5 * 3
5 % 3
6 % 3
"abcd" + 5
"abcd" + true
5 + true
5 + 4 * 3
(5 + 4) * 3
"number " + 5 + 6
"number " + (5 + 6)
5 + 6 + " number"
"number " + 5 * 6
```
Why do some of the inputs fail?
* Some of the inputs fail due to the miss match of variable types, while others failed due to the size limits of the different variable types. 
<br/><br/>Make logs of the results you observe within the interpreter. 

## 3. More Operators in the Interpreter
Create a new Scala program & declare the following variables:
```
var x: Int=3
var y: Int=7
var z: Double=5.5
```
Use the following variables to complete the tasks below.

### 3.1
Write an expressions that calculates the average of `x` & `y`

### 3.2
Write an expression gives remainder of division of `y` & `x`

### 3.3
Write an expression that adds `x` & `y`, divides by `z` & assigns overall result to new variable called `result`.

### 3.4
Write an expression that subtracts `x` from `z`, then divides result by `y`.

### 3.5 
Create an expression that increases value `x` by 1.

### 3.6 
Create an expression that decreases `y` by `x`.

### 3.7 
Create expression multiples `y` by 3.

## 4. Operators in a Scala Program
Create new program using the code below:
```
object Operators {
  def main(args: Array[String]): Unit = {
    var y: Int = 5
    println("1 x " + y + " = " + (1 * y))
    println("10 x " + y + " = " + (10 * y))
    println("100 x " + y + " = " + (100 * y))
  }
}
```

## 5. Further Exploring Operators
Create a copy of the previous program & add an additional variable `z` type `Int`. Below existing println statements print out sum of numbers, product numbers, the difference numbers & sum squares numbers. <br/> Create further modifications rather than having variable predefined. Have variables read from keyboard, allowing user to enter input.

## 6. Operator Precedence
Create a new Scala program called `IPlusJTimesK`, declare 3 integer variables `i`, `j` & `k`. Assign values to all integers & print `i+j*k`. 

### 6.1
Run the program with values `i`=2, `j`=3 & `k`=4. What answer is produced?
* Answer produced by program is 14.

### 6.2
Modify the program so the produced answer is 20.
* Adding brackets into the program can change the produced output. 

## 7. Calculations
Final speed of car accelerating from initial speed for specified time given formula `finalSpeed = initial + acceleration * time`. Create Scala program that:
* Declares 4 integer variables called `finalSpeed`, `initial`, `acceleration` & `time`.
* Calculates & stores final speed according formula above.
* Print out final speed.

## 8. Using Parentheses
Sum numbers from 1 to N given formula `sum = N*(N+1)/2`.<br/> Create Scala program called `SumToN` which:
* Declares variables called `N` & `sum`
* Calculates sum according formula above
* Prints out result <br/>
`Sum from 1 to 10 is 55`.

## 9. Operators & Strings
Copy the code below into a new Scala program:
```
object StringConcat {
  def main(args: Array[String]): Unit = {
    println("Is the value of 5+5 " + 5 + 5 + "?")
    println("Or is it " + (5 + 5) + "?")
    println("Or even " + "5" * 5 + "?")  
  }
}
```
Can you explain the output?
* <placeholder>

## 10. Further Exploring Variables & Operators in the Interpreter
Open a Scala interpreter & enter the following commands:
```
var a, b, c: Int = 5
var d: Double = 6.6
d = 7.7
d += 2
print(d)
b *= 5
print(b)
d + a
var e: 8
var f: 9.9
var g: 3 * 4.4
var h: 100000000L
var i = 'a'
var j: Boolean = a < e
var k: Boolean = a == c
var l = a >= c
var m = a != c
var n: Boolean = a > 4 && a >= 5
var even: Int = 6
even % 2 == 0
true && true
a == 5 && a == 6
a == 5 || a == 6
a > 1 || a == 0
"message " * 3
3 * "message"
"message" / 3
"message" - 3
"message" % 3
3 + "message"
val Pi = 3.14
Pi = 3.1416
val constantValue: Int = 5
constantValue = constantValue + 1
constantValue /= 2
```
Look at the results, where they what you expected?

## 11. Relational Operators
Write a Scala program called `Relational` which:
* Prompts user enter 2 integer values.
* Prints out take showing results comparing 2 integer values.

## 12. Logical Operators
Create program called `LogicalOperators` which prompts user for two boolean values & ouputs result applying `AND` and `OR` operators
<br/><br/>
Extend the program so output shows truth table for `AND` and `OR` operators.

## 13. A Longer Formula 
Sum of square numbers from 1 to N is known by formula: `sumSq=N*(N+1)*(2*N+1)/6` <br/>
Create a Scala program called `SumSqToN` which:
* Declares integer values `N` & `sumSq`
* Calculates sum first N squares in accordance formula
* Prints out result

## 14. Input & Calculation
Sum cubes of numbers 1 to N given by formula: `sumcubes=(N*N)*((N+1)*(N+1))/4` <br/>
Create a Scala program that:
* Declares integer values `n` & `sumcubes`
* Prompts user enter value `n` from keyboard
* Calculates sum first `n` cubes accordance formula 
* Prints out formula

## 15. Caesar
Ceasar cipher mechanism encrypting text, encrypts message shifting alphabetic character in text fixed amount. Write a Scala program which:
* Declares `Char` variable store character encrypted
* Declares `Int` variable store amount shifted
* Assigns variables by reading from keyboard , lowercase value for `Char` & integer for shift amount
* Prints out original character & shifted value