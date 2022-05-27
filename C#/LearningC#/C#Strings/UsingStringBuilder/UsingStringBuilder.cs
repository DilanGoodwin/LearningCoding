using System; 
using System.Text;

namespace UsingStringBuilder{ 
    class Program{ 
        static void Main(string[] args){ 
            int jumpCount=10;
            string[] animals={"goats","cats","pigs"};

            //Create String Builder
            StringBuilder sb=new StringBuilder("Initial string.",200);

            //Print Basic Stats String Builder
            Console.WriteLine($"Capacity: {sb.Capacity}; Length: {sb.Length}");

            //Add Strings to String Builder
            sb.Append("The quick brown fox ");
            sb.Append("jumped over the lazy dog.");

            //Append Line 
            sb.AppendLine();

            //Append Format
            sb.AppendFormat("He did this {0} times.",jumpCount);
            sb.AppendLine();

            //Append Join
            sb.Append("He also jumped over ");
            sb.AppendJoin(',',animals);

            //Modify Content Using Replace
            sb.Replace("fox","cat");

            //Insert Content at Given Index
            sb.Insert(0,"This is the ");

            Console.WriteLine($"Capacity: {sb.Capacity}; Length: {sb.Length}");

            //Convert Single String
            Console.WriteLine(sb.ToString());
        } 
    } 
}
