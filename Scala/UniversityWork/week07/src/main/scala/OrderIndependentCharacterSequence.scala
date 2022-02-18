import scala.io.StdIn._

object OrderIndependentCharacterSequence{
    def main(args: Array[String]): Unit={
        var charOne: Char=readLine("Please enter a character: ").charAt(0)
        var charTwo: Char=readLine("Please enter a character: ").charAt(0)

        if(charOne<charTwo){
            while(charOne<=charTwo){
                print(charOne+" ")
                charOne=(charOne+1).toChar
            }
        }else{
            while(charTwo<=charOne){
                print(charTwo+" ")
                charTwo=(charTwo+1).toChar
            }
        }
    }
}