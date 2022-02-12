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