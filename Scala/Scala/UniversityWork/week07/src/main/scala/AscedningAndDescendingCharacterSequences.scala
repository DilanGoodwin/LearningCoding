import scala.io.StdIn._

object AscedningAndDescendingCharacterSequences{
    def main(args: Array[String]): Unit={
        var charOne: Char=readLine("Please enter a character: ").charAt(0)
        var charTwo: Char=readLine("Please enter a character: ").charAt(0)

        if(charOne<charTwo){
            while(charOne<=charTwo){
                print(charOne+" ")
                charOne=(charOne+1).toChar
            }
        }else{
            while(charOne<=charTwo){
                print(charTwo+" ")
                charTwo=(charTwo-1).toChar
            }
        }
    }
}