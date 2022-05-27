using System; 

namespace FunctionBasics{ 
    class Program{ 

        //Functions Return Types, Name, Optional Parameters
        static float MilesToKm(float miles){
            float result=miles*1.6f;
            return result;
        }

        //Function No Return
        static void PrintWithPrefix(string theStr){
            Console.WriteLine($"::> {theStr}");
        }
        static void Main(string[] args){ 
            //Call Function
            Console.WriteLine($"The result is {MilesToKm(8.0f)}");
            Console.WriteLine($"The result is {MilesToKm(52.0f)}");
            
            PrintWithPrefix("Test String");
            PrintWithPrefix("Another Test String");
        } 
    } 
}
