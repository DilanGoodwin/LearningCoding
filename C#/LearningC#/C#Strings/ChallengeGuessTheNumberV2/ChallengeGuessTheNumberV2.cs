using System; 

namespace ChallengeGuessTheNumber{ 
    class Program{ 
        static void Main(string[] args){

            //Starting Values
            int totalNumberGuesses=0;
            int maxRandom=0;
            bool loopCondition=true;
            // Change so user can play 3 times average score

            Console.WriteLine("Let's Play 'Guess the Number'!");
            Console.WriteLine("Playing for 3 Rounds");

            //Defining the maximum number to be guessed
            do{
                Console.WriteLine("What is the max value the number can be:");
                string maxNum=Console.ReadLine();
                bool maxConversion=Int32.TryParse(maxNum,out maxRandom);
                if(!maxConversion){
                    Console.WriteLine("You did not enter a number. Please try again.");
                }else{
                    loopCondition=false;
                }
            }while(loopCondition);

            Console.WriteLine($"I'm thinking of a number between 0 and {maxRandom}.");

            //Starting the game
            for(int i=0;i!=3;i++){
                Console.WriteLine();
                Console.WriteLine($"Round {i+1}");

                int theNumber=new Random().Next(maxRandom);
                loopCondition=true;
                int numberGuesses=1;
                int userGuess=0;

                do{
                    Console.WriteLine($"Guess: {numberGuesses}");
                    Console.WriteLine("Enter your guess, or -1 to give up.");
                    string guessString=Console.ReadLine();
                    bool conversionResult=Int32.TryParse(guessString,out userGuess);

                    if(!conversionResult){
                        Console.WriteLine("You did not enter a number. Please try again.");
                    }else{
                        if(userGuess== -1){
                            Console.WriteLine($"The number was {theNumber}");
                            loopCondition=false;
                        }else{
                            numberGuesses++;

                            if(userGuess==theNumber){
                                Console.WriteLine($"You got it in {numberGuesses} gueses!");
                                loopCondition=false;
                            }else{
                                Console.WriteLine("Guess {0}",userGuess<theNumber?"higher":"Lower");
                            }
                        }
                    }
                }while(loopCondition);

                totalNumberGuesses+=numberGuesses;
            }
        } 
    } 
}
