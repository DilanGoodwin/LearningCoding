# Week 6: Conditional Expressions
## 1. Introducing Control Flow
### 1.1 
Create a new Scala program using the code below:
```
import scala.io.StdIn._

object ReadDetails {
  def main(args: Array[String]): Unit = {
    var firstName: String = readLine("Enter your first name ")
    
    var lastName: String = readLine("Enter your last name ")
    
    var error = ""
    
    if (firstName.isEmpty) {
      error += "You did not type in a first name\n"
    }
    
    if (lastName.isEmpty) {
      error += "You did not type in a last name\n"
    }
    
    if (error.isEmpty) {
      println("Your name is " + firstName + " " + lastName)
    } else {
      println(error)
    }
  }
}
```

### 1.2 
Modify the program to store the address of the user. Make sure to validate the input is not empty.

## 2. Using if as an Expression
### 2.1
Copy the code below into a new Scala program:
```
import scala.io.StdIn.readInt

object OddEven {
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number: Int = readInt()
    
    var result = if (number % 2 == 0)
      "even"
    else
      "odd"
      
    println("Your number is " + result)   
  }
}
```

### 2.2
Extend the program above to also check whether the input is above or below zero, do this using an `if-else` statement. The program should `print` out the appropriate message `positive` or `negative` depending on the result.

## 3. Intorucing if else-if else 
### 3.1 
With the code below create a Scala program:
```
import scala.io.StdIn.readInt

object Signum {
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number = readInt()
    
    if (number > 0) {
      println(number + " is positive")
    } else if (number < 0) {
      println(number + " is negative")
    } else {
      println(number + " is zero")
    }
  }
}
```

### 3.2
Make a copy of the program above called `Signum2` but rather than having each branch of the program print out output have them add the output to a variable called `message`. Print the `message` variable at the end of the program using `println`.

## 4. Conditional Branching
Create a new Scala program called `DigitsToWords`. Within the `main` method prompt the user to enter an integer value within the range of 0-9. The program should then print out the written equivalent to that value eg: If the user enters 0 then the program will print out ZERO. If the value entered is outside the range of 0-9 then the program should print `NOT A DIGIT`.

## 5. Further Exploring Conditional Logic
Open a new Scala program called `SumOfTwo`. The program should ask the user to enter three numbers. If two of the three numbers can be added together to create the third value then the program should print out `YES` otherwise it should print out `NO`.

## 6. Pattern Matching 
Using the code below create a new program called `DigitsToWordsMatch`:
```
import scala.io.StdIn.readChar

object DigitsToWordsMatch {
  def main(args: Array[String]): Unit = {
    println("Type in a digit ")
    var digit: Char = readChar()
    
    digit match {
      case '0' => println("ZERO")
      case '1' => println("ONE")
      case '2' => println("TWO")
      case '3' => println("THREE")
      case '4' => println("FOUR")
      case '5' => println("FIVE")
      case '6' => println("SIX")
      case '7' => println("SEVEN")
      case '8' => println("EIGHT")
      case '9' => println("NINE")
      case _ => println("NOT A DIGIT")
    }
  }
}
```
Looking at the code above you should see that it is a modified version of `DigitsToWords` program. Using the match statement is another way of checking whether variables are equal to one another. The `case _ =>` is a catch statement that runs if the variable `digit` does not match any of the other statements.

## 7. Using Match as an Expression
Using the code below create a program called `DigitsToWordsMatch2`:
```
import scala.io.StdIn.readChar

object DigitsToWordsMatch2 {
  def main(args: Array[String]): Unit = {
    println("Type in a digit ")
    var digit: Char = readChar()
    
    var result = digit match {
      case '0' => "ZERO"
      case '1' => "ONE"
      case '2' => "TWO"
      case '3' => "THREE"
      case '4' => "FOUR"
      case '5' => "FIVE"
      case '6' => "SIX"
      case '7' => "SEVEN"
      case '8' => "EIGHT"
      case '9' => "NINE"
      case _ => "NOT A DIGIT"
    }
    
    println(result)
  }
}
```
The code above is a slightly modified version of the `DigitsToWordsMatch` program but rather than printing the result straight away it is stored in the variable `result` & printed at the end of the program. Either of the approaches within the two programs can be used, it is up to the developer programmer to use whichever one they prefer.

## 8. Colour Matching 
Write a Scala program called `Colours` that prompts the user to enter a number between 1 & 7. The program should then output the corresponding rainbow colour: `red, orange, yellow, green, blue, indigo, violet`. If an invalid number is entered an appropriate message should be printed. Use the `match` method to complete this.

## 9. Specifying Common Patterns 
Using the code below create a Scala program called `DaysOfWeek`:
```
import scala.io.StdIn.readInt

object DayOfWeek {
  def main(args: Array[String]): Unit = {
    
    println("Type in a day number ")
    var choice = readInt()
    
    val day = choice match {
      case 1 | 2 | 3 | 4 | 5 => "Weekday"
      case 6 | 7 => "Weekend"
      case _ => "Unknown day"
    }
    
    println(day)
  }
}
```
The program above shows have multiple cases can be used to match to a single output. The `|` symbol is being used as a pipe to pass the variables through.

## 10. Nested if Statements
With the code below create a Scala program called `SignumNested`:
```
import scala.io.StdIn.readInt

object SignumNested {
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number = readInt()
    
    if (number == 0) {
      
      println(number + " is zero")
      
    } else {
      
      if (number < 0) {
        println(number + " is negative")
      } else {
        println(number + " is positive")
      }
      
    }
     
  }
}
```
Looking at the program you should see that it is a modified version of `Signum` program but rather than using `if else-if else` the program is using nested if statements. Nested if statements can be used to drill down on a decision leading to a final conclusion.

## 11. Module Mark Calculator
Assume that for a given module there is an assessment & a piece of coursework, both equally weighted. To pass the module over all your mark must be greater than 40%. Create a program called `ModuleMark` that:
* Prompts the user to enter two integer values - one representing coursework & other representing examination mark, both as percentages.
* Calculates overall module mark & prints it out
* Either tells user that module was passed overall OR that the module was failed overall
* If the module was failed overall the program should print out which element of the mdoule was below 40%

## 12. Letter Identifier
Write a Scala program, using if statements, that:
* Prompts user to enter a character
* Outputs the word `VOWEL` if the character inputted is a vowel
* Outputs the word `CONSONANT` if the inputted character is a consonant
* Otherwise outputs message `Character is non-alphabetic`

## 13. Letter Matcher
Create program called `LettersMatch` which uses `match` to determine if a character is a vowel or constonant. Before using match use an if statement to check if input is a letter.

## 14. Simple Sort
Write a Scala program called `SortThree` that:
* Prompts user enter 3 integer numbers & stores then in 3 variables called `a`, `b` & `c`
* Outputs the number in ascending numerical order