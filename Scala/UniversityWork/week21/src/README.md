# Week 21: Functions Returning Functions
## 1. curry1
Create a Scala program & enter the following definition: `def add(x: Int)(y: Int) = x+y`. Provide curried versions of the other arithmetic operations: subtraction, multiplication, division & modulus. Use `map` to apply partial applications each functions over list numbers.

## 2. curry2
Consider the function `def eq(c: Char)(d: Char) = c==d`, it can be used to filter out specific characters from within a string. Example: `"aardvark".toList filter (eq('a'))`. Try out the example & see if it behaves as expected. 

## 3. curry3
Create a curried function that takes an integer & string, then returns if the lengh of the string is equal to the integer. Then use it to filter all words from the `List("apple","pear","banana","peach")` which have length 5.

## 4. curry4
Create Scala program & enter the curried definition of bracket.
