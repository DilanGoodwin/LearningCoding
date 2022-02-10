# Week 2: Variables & Data Types
All programs within this section will be named after the title of their relevant section section, making it easier to locare programs later down the line. All code provided for me by the university will also be given under the relevant headers however, any changes that are made by me will only be within the programs themselves.

## 1. Outputting Numbers & Chars
As well as printing out sentances, Scala can also be used to print out characters & numbers.

### 1.1  
Use the code below to create a program. What is the output?
- <placeholder\>
```
object PrintFavourites {
  def main(args: Array[String]): Unit = {
    print("My favourite whole number is: ")
    println(20)
    print(" and decimal number is: ")
    println(0.5)
    print(" and letter is: ")
    println('t')
  }
}
```
### 1.2
Rewrite the program so all outputs are completed using only a single `println` statement.

## 2. Ouputting Variables
### 2.1
Create the program below:
```
object OutputVariables {
  def main(args: Array[String]): Unit = {
    var option1: String = "good"
    var option2: String = "bad"
    
    println("Hello " + option1 + " world!")
    println("Today the weather is " + option1)
    println("So far the module is " + option1)
  }
}
```
The variable `option1` is reused many times to change the displayed output. Variables can be used to store different pieces of information that can then be used later on throughout the program. Within the program above the variables is inititalised using the term `var`. The variable is also given a type that it is going to store, in the code above the variable type given is `String`.
### 2.2
Update one of the variables within the program. Can you see a benefit to storing data within variables?
- Storing data within variables is useful because it allows the program to remember certain pieces of information. A good example of what a variable can be used for is the storing of someones name, you do not want a fixed name within your program because there is no guarantee that the person using the program will have that name. Instead assigining the name to a variable allows only that single thing to be changed & have it chage throughout the entire program. 

## 3. Escape Sequences & Variables
### 3.1 
Create a program that outputs the following:
```
"Sometimes the world is a good place,
and sometimes it is a bad place."
```
Use the code fragments below to create the program:
```
object OutputVariables2{
  def main(args: Array[String]): Unit={
    var option1: String="Sometimes the world is a good place,"
    var option2: String=...
  }
}
```
### 3.2
Change the program so that the result is stored within a third variable before being printed to terminal.

## 4. Using the Interpreter
Open a Scala interpreter by opening a terminal & typing in scala. Then type in the following values:
```
5
-5
5.0
"5"
2147483647
2147483648
2147483647L
2147483648L
5E3
true
True
"True"
"true"
a
'a'
"a"
```
Look at the different types of the values, are they what you expected?
- There are different variable types that can be used to store variables within a program, this is because the program allocates set amount of bits/bytes per variable for the information the programmer is going to store in it. For example most numbers are stored as `Int` values however there is a maximum & minimum value that can be stored as an `Int` before you would need to change the variable type to something like a `Long`. 

Why do some of the inputs fail?
- Some of the inputs fail because the interpreter is expecting a given variable type but the user has entered a different variable type. The interpreter uses little hits to work out what the input should be stored as, a good example of this is when entering a string. Strings are surrounded by quotation marks `"`, this tells the interpreter to save the variable as a string.

## 5. Operators in the Interpreter
Once again open a Scala interpreter within a terminal & enter the following values:
```
5 + 5
5 + 5.5
5.0 + 5.5
-5 + 5
true + 5
"true" + 5
"true" + "5"
2147483646 + 1
2147483647 + 1
2147483647L + 1
5 % 3
5 + 3 * 2
3 / 4
3.0 / 4
3 / 4.0
```
Looks at the different variable types & the outputs from some of the values. Why do some of them fail?
- Some of the inputs fail because they are type miss matches, this is when the variables are two different types that do not play nicely with each other. A good example of this would be `5 + 5` & `"true" + 5`. Using the example `5 + 5` both values would be stored as integer values by Scala & would be added together (as stated by the operator `+`) without issue. However in the example `"true" + 5` the value `"true"` is stored as a string where as `5` is stored as an integer preventing the two from being added together. 

## 6. Variables in the Interpreter
Enter the following expressions into the Scala interpreter:
```
var x1: Int = 5
var x2: Int = 5.0
var x3: Double = 5
x3 = x3 * 2
var x4: Boolean = true
var x5: Double = 3 / 4
var x6: Double = 3.0 / 4
var x7: Double = x6 + 1.2
x7 = x7 + 1.1
var x8: Int = x1 + x2
var x9: Long = 2147483647+1
var x10: Long = 2147483648+1
var x11: Int = _
var x12: Int = 2147483648
var x13: Long = 2147483648
var x14: Long = 2147483648L
```
Explain the errors observed from these inputs.
- Errors seem to arrise when a variable is stated to be the wrong type. An example of this is defining an `Int` but the value entered (`5.0`) is a `Double`. 
- One of the other errors that has arrised is when a value is entered that exceeds the predefined bounds of the variable type. An example of this is assigning the number `2147483648` to the type `Int`.

## 7. Other Variable Types in the Interpreter
Open a new Scala interpreter & enter the following:
```
var x1: Char = 'a'
var x2: String = "a"
x2 = "b"
x2 = "b" + "c"
var x3: String = x1 + x2
var x4: Char = 'b'
var x5: String = x1 + x4
var x6: Char = 97
var x7: Char = 'a' - 32
var x8: Boolean = false
var x9: String = 45
var 10x: String = "45"
var def: String = 45
var object: Int = 5
```
Why did some of the inputs fail?
- Some of the provided inputs failed because of the way the variables were defined. Some words with Scala are predefined/used & are not allowed to be used as variable names. For example you could not use `var` as a variable name because it has a predefined function within Scala. 

## 8. Variables in a Scala Program
### 8.1
Create a new project using the code below:
```
object VarX{
  def main(args: Array[String]): Unit={
    var x: Int=3
    println("The value of x is "+x)
  }
}
```

### 8.2 
Modify the program to print the value of the variable `x` before the prefefined `String` & change the value of the variable to be `5`. New message should be: `5 is the value of x`.

## 9. Concatenating Variables
Create a Scala program called `MyName` & within `main` method declare 2 variables containing your first name & last name respectively. Program should then print out the message `My name is John Smith`, where `John Smith` is replaced by your own name.

## 10. Reusing Variables
Create a program called `MyName2` that displayed the same message as `MyName` but uses a single variable called `fullName`. But the variable should only have your first name to start with. Use the code below:
```
var fullName: String = "Joe"
fullName = ...
println...
```
Where ... is replaced by your own code.

## 11. Using Different Data Types
Create a program called `Details` which hold day, month & year of birth & character containing the initial of your first name. A message should be printed out in the format: `My first name initial is "L" and I was born on 1/Jan/1990.` Where your own details are assigned to the appropriate values.

## 12. Simple Input
Create a new Scala program using the following code:
```
import scala.io.StdIn.readInt

object InXOutX {
  def main(args: Array[String]): Unit = {
    print("Enter a number ")
    var x: Int = readInt()
    
    println("You entered " + x)
    println("Your number squared is " + (x * x))
  }
}
```
Do you understand how the program works?
- The program above asks the user to enter a integer value, this value is then stored within the variable `x`. This variable can then be used by the program to complete various functions.

## 13. Multiple Input
Create a Scala program called `InputXandY` which prompts the user to enter 2 integers. These integers should be stored as variables with suitable names. Calculate the sum & product of the 2 integers, displaying the results to the screen.

## 14. Input with Prompts

## 15. Identifying Syntax Errors

## 16. Using Variables for Calculations

## 17. A Different Approach