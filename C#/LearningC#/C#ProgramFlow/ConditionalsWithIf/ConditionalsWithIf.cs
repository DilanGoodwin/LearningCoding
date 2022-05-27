using System;

namespace Conditionals{
    class Program{
        static void Main(string[] args){
            int theVal=50;

            // If-Else
            if(theVal==50){
                Console.WriteLine("theVal is 50");
            }else{
                Console.WriteLine("theVal is something else");
            }

            // If-IfElse-Else
            if(theVal==50){
                Console.WriteLine("theVal is 50");
            }else if(theVal>=51&&theVal<=60){
                Console.WriteLine("theVal is between 51 and 60");
            }else{
                Console.WriteLine("theVal is something else");
            }

            // Ternary Operator
            Console.WriteLine(theVal<50?"theVal is small":"theVal is large");
        }
    }
}