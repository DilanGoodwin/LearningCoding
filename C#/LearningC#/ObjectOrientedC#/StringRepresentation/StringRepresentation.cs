using System; 

namespace StringRepresentation{ 
    class Program{ 
        static void Main(string[] args){ 
            //Class Inherits From Object
            int x=1000;
            Console.WriteLine(x.ToString());

            //Don't Override Method Default Behaviour
            object a=new object();
            Console.WriteLine(a.ToString());

            //Use ToString Method Book Class
            Book b1=new Book("War and Peace","Leo Tolstoy",825);
            Console.WriteLine(b1.ToString());
            Console.WriteLine(b1);
            Console.WriteLine(b1.ToString('B'));
            Console.WriteLine(b1.ToString('F'));
        } 
    } 
}
