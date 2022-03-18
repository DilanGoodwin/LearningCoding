
import scala.io.StdIn._

class Item(private var name:String,private var price:Int){
    def getName(): String=return name
    def getPrice(): Int=price
}

object Shopping{
    def main(args: Array[String]): Unit={
        var itemList: List[Item]=List(new Item("Bread Loaf",1),new Item("Milk 2L",2),new Item("Cheese",5),new Item("Apples Crate",10),new Item("Beef",18),new Item("Salt",1),new Item("Croissants",20))
        var usersShopping:Map[Item,Int]=Map()
        var userInput: Int=0

        println("Available Items: ")

        for(i <- 0 to (itemList.length-1)){
            println(i+1+". "+itemList(i).getName())
        }

        println("Please enter the item number you would like to add to your list, enter 0 to end the program.")

        do {
            userInput=readLine("\nItem: ").toInt

            if(userInput!=0){
                var userQuantity: Int=readLine("Quantity: ").toInt
                usersShopping += (itemList(userInput-1) -> userQuantity)
            }
        }while(userInput!=0)
        var totalPrice: Int=usersShopping.map(x => x._1.getPrice*x._2).sum
        println("Total Price: £"+totalPrice)
    }
}