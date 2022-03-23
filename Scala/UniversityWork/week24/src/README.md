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

This allows you to independently change each of the layers. Constructors can take parameters which can be used to initialise state to set user specified values at creation. The following parameters have been set to be defined at creation for `Layer`:

```
class Layer(horiz:Int,vert:Int,fg:Char,bg:Char,dir:Direction,wr:Boolean){
```

When new layer created user supply initial values dor dimensions, foreground & background, initial direction & pen state. The entire class is shown below:

```
package gfx
import Array._
import Compass._

class Layer(horiz:Int,vert:Int,fg:Char,bg:Char,dir:Direction,wr:Boolean){

  // Fills In Blanks User Input Creating Instance Class
  def this(horiz:Int,vert:Int,fg:Char,bg:Char,dir:Direction)={
    this(horiz,vert,fg,bg,dir,false)
  }
  def this(horiz:Int,vert:Int,fg:Char,bg:Char)={
    this(horiz,vert,fg,bg,N,false)
  }
  def this(horiz:Int,vert:Int,fg:Char)={
    this(horiz,vert,fg,'.',N,false)
  }
  def this(horiz:Int,vert:Int)={
    this(horiz,vert,'*','.',N,false)
  }

  // Privatises Values Layer Class
  private val Xmax: Int=horiz-1
  private val Ymax: Int=vert-1
  private var x: Int=_
  private var y: Int=_
  private var direction: Direction=_
  private var nib: Char=_
  private var background: Char=_
  private var writing: Boolean=_
  private var grid: Array[Array[Option[Char]]]=ofDim[Option[Char]](horiz,vert)

  // Resets Canvas Initial State
  def reset(): Unit={
    x=0
    y=0
    direction=dir
    background=bg
    nib=fg
    writing=wr
    for(i<-0 to Xmax; j<-0 to Ymax){
      grid(i)(j)=None
    }
  }

  // Accessor Methods
  def getX: Int=x
  def getY: Int=y
  def getXY: (Int,Int)=(x,y)
  def getDirection: Direction=direction
  def getBackground: Char=background
  def getNib: Char=nib
  def isWriting: Boolean=writing
  def getXmax: Int=Xmax
  def getYmax: Int=Ymax
  def getPixelAt(i:Int,j:Int): Option[Char]={
    if((i>=0)&&(i<=Xmax)&&(j>=0)&&(j<=Ymax)){
      grid(i)(j)
    }else{
      None
    }
  }

  // Mutator/Setter Methods
  def setX(newX:Int): Unit={
    x=Math.min(Math.max(0,newX),Xmax)
  }
  def setY(newY:Int): Unit={
    y=Math.min(Math.max(0,newY),Ymax)
  }
  def setXY(newX:Int,newY:Int): Unit={
    setX(newX)
    setY(newY)
  }
  def setBackground(bg:Char): Unit={
    background=bg
  }
  def setNib(n:Char): Unit={
    nib=n
  }
  def setDirection(d:Direction): Unit={
    direction=d
  }
  def startWriting(): Unit={
    writing=true
  }
  def stopWriting(): Unit={
    writing=false
  }

  // Painting Canvas
  def paint(): Unit={
    for(j<-Ymax to 0 by -1){
      for(i<-0 to Xmax){
        grid(i)(j) match{
          case None => print(background)
          case Some(c) => print(c)
        }
      }
     println()
    }
  }

  // Move Cursor
  def move(): Unit={
    if(isWriting){
      grid(x)(y)=Some(nib)
    }
    direction match{
      case N => if(y<Ymax){
        y=y+1
      }
      case NE => if((y<Ymax)&&(x<Xmax)){
        y=y+1
        x=x+1
      }
      case E => if(x<Xmax){
        x=x+1
      }
      case SE => if((y>0)&&(x<Xmax)){
        y=y-1
        x=x+1
      }
      case S => if(y>0){
        y=y-1
      }
      case SW => if((y>0)&&(x>0)){
        y=y-1
        x=x-1
      }
      case W => if(x>0){
        x=x-1
      }
      case NW => if((y<Ymax)&&(x>0)){
        y=y+1
        x=x-1
      }
    }
  }

  // Turn Pen Direction
  def turn(leftOrRight:Direction=>Direction){
    direction=leftOrRight(direction)
  }

  // Repeat Given Action Set n Times
  def repeat(n:Int)(a:=>Unit)={
    for(i<-1 to n){
      a
    }
  }

  // Move n Times
  def move(n:Int): Unit={
    repeat(n){
      move()
    }
  }

  // Turn Right/Left n Times
  def turn(leftOrRight:Direction=>Direction,n:Int): Unit={
    repeat(n){
      turn(leftOrRight)
    }
  }

  // Filled Square
  def filledSquare(n:Int): Unit={
    for(i<-n to 1 by -2){
      square(i)
      turn(right,1)
      move()
      turn(left,1)
    }
  }

  // Square
  def square(n:Int): Unit={
    if(n<2){
      move()
    }else{
      repeat(4){
        move(n-1)
        turn(right,2)
      }
    }
  }

  // Isosceles Triangle Base Length n
  def tri(n:Int): Unit={
    move(n)
    turn(right,3)
    move(n/2)
    turn(right,2)
    move(n/2)
    turn(right,3)
  }

  // Reflect Canvas About Imaginary Line Vertically
  def flipAboutVertical(): Unit={
    for(i<-0 to Xmax; j<-0 to (Ymax/2)){
      val temp=grid(i)(j)
      grid(i)(j)=grid(i)(Ymax-j)
      grid(i)(Ymax-j)=temp
    }
  }

  // Relect Canvas About Imaginary Line Horizontally
  def flipAboutHorizontal(): Unit={
    for(j<-0 to Ymax;i<-0 to (Xmax/2)){
      val temp=grid(i)(j)
      grid(i)(j)=grid(Xmax-i)(j)
      grid(Xmax-i)(j)=temp
    }
  }

  // Shift All Pixels One Place Right
  def shiftRight(): Unit={
    for(j<-0 to Ymax;i<-Xmax to 1 by -1){
      grid(i)(j)=grid(i-1)(j)
    }
  }

  // Mask
  def mask(other:Layer): Unit={
    for(j<-0 to Xmax;j<-0 to Ymax){
      if(other.getPixelAt(i,j).isEmpty){
        grid(i)(j)=None
      }
    }
  }
  reset()
}
```

