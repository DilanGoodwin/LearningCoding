import scala.io.StdIn._

object LetterMatcher{
    def main(args: Array[String]): Unit={
        var userInput: Char=readLine("Please enter a character: ").charAt(0)

        var result: String= userInput match{
            case 'a'|'e'|'i'|'o'|'u' => "VOWEL"
            case 'b'|'c'|'d'|'f'|'g'|'h'|'j'|'k'|'l'|'m'|'n'|'p'|'q'|'r'|'s'|'t'|'v'|'w'|'x'|'y'|'z' => "CONSONANT"
            case _ => "Not a character"
        }
        println(result)
    }
}