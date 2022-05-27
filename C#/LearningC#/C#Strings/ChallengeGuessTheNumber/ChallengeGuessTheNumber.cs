using System; 

namespace ChallengeGuessTheNumber{ 
    class Program{ 
        static void Main(string[] args){ 

            int theNumber=new Random().Next(20);
            // Change so 20 not hard coded
            // Change so user can play 3 times average score

            Console.WriteLine("Let's Play 'Guess the Number'!");
            Console.WriteLine("I'm thinking of a number between 0 and 20.");

             int numGuesses=1;
             int userGuess=0;

             do{
                 Console.WriteLine($"Guess: {numGuesses}");

                 bool success=false;
                 do{
                     Console.WriteLine("Enter your guess, or -1 to give up.");
                     string inputStr=Console.ReadLine();
                     success=Int32.TryParse(inputStr,out userGuess);

                     if(success==false){
                         Console.WriteLine("That is not a number.");
                         Console.WriteLine("Please only enter numbers.");
                     }
                 }while(success!=true);

                 numGuesses++;

                 if(userGuess!=theNumber && userGuess!= -1){
                     if(userGuess>theNumber){
                         Console.WriteLine("Lower");
                     }else{
                         Console.WriteLine("Higher");
                     }
                 }

             }while(userGuess!=theNumber && userGuess!= -1);

             if(userGuess==theNumber){
                 Console.WriteLine($"You got it in {numGuesses} guesses!");
             }else{
                 Console.WriteLine("Better Luck Next Time");
             }
        } 
    } 
}