## Using Layer Build Image
Purpose allowing multiple layers that image be constructed from. One layer placed above another & where layer has empty pixel then layer below can be seen. Top moat layer considered layer 0. Provide an Image class represent collection layers. Methods provided manipulating layers.

```
package gfx

class Image(initLayer:Layer){
  // Image Have At Least One Layer
  private var layers: List[Layer]=List(initLayer) // Layer 0 Top Stack
  private var background: Char=initLayer.getBackground

  // Set New Background Character
  def setBackground(bg:Char){
    background=bg
  }

  // Return Largesr X-Dimension/Y-Dimension All Stacked Layers
  def maxX: Int=layers.map(_.getXmax).max
  def maxY: Int=layers.map(_.getYmax).max
  def getNumberOfLayers: Int=Layers.length

  // Return Layer Number First Non-None Pixel Given Co-Ordinate
  def getActiveLayer(i:Int,j:Int): Int={
    layers.takeWhile(_.getPixelAt(i,j).isEmpty).length
  }

  // Return Top-Most Active Pixel Given Co-Ordiante
  def getActivePixel(i:Int,j:Int): Option[Char]={
    val idx=getActiveLayer(i,j)
    if(idx==layers.length){
      None
    }else{
      layers(idx).getPixelAt(i,j)
    }
  }

  // Move Given Layer Top
  def moveLayerToTop(idx:Int): Unit={
    if((idx>=0)&&(idx<layers.length)){
      layers=layers(idx) :: (layers.take(idx) ++ layers.drop(idx+1))
    }
  }

  // Move Ative Layer Top
  def moveActiveLayerToTop(i:Int,j:Int): Unit={
    val idx=getActiveLayer(i,j)
    moveLayerToTop(idx)
  }

  // Push New Layer Top Current Picture
  def push(layer:Layer): Unit={
    layers=layer :: layers
  }

  // Insert Layer Current Picture
  def insertLayer(i:Int,layer:Layer): Unit={
    layers=layers.take(i) ++ (layer :: layers.drop(i))
  }

  // Removes Specified Layer From Image
  def removeLayer(i:Int): Unit={
    layers=layers.take(i) ++ layers.drop(i+1)
  }

  // Reverse Order Layers
  def reverseLayers(): Unit={
    layers=layers.reverse
  }

  // Paint Image Terminal
  def paint(): Unit={
    for(j<-maxY to 0 by -1){
      for(i<-0 to maxX){
        getActivePixel(i,j) match{
          case None => print(background)
          case Some(c) => print(c)
        }
      }
    println()
    }
  }
}
```

