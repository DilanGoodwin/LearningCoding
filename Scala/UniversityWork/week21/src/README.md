# Week 21: Functions Returning Functions
## 1. curry1
Create a Scala program & enter the following definition: `def add(x: Int)(y: Int) = x+y`. Provide curried versions of the other arithmetic operations: subtraction, multiplication, division & modulus. Use `map` to apply partial applications each functions over list numbers.

## 2. curry2
Consider the function `def eq(c: Char)(d: Char) = c==d`, it can be used to filter out specific characters from within a string. Example: `"aardvark".toList filter (eq('a'))`. Try out the example & see if it behaves as expected. 

## 3. curry3
Create a curried function that takes an integer & string, then returns if the lengh of the string is equal to the integer. Then use it to filter all words from the `List("apple","pear","banana","peach")` which have length 5.

## 4. curry4
Create Scala program & enter the curried definition of bracket using partially applied function: `def bracket(left: String)(right: String)(whatever: String) = left + whatever + right`. 

## 5. Functions as Function Arguments
Consider list names `List("Tony Stark","Steve Rogers","Clint Barton","Natasha Romanoff","Thor Odinson")`. Sorting list easy using `sorted` method but only by first name. `sortWith` method could be used to sort by last names. Create a Scala program that sorts the list by both first name & last name.
