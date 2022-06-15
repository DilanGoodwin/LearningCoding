# Week 1: Basic Programs & Formatting Output

Learning Objectives:
* Printing characters to terminal
* Formatting printed characters to terminal
* Escaping formatted keywords within printed string
* Concatinating strings to print to terminal

## 1. Priting Output & Escape Sequences
Create a new Scala program within the IDE of your choice calling it `Box.scala` and copy the code below into the editor. 

```
object Box {
  def main(args: Array[String]): Unit = {
    print("\t***\n")
    print("\t***\n")
    print("\t***\n")
  }
}
```

* What is the output of the code within the terminal?
* What do you thing the `\t` is doing to the output?
* What do you think the `\n` is doing to the output?

## 2. Line Breaks & Tabs
Create a copy of your `Box.scala` calling it `Box2.scala` and complete the tasks below within the new program:

* Replace the `print` statements with `println` statements. How does this affect the output?
* Edit the code so that the result printed to the terminal is the same as `Box.scala` without using `print` statement. What did you have to change?
* Add a `\t` between each of the asterisks in the print statements. What difference does this make to the output?

Code within the `Box2.scala` should now look like the code below:

```
object Box2 {
  def main(args: Array[String]): Unit = {
    println("\t*\t*\t*")
    println("\t*\t*\t*")
    println("\t*\t*\t*")
  }
}
```

## 3. Formatting Your Own Output
Now create your own program called `Diamond.scala` then, using what you have been shown so far, make it print out a diamond to the terminal using asterisks. Should look something like:

```
		* 
	* 		*
*				*
	*		*
		* 
```



## 4. Handling Backslashes 
Using what has been show to you so far within the document create a program that draws an 'X' in the in the ternimal. It should look something like:
```
\    /
  \/
  /\
/   \
```
Remeber that backslashes are used as escape characters so you cannot add them to a string like you normally would.

## 5. Handling Quotation Marks
Create a simple program that prints the following string to the screen: `" needs to be printed sometimes, so we need to print "`
Remeber that backslashes can be used as escape characters.

## 6. String Concatenation
Copy the following lines of code into a new program & run it:
```
println("Hello World!")
println("Hello"+" "+"World!")
```

Both print statements should look the same but when looking at the code they are both slightly different. First print statement has no modifications applied to it but the second using string concatination to join 2 sections of a string together. In the instance above it is combining `Hello`, ` ` and `World!` together into a single string to be printed.