using System; 

namespace DefiningProperties{ 
    class Program{ 
        static void Main(string[] args){ 
            Book b1=new Book("War and Peace","Leo Tolstoy",825);

            Console.WriteLine(b1.Name);
            Console.WriteLine(b1.Desctiption);

            b1.ISBN="100140447938";
            b1.Price=24.95m;
            Console.WriteLine(b1.ISBN);
            Console.WriteLine(b1.Price);

            b1.Name="Crime and Punishment";
            b1.PageCount=625;
            Console.WriteLine(b1.Desctiption);
            Console.WriteLine(b1.Name);
            Console.WriteLine(b1.PageCount);
        } 
    } 
}
