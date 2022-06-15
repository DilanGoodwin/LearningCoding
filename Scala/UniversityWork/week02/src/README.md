# Week 2: Variables & Data Types

Learning Objectives:


## 1. Outputting Numbers & Chars
Strings are not the only data type that Scala can use, it is also able to use Integers & Chars (otherwise known as characters). Below is a simple program that demonstrates how these other data types can be implemented within Scala:

```
object PrintFavourites{
	def main(args: Array[String]): Unit={
		print("My favourite whole number is: ")
		print(20)
		print(" and decimal number is: ")
		print(0.5)
		print(" and letter is: ")
		print('t')
	}
}
```

As you can see within the program integers that are being used do not have quotation marks around them & the chars only have single quotes around them. While you could put double quotes around both chars & integers that would change the data type that they are recognised as to string. These little things are good ways of knowing what data type items within a program are.

Now using the program above as a template create a program that only uses a single `println` line to display all of the information.

<-- I am here -->

## 2. Ouputting Variables
Programs are not really that useful if they are not able to store different things that we can use later, this is where variables come in. Variables are like small data stores that can store different data types. Within Scala you do not have to define the data type that a variable is specifically going to be using but it is good programming practice. 

Create a new Scala program & copy the code below into the program:
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
As you can see within the program code uses the `option1` variable many times while it is being executed. You can change what is being stored wihtin that variable to change the output of the different sentences that are being used. 
The two variables in use `option1` & `option2` are both initialised using the `var` keyword & have been given the type `String` upon being initialised. 

Go through the program & change one of the called upon variables from `option1` to `option2`, do you see how it can be useful to use variables?

## 3. Escape Sequences & Variables
To test that you have understood everything that we have gone through so far I would like you to create a program that outputs the following to the terminal:
```
"Sometimes the world is a good place,
and sometimes it is a bad place."
```
Use the code fragments below to complete the program:
```
object OutputVariables2{
  def main(args: Array[String]): Unit={
    var option1: String="Sometimes the world is a good place,"
    var option2: String=...
  }
}
```
Once you have done that change the program so that the result is stored within a third variable & then printed to the terminal.

## 4. Using the Interpreter
Open a Scala interpreter by opening a terminal window & typing in Scala. Once the interpreter has started type in the following values one at a time:
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
The Scala interpreter can be used as a testing ground for small parts of a program. I would not recommend designing your entire program within the interpreter but if you have most of a program fleshed out & need to test a small section you could copy it into the interpreter to test it rather than running the entire program & getting it to run that specific section. 

Looking at the different values that you have entered into the terminal you can see the different data types that they have been stored as. Are all of the values assigned to the data types that you expected or are there some that are different?
Some of the inputs do not work within the interpreter, do you know why they do not work?

## 5. Operators in the Interpreter
Going back to the interpreter session that you still have open or a new one that you have just started enter the following values:
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
The inputs above are operator type inputs, there are mathematical operators that are having an effect on the values that are being created within the interpreter. Look at the how the data is being modified before being stored within the interpreter. Some of the inputs fail, why is this?
If you are not able to work out why some of the inputs fail at a look at how the data types are being mismatched within the interpreter & how that could case errors when creating a new variable. 

## 6. Variables in the Interpreter
Rather than just entering numbers into the terminal & looking at the results this time we are going to define different variables that we can then use repeatedly within the interpreter. Enter the values below one at a time but do not restart the terminal between entering the different values otherwise you will not be able to access the previously entered values:

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
There are some errors that appear when entering these values within the interpreter. Some of these errors occur because the variable is defined as one type but the data type entered is different from the type that it was defined as. The other error that occurs is because there is a certain limit to the amount that an integer can store. The largest number that can be stored within an `int` is `2147483647` which is not that large a number when you are talking about calculating numbers that could be in the billions, which is something that computer programs are good at doing. If you need to use a number greater than that you would need to use the `long` data type which can store numbers greater than `2147483647`.

## 7. Other Variable Types in the Interpreter
We will be working within the Scala interpreter again as it is a good way to quickly check things & when errors occur they are flagged quickly which means that you can learn what things cause errors & why things cause errors.

There is a list of different commands to enter into the terminal but as we are storing them as variables make sure not to restart the interpreter when working with these variables as it will reset them & you will not be able to use the variables that you have previsouly entered unless you enter them again.

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

Some of the inputs once again failed, this is because some of the variable names that we wanted to use are predefined function names within Scala so they cannot be used as variable names within a program. An example of this is the `var` keyword, this tells the program that you are creating a variable so you cannot name a varaible var because it already has a predefined function.

## 8. Variables in a Scala Program
Now that we have played around with variables & understand how we can use them it is time to add them into a program. We will start off with very basic usages of varaibles & then look into more complex ways that they can be used.

Copy the code below into a new Scala program:

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
* The program above asks the user to enter a integer value, this value is then stored within the variable `x`. This variable can then be used by the program to complete various functions.

## 13. Multiple Input
Create a Scala program called `InputXandY` which prompts the user to enter 2 integers. These integers should be stored as variables with suitable names. Calculate the sum & product of the 2 integers, displaying the results to the screen.

## 14. Input with Prompts
### 14.1
Create a Scala program using the code below:
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
Explain how the two inputs are done differently.

### 14.2 
Update the program to accept a third variable called `title` & output it along with their name.

## 15. Identifying Syntax Errors
Look at the program below:
```
object Buggy {
  def main(args: Array[String]): Unit = {
    var def: Char = "a"
var FIVE: Int = 5.1
    
    println("The data is+" def + " and +"FIVE+"!"
         }
}
```
The output of the program above should be `The data is a and 5!`.<br/><br/>Can you see potential problems with the program? Fix the problems within the program to give the provided output.

## 16. Using Variables for Calculations
Create a program called `CircleCalc` which calculates the circumference of circle. Program use 2 variables holding radius & π. Calculate the result & store within another variable. Print out the result in format: `A circle with diameter 25 has a circumference of 78.54`.

## 17. A Different Approach
Create copy program from previous exercise named `CircleCalc2`. Modify the program so that it doesn't require third variable but provides same output. 
