# Week 4: Strings & Lists
## 1. Inputting Lots of Numbers
Create program called `InputTenNumbers`, the program should prompt the user to individually input 10 integer values from keyboard & then print out in reverse order which entered.

## 2. Inputting Lots of Numbers into a List
Create program called `InputTenNumbersIntoList` which prompts user individually input 10 integer values from keyboard & print them out in reverse order. Use the code below to help create the program:
```
var xs: List[Int] = List()
 
println("First number? ")
xs = xs :+ readInt()
 
//read remaining numbers here
 
println(xs.reverse)
```

## 3. Lists in the Interpreter
Open a Scala interpreter & enter the following lines code:
```
List(4, 1, 8, 45, 3)
List('v', 'a', 'r')
List(4, 1, 'e', 45, 3)
List("Mr", "Joe", "Bloggs")
List(4.4, 1, 8.33, 45.0, 3.67)
List(1,2,3) :+ 4
4 +: List(1, 2, 3)
List.range(5, 13)
List.range(5, 3)
List.range('a', 'z')
List.fill(3)(10)
List.fill(10)(3)
List.fill(5)('g')
List.fill(4)("foo")
List.tabulate(11)(n => n * n)
List.tabulate(11)(Math.pow(_ , 2))
List.tabulate(5)(x => x * 10)
List.tabulate(20)(_ * 5)
List.tabulate(20)(_ * 5).tail
List.tabulate(6)(List.range(_, 6))
List.tabulate(6)(List.range(_, 6)).reverse
List.tabulate(6)(List.range(_, 6)).flatten.distinct
var xs: List[Int] = List.range(1, 11)
xs.tail
xs.head
xs.isEmpty
xs.reverse
xs.sum
xs.size
```
Are the results what you expected?
* <placeholder>

## 4. Further Exploring Lists in the Interpreter
Using the Scala interpreter again enter the following lines:
```
var xs: List[Int] = List.range(1, 6)
xs.tail.head
xs.tail.tail.tail.head
xs.tail.tail.reverse
xs(0)
xs(1)
xs(4)
xs(5)
xs.take(1)
xs.take(3)
xs.take(3).head
xs.take(20)
xs.takeRight(1)
xs.takeRight(2)
xs.takeRight(3).tail
xs.takeRight(10).head
xs.drop(1)
xs.drop(2).tail
xs.drop(100)
xs.dropRight(2)
xs.dropRight(1).head
```
Are all the results what you expected?
* <placeholder>

## 5. Strings in the Interpreter
Enter the lines below into the Scala interpreter:
```
var x: String = "Mary Had a Little Lamb   "
x.toUpperCase
x.toLowerCase
x.replace('a', 'e')
x.toList
x.tail
x.trim
x.length
x.trim.length
x.substring(5, 8)
x.substring(5)
x.substring(1, 3)
x.substring(0, 3)
x.substring(0, 4)
x.charAt(0)
x.charAt(6)
x.charAt(100)
x.indexOf("M")
x.indexOf("L")
x.indexOf("a")
x.indexOf("z")
x.indexOf('a')
x.indexOf('i')
```
Make a log of the results, are they all what you expected?
* <placeholder>

## 6. Combining Different String Methods in the Interpreter
Once again using the Scala interpreter enter the following lines below:
```
var x: String = "Mary Had a Little Lamb"
x.substring(3).substring(3).substring(3)
x.substring(3).substring(0,1)
x.substring(0,10).substring(3)
x.substring(0,10).substring(3).toUpperCase
x.substring(0,10).substring(3).reverse
x.charAt(2-2)
x.charAt(1*2*3)
x.charAt(10 % 2)
x.charAt(x.length - 1)
x.charAt(x.indexOf("M")+2)
x.charAt(x.indexOf("b")-1)
x.charAt(0) + 1
(x.charAt(0) + 1).toChar
(x.charAt(0) - 1).toChar
(x.charAt(0) + 5).toChar
x.indexOf(x.charAt(0))
x.indexOf(x.charAt(1))
x.indexOf(x.charAt(6))
x.indexOf(x.substring(0,1))
x.indexOf("Had")
x.indexOf(x.substring(0,10))
```
Make a record of the different results you get, are they what you expected?
* <placeholder>

## 7. Using Lists
### 7.1 
Create a program called `SimpleLists` using the code below:
```
object SimpleLists {
    def main(args: Array[String]): Unit = {
      var xs: List[Int] = List(4, 1, 8, 45, 3)
     
      println(xs)
      println(xs.head)
      println(xs.tail)
      println(xs.isEmpty)
      println(xs.tail.isEmpty)
     
      var xs2: List[Int] = xs.reverse
       
      println(xs2)
    }
}
```
### 7.2
Modify the program to print the statement: `List(3, 45, 8)`. This statement must be printed using a single print line.

## 8. Using Strings
### 8.1
Using the code below create a program called `SimpleStrings`:
```
object SimpleStrings {
   def main(args: Array[String]): Unit = {
     var s1: String = "Dealing with strings"
     var s2: String = "Playing"
     var s3: String = s2 + s1.substring(7)
     println(s3)
     println(s3.toUpperCase)
     println(s3.substring(0, 7))
     println(s3.startsWith(s2))
     println(s3.endsWith(s1))
   }
}
```

### 8.2
Modify the program & add a `println` statement which produces the output: `Playing with Strings`.

## 9. Lists & Strings
Using the code below create a program that prints the first letter of each word capitalised:
```
object StringsAndLists {
  def main(args: Array[String]): Unit = {
    var s1: List[String] = List("Mary", "had", "a", "little", "lamb")
    ...
    
  }
}
```

## 10. Solving a Problem with a Variety of String Methods
### 10.1
Create a program called `Initials` which outputs the initials of a name stored within a string. Use 'readLine` to read the full name of the user from the keyboard.

### 10.2
Extend the program to construct & ouput an email address for the provided user. The email should be in the form `firstInitial.surname@email.university.ac.uk`.

## 11. Shifting Letters in a String