# Week 24 Challenges

## 1. Picture 3
Add `Layer` & `Image` classes graphics package `gfx`. Remember these classes not object so when create them need create classes each them. Within the `demo` package create following program:

```
package demo

object Picture3{
  import gfx.Layer
  import gfx.Image

  def main(args: Array[String]): Unit={
    val zero: Layer=new Layer(40,20,'0')
    val one: Layer=new Layer(50,15,'1')

    zero.setXY(20,5)
    zero.startWriting()
    zero.square(7)
    one.setXY(23,8)
    one.startWriting()
    one.square(7)
    zero.paint()
    one.paint()
  }
}
```

## 2. Picture 4
Make copy `Picture 3` & call it `Picture 4` but replace 2 lines that paint indicidual layers with following:

```
val p: Image=new Image(one)
p.push(zero)
p.paint()
```

Experiment with the following cases & adpat the program with the modifications below:

### 2.1
Add the following lines, how does the image displayed differ from previous image:

```
p.moveLayerToTop(1)
p.paint()
```

### 2.2
Create 3rd layer call it `two`. Put something interesting on the layer, then add the layer to the top of the image stack & print it out. Try reversing the order of the layers & printing again.

## 3. Augment Layer
Previous week you added new methods to `Canvas` library, add these methods to the `Layer` library. Then create new image with multiple layers which draw picture each layer using digit methods. Try adding, removing & changing order layers resulting image changes each time. By doing this gain experience each methods in `Image` library. 

## 4. Picture 5
Study following program carefully, it blends features functional programming & features object-oriented programming.

```
package demo

object Picture5{
  import gfx.Layer
  import gfx.Image
  import gfx.Compass._

  def main(args: Array[String]): Unit={
    val layers=(0 to 9) map (i=>new Layer(40,15,(i+48).toChar,' ',N,true))
    for (i<-0 to 9){
      layers(i).setXY(i*3,i)
      layers(i).filledSquare(5)
    }
    val image=new Image(layers(9))
    for(i<-8 to 0 by -1){
      image.push(layers(i))
    }
    image.paint()
    layers map(_.flipAboutHorizontal())
    image.paint()
    image.reverseLayers()
    image.paint()
    image.moveLayerToTop(5)
    image.paint()
  }
}
```

Once the code has been studied & the output seen modify the program following way.

### 4.1
Change size squares so they don't overlap. Dimensions layers may need to be adjusted.

### 4.2
Comment out later experiments following first `image.paint()`. Flip horizontally each even numbered layer so the following is printed:

```
                                   99999        
                   88888           99999        
                   88888     77777 99999        
                   88888 666667777 99999        
                   888855555667777 99999        
                   88885555566744444            
                 33333 5555566744444            
                 33333 5555566 44444 22222      
           11111 33333 55555   44444 22222      
           11111 33333         44444 22222 00000
           11111 33333               22222 00000
           11111                     22222 00000
           11111                           00000
                                           00000     
```

## 5. Mask
`Layer` class contains mask, destructive operation layer & uses another layer remove pixels from original. Program uses mask show horizontal stripes through offset squares.

```
package demo

object Picture6{
  import gfx.Layer
  import gfx.Image
  import gfx.Compass._

  def main(args: Array[String]): Unit={
    val layers=(0 to 9) map (i=> new Layer(40,15,(i+48).toChar,' ',N,true))
    for(i<-0 to 9){
      layers(i).setXY(i*3,i)
      layers(i).filledSquare(5)
    }
    val image=new Image(layers(9))
    for(i<-8 to 0 by -1){
      image.push(layers(i))
    }
    image.paint()

    // Create Mask
    val mask=new Layer(40,15)
    mask.startWriting()
    for(i<-0 to 14 by 2){
      mask.setXY(0,i)
      mask.setDirection(E)
      mask.move(40)
    }

    // Apply Mask Every Layer
    for(i<-0 to 9){
      layers(i).mask(mask)
    }
    image.paint()
  }
}
```

Try the following experiments:
* Adapt the mask so it uses vertical stripes instead horizontal ones.
* Adapt mask so it uses both vertical & horizontal stripes.
* Apply mask only odd-numbered layers.
