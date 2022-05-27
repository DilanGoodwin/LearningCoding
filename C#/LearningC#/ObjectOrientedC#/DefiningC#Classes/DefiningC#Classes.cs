using System; 

namespace Defining{ 
    class Program{ 
        static void Main(string[] args){ 
            //Create Object
            Book b1=new Book("War and Peace","Leo Tolstoy",825);
            Book b2=new Book("The Grapes of Wrath","John Steinbeck",464);

            //Call Method Object
            Console.WriteLine(b1.GetDescription());
            Console.WriteLine(b2.GetDescription());

        } 
    } 
}
