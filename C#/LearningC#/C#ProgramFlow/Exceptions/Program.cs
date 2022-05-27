using System;

namespace Conditionals{
    class Program{
        static void Main(string[] args){
            int x=1002;
            int y=0;
            int result;

            //Try Catch Expression
            try{
                if(x>1000){
                    throw new ArgumentOutOfRangeException("x","x has to be 1000 or less");
                }
                result=x/y;
                Console.WriteLine("The result is: {0}",result);
            }catch(DivideByZeroException e){
                Console.WriteLine("Error");
                Console.WriteLine(e.Message);
            }catch(ArgumentOutOfRangeException e){
                Console.WriteLine("Sorry, 1000 is the limit");
                Console.WriteLine(e.Message);
            }finally{
                Console.WriteLine("This code will always run");
            }
        }
    }
}