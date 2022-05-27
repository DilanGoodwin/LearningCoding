using System;

namespace Conditionals{
    class Program{
        static void Main(string[] args){
            int[] values={15,7,12,23,41,28,9,17,36};

            foreach(int val in values){
                //Continue Statement
                if(val>=20 && val<=29){
                    continue;
                }

                Console.WriteLine($"val is currently {val}");

                //Break Statement
                if(val>=40){
                    break;
                }
            }
        }
    }
}