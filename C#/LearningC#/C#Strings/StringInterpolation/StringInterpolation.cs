using System; 

namespace StringInterpolation{ 
    class Program{ 
        static void Main(string[] args){ 
            string make="Mercedes-Benz";
            string model="G Class";
            int year=2020;
            float miles=8_450.27f;
            decimal price=60_275.0m;

            //Output Using Formatting
            Console.WriteLine("This car is a {0} {1} {2}, with {3} miles and cost £{4}",year,make,model,miles,price);

            //String Interpolation
            Console.WriteLine($"This car is a {year} {make} {model}, with {miles} miles and cost £{price}");
            Console.WriteLine($"This car is a {year} {make} {model}, with {miles} miles and cost {price:C2}");

            //Inline Expressions
            Console.WriteLine($"This car is a {year} {make} {model}, with {miles*1.6:F2} km and cost {price:C2}");
            Console.WriteLine($"This car is a {year} {make} {model}, with {{{miles*1.6:F2}}} km and cost {price:C2}");

        } 
    } 
}
