using System; 

namespace ReturningMultipleValues{ 
    class Program{ 
        static void Main(string[] args){ 
            //Tuples Grouped Values
            (int a,int b) tup1=(5,10);
            var tup2=("Some text",10.5f);

            //Tuple Values Mutable
            tup1.b=20;
            tup2.Item1="New String";

            Console.WriteLine($"{tup1.a}, {tup1.b}");
            Console.WriteLine($"{tup2.Item1}, {tup2.Item2}");

            //Functions Work Tuples
            (int,int) result=PLusTimes(6,12);
            Console.WriteLine($"Sum: {result.Item1}, Product: {result.Item2}");

        } 

        //Function Return Multiple Values Using Tuples
        static (int,int) PLusTimes(int a,int b){
            return(a+b, a*b);
        }

    } 
}
