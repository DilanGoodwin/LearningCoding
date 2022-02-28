import scala.io.StdIn._

object LetterIdentifier{
    def main(args: Array[String]): Unit={
        var userInput: Char=readLine("Please enter a character: ").charAt(0)

        if(userInput=='a'||userInput=='e'||userInput=='i'||userInput=='o'||userInput=='u'){
            println("VOWEL")
        }else if(userInput=='b'||userInput=='c'||userInput=='d'||userInput=='f'||userInput=='g'||userInput=='h'||userInput=='j'||userInput=='k'||userInput=='l'||userInput=='m'||userInput=='n'||userInput=='p'||userInput=='q'||userInput=='r'||userInput=='s'||userInput=='t'||userInput=='v'||userInput=='w'||userInput=='x'||userInput=='y'||userInput=='z'){
            println("CONSONANT")
        }else{
            println("Character is non-alphabetic")
        }
    }
}