using System;

namespace Conditionals{
    class Program{
        static void Main(string[] args){
            string inputStr = "";

            //Basic While Loop
            // while(inputStr != "exit"){
            //     inputStr=Console.ReadLine();
            //     Console.WriteLine("You entered {0}",inputStr);
            // }

            //Do While Loop
            do{
                inputStr=Console.ReadLine();
                Console.WriteLine("You entered {0}",inputStr);
            }while(inputStr != "exit");
        }
    }
}