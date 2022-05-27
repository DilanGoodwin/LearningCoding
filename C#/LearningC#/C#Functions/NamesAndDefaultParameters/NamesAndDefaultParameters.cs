using System; 

namespace NamesAndDefaultParameters{ 
    class Program{ 

        //Functions Provide Default Parameters
        static void PrintWithPrefix(string theStr,string prefix=""){
            Console.WriteLine($"{prefix} {theStr}");
        }
        static void Main(string[] args){ 
            //Test Default Parameters
            PrintWithPrefix("Hello There!","");
            PrintWithPrefix("Hello There!");
            PrintWithPrefix("Hello There!",">: ");

            //Call Named Parameters
            PrintWithPrefix(prefix:"% ",theStr:"Hello There!");
        } 
    } 
}
