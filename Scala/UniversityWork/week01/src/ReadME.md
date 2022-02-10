# Week 1: Basic Programs & Formatting Output

All programs within this section will be named after the title of their relevant section section, making it easier to locare programs later down the line. All code provided for me by the university will also be given under the relevant headers however, any changes that are made by me will only be within the programs themselves. 

## 1. Priting Output & Escape Sequences
Simply get Scala to display something to the terminal.
```
object Box {
  def main(args: Array[String]): Unit = {
    print("\t***\n")
    print("\t***\n")
    print("\t***\n")
  }
}
```
## 2. Line Breaks & Tabs
List tasks to complete based previous program:
* Replace each `print` command with `println`. What is the difference made?
•••`print` displays whatever is within its expression without adding a new line by default. Compare this to `println` which adds a new line before displaying its information. It is my understanding that the `ln` within `println` stands for line new.
* Change the program so output is same previous program. Do not use `print`.
* Put `\t` between each asterisk. How do `\t` & `\n` work formatting output?
•••`\t` adds a tab to the printed line where as the `\n` adds a new line where ever it is places within the print line  

## 3. Formatting Your Own Output
Write a program that prints out a diamond shape, using asterisks, to the terminal.

## 4. Handling Backslashes 
Create a program that prints a big X to the terminal using backslashes.
•••Backslashes need to be escaped before they can be added to a print line, this can be done by using a double backslash to signal that you only one to use a single backslash like so: `\\`

## 5. Handling Quotation Marks
Create a program that prints the following to the screen: " needs to be printed sometimes, so we need to print ".
•••To print the previous sentance, with quotation marks, to the screen the quotation marks that you wish to display need to be escaped using a backslash, `\"`.

## 6. String Concatenation
Creare a new program & add the following lines of code:
```
println("Hello World!")
println("Hello"+" "+"World!")
```
Why does it look the same? What is the + operator doing?
•••The `+` sign is concatinating the strings together. It is almost like just pushing the two different strings together to create a longer string.