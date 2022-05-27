using System; 
using System.Text;

namespace ChallengePalindrome{ 
    class Program{

        static (bool,int) IsPalindrome(string userWord){
            bool wordIsPalindrome;
            int lengthWord;
            StringBuilder newString=new StringBuilder();
            foreach(char x in userWord){
                if(!char.IsWhiteSpace(x) && !char.IsPunctuation(x)){
                    newString.Append(x);
                }
            }
            string rennovatedString=newString.ToString();
            
            char[] array=rennovatedString.ToCharArray();
            Array.Reverse(array);
            string reversedWord=new string(array);

            if(rennovatedString==reversedWord){
                wordIsPalindrome=true;
                lengthWord=userWord.Length;
            }else{
                wordIsPalindrome=false;
                lengthWord=0;
            }

            return(wordIsPalindrome,lengthWord);
        }
        static void Main(string[] args){
            bool loopCondition=true;
            Console.WriteLine("Let's begin: ");

            do{
                string userWord=Console.ReadLine();
                if(userWord=="exit"){
                    loopCondition=false;
                }else{
                    (bool,int) result=IsPalindrome(userWord.ToLower());
                    Console.WriteLine($"Palindrome: {result.Item1}, Length: {result.Item2}");
                }
            }while(loopCondition);
        } 
    } 
}
