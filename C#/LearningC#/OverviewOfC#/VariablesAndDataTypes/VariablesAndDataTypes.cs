using System;

namespace VariablesAndDataTypes{
    class Program{
        static void Main(string[] args){
            //Declare Some Basic Value Type Variables
            int i=10;
            float f=2.0f;
            decimal d=10.0m;
            bool b=true;
            char c='c';

            //Declare A String = It's A Collection Of Characters
            string str="a string";

            //Declare An Implicit Varaible 
            var x=10;
            var z="Hello!";

            //Declare An Array Of Values
            int[] vals=new int[5];
            string[] strs={"one","two","three"};

            //Print The Values Using A Formatting String
            Console.WriteLine("{0},{1},{2},{3},{4},{5},{6},{7}",i,c,b,str,f,d,x,z);

            //Null Means No Value
            object obj=null;
            Console.WriteLine(obj);

            //Implicit Conversion Between Types
            long bignum;
            bignum=i;

            //Explicit Conversions
            float i_to_f=(float)i;
            Console.WriteLine("{0}",i_to_f);

            int f_to_i=(int)f;
            Console.WriteLine("{0}",f_to_i);
        }
    }
}