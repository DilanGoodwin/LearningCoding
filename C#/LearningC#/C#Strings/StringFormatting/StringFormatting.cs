using System; 

namespace StringFormatting{ 
    class Program{ 
        static void Main(string[] args){ 
            int[] quarters={1,2,3,4};
            int[] slaes={100000,150000,200000,225000};
            double[] intlMixPct={.386,.413,.421,.457};
            string str1="TestStr";
            int val1=1234;
            decimal val2=1234.5678m;

            //Basic Formatting
            Console.WriteLine("{0}",str1);
            Console.WriteLine("{0:D},{0:N},{0:F},{0:G}",val1);
            Console.WriteLine("{0:E},{0:N},{0:F},{0:G}",val2);

            //Add Number After Format
            Console.WriteLine("{0:D6},{0:N2},{0:F1},{0:G3}",val1);

            //Formatting Alignment & Spacing
            Console.WriteLine("{0,12} {1,12} {2,12} {3,12}",quarters[0],quarters[1],quarters[2],quarters[3]);
            Console.WriteLine("{0,12:C0} {1,12:C0} {2,12:C0} {3,12:C0}",slaes[0],slaes[1],slaes[2],slaes[3]);
            Console.WriteLine("{0,12:P2} {1,12:P2} {2,12:P2} {3,12:P2}",intlMixPct[0],intlMixPct[1],intlMixPct[2],intlMixPct[3]);
        } 
    } 
}
