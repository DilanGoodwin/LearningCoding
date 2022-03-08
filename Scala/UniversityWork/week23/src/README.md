# Week 23: Encapsulating State
## 1. Counter 1
Below there are two Scala object (`Counter` & `UseCounter`), use that code to create a program:
```
object Counter{
  privae var counter: Int=0

  def getValue: Int=counter
  def inc(){
    counter=counter+1
  }
}

object UseCounter{
  def main(args: Array[String]): Unit={
    println(Counter.getValue)
    Counter.inc()
    println(Counter.getValue)
  }
}
```

### 1.1 UseCounter
Run `UseCounter` program & make sure that the correct output is displayed within the terminal/console.

### 1.2 Counter.inc()
Add additional calls to `Counter.inc()` & make sure the outputs are as expected.

### 1.3 Additional Counter
Add a new function to the `Counter` object:
```
  def inc(n: Int){
    for(i<- 1 to n) inc()
  }
```
Call this function within Use.Counter main program checking that the ouput is as expected.

### 1.4 Another Counter
Create the functions below within the `Counter` object & call them within `UseCounter` main program.
* `def setValue(newValue: Int)`
* `def reset() //Resets counter to 0`

## 2. Counter 2
Create 
