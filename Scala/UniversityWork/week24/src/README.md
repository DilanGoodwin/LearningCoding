# Week 24: Classes

## 1. Introductions
Create a new Scala class called `Car` & new Scala object called `UseCar` using the code below:

```
class Car(private var colour:String,private var make:String,private var maxSpeed:Int,private var currentSpeed:Int){
  def this(colour:String,make:String,maxSpeed:Int)={
    this(colour,make,maxSpeed,0)
  }
  def this(colour:String,make:String)={
    this(colour,make,150)
  }
  def accelerate()={
    if(currentSpeed<maxSpeed){
      currentSpeed+=1
    }
  }
  def getInfo: String=s"Your $colour $make drives at $currentSpeed, but could go $maxSpeed if you want."
}

object UseCar{
  def main(args: Array[String]): Unit={
    val c1: Car=new Car("silver","Opel")
    val c2: Car=new Car("black","Mercedes",200,50)
    val c3: Car=new Car("faded blue", "Trabant",80)
    println(c1.getInfo)
    println(c2.getInfo)
    println(c3.getInfo)
    for(i <- 0 to 300){
      c1.accelerate
    }
    println(c1.getInfo)
  }
}
```

## 2. Counter3
Within a new project/program create a Scala class called `Counter` & then create a Scala object called `UseCounter` using the code below:

```
class Counter{
  private var value: Int=0
  
  def inc(): Unit={
    value+=1
  }
  def getValue(): Int={
    return value
  }
}

object UseCounter{
  def main(args: Array[String]): Unit={
    var counter1: Counter=new Counter()
    println("counter 1: "+counter1.getValue)
    counter1.inc()
    println("counter 1: "+counter1.getValue)
  }
}
```

Run the program & look at the output, is it what you expected? Add some more calls to `inc()` & re-run the program, does it do what you expect? </n> Create a second counter instance & add some called to `inc()` then print the value to the console/terminal. 
</n></n>
Add a new function to the `Counter` class:

```
  def inc(n:Int): Unit={
    for(i <- 1 to n){
      inc()
    }
  }
```

Now call the function within the `UseCounter` object, does it complete its intended function? How does the program know to distinguish this function from the already create `inc()` function?
</n></n>
Add the function below to the program, including examples of how they could be used:
```
  def setValue(newValue:Int)
  def reset() // Reset Counter To 0
```

## 3. Counter 4
Create a new counter class called `LimitCounter` with the purpose to count either up/down in steps 1 between lower & upper value. When the counter reaches the upper value it should wrap around back to the lower value. If the counter is at the lower value & decremented then should wrap around to upper value.

### 3.1 Constructors
Default constructor which sets inital values lower limit 0, upper limit 10 & counter 0. Auxilliary constructor accept value initial values lower limit/upper limit & set counter lower limit. Auxilliary constructor accept value initial values lower/upper limit & counter.

### 3.2 Mutator Methods
Functions that set/change encapsulated state values.
* `def reset(lo:Int,up:Int)` Initialises state lower limit, upper limit & counter.
* `def setLowerLimit(lo:Int)` If counter below new lower limit then make counter equal new lower limit.
* `def setUpperLimit(up:Int)` If counter above new upper limitthen make counter equal new upper limit.
* `def setToLowerLimit()` Resets counter lower limit.
* `def setToUpperLimit()` Resets counter upper limit.
* `def inc()` Increment counter - wrapping lower limit when upper limit reached.
* `def dec()` Decrement counter - wrapping upper limit when lower limit reached.

### 3.3 Accessor Methods
Functions that return values from the encapsulated sate.
* `def getLowerLimit: Int` Returns current lower limit value.
* `def getUpperLimit: Int` Returns current upper limit value.
* `def getValue: Int` Returns current counter value.
* `def isAtLowerLimit: Boolean` Returns true if counter currently at lower limit else false.
* `def isAtUpperLimit: Boolean` Returns true if counter currently at upper limit else false.

### 3.4 Main Method
Once finished copying codde create a main function within an object called `UseLimitCounter` demonstrate all constructors & some functions being used. Consider problems mentioned previous weeks for `Counter` object. Similar problems occur constructors?

## 4. Birthdays
Write class Scala called `Birthday` which maintains internal private state representing people's birthday. Store names strings & birthdays as day(Int), month(Int/String) & Year(Int). Add constructor which accepts values name, day, month & year. Create public methods retrieve values.
</n>
Write program which creates List `Birthdays` & adds same sample `Birthday` objects. Filter list using methods(`apply`, `filter`, `map`).
* Search list for people who has birthday given day & print out names.
* Search list for people certain names & print out brithdays.

## 5. Shoppinh Cart
Write class within Scala called `Item` which maintains internal private state representing name(String) & price(Int) of product. Add constructor which accepts values for name & price.
* Write program creates list products
* Calculate sum prices of products
* Create `Map` which hold pairs Product & quantity(Int). `var A:Map[Item,Int]=Map()`
* Add products some quantity to Map. `A += (item1 -> 5)`
* Calculate overall price shopping cart & print out number with decimal point

# Challenges - Classes ASCII Graphics Library
Continue graphical case study introduced last week. Purpose extend graphics library so multiple canvases created single program. New concepts developed `gfx` package since ideas closely related. First rename concepts, reason so we not get `Canvas` object created last week confused new type Canvas introduced this week. `Layer` used called canvas. Whereas only had single canvas able create multiple layers, intention number layers layered on top each other create image. Illustration below shows an example of what will be created:

```
          ________________________
         /                       /
        /       000000          /  <-  Top layer (0)
       /       000000          /
      /       000000          /
     /       000000          /__
    /_______________________/  /   <- Layer 1
      /        11111111       /
     /        11111111       /_
    /_______________________/  /   <- Layer 2
      /  2222222222222222     /
     /  2222222222222222     /
    /_______________________/
```

Viewed from on top the image would look like:

```
     ______________________
    |                      |
    |       000000         |
    |       000000         |
    |  2222200000011122    |
    |  2222200000011122    |
    |______________________| 
```

Each layer diagram above is different call canvas, multiple layers used form image with layers on top appearing above the ones below. First section redesign take old `Canvas` object & re-write it as class. Code more less straight copy `Canvas` object except few ascpects. 
</n></n>
Object-oriented language `one` & `two` referred as instances/objects. Important point each instances maintains own state. Note create each instance provided parameters constructor this case these are length & width layer. We allow dimensions specified when instance created. Computer memory created 2 distinct objects each own state. Individual objects modified over time independently.

```
        _____________________________           __________________________________
       |Layer                        |         |Layer                             |
one--->|                             |  two--->|                                  |
       | Xmax = 19                   |         | Xmax = 24                        |
       | Ymax =  5                   |         | Ymax =  7                        |
       | x    = 14                   |         | x    =  5                        |
       | y    =  7                   |         | y    =  2                        |
       | direction = E               |         | direction = SW                   |
       | nib  = '*'                  |         | nib  = '+'                       |
       | background = '.'            |         | background = '.'                 |
       | writing = true              |         | writing = true                   |
       | grid = .................... |         | grid = ......................... |
       |        .......*****........ |         |        .++++....++++....++++.... |
       |        .......*****........ |         |        .++++....++++....++++.... |
       |        .......*****........ |         |        .++++....++++....++++.... |
       |        .......*****........ |         |        .....++++....++++........ |
       |        .................... |         |        .....++++....++++........ |
       |_____________________________|         |        .....++++....++++........ |
                                               |        ......................... |
                                               |__________________________________|
```

Changing 
