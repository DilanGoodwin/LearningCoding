using System;

namespace Operators{
    class Program{
        static void Main(string[] args){
            //Declare Some Variables To Exercise The Operators
            int x=10,y=5;
            string a="abcd",b="efgh";
            
            //Basic Math Operators
            Console.WriteLine((x/y)*x);
            Console.WriteLine(a+b);

            //Increment/Decrement Operators
            x++;
            y--;
            Console.WriteLine(x);
            Console.WriteLine(y);

            //Operators Shorthand
            a+=b;
            Console.WriteLine(a);

            //Logical Operators
            Console.WriteLine(x>y&&y>=5);
            Console.WriteLine(x>y||y>=5);

            //Null Coalescing Operators
            string str=null;

            //?? Operator
            Console.WriteLine(str??"Unknow String");

            //??= Operator
            str??="New String";
            Console.WriteLine(str);
        }
    }
}