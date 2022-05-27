using System;

namespace Conditionals{
    class Program{
        static void Main(string[] args){
            int myVal=15;
            int[] nums=new int[]{3,14,15,92,6};
            string str="The quick brown fox jumps over the lazy dog";

            // Basic For Loop
            for(int i=0;i<myVal;i++){
                Console.WriteLine("i is currently {0}",i);
            }

            // For Each in Loop
            foreach(int i in nums){
                Console.WriteLine("i is currently {0}",i);
            }

            //Count Number within String
            var count = 0;
            foreach(char c in str){
                if(c == 'o'){
                    count++;
                }
            }
            Console.WriteLine("Counted {0} o characters",count);
            
        }
    }
}