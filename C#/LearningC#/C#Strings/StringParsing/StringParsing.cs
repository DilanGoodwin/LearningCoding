using System; 
using System.Globalization;

namespace StringParsing{ 
    class Program{ 
        static void Main(string[] args){ 
            string numStr1="1";
            string numStr2="2.00";
            string numStr3="3,000";
            string numStr4="3,000.00";

            //Parse Function
            int targetNum=0;

            try{
                //Parse Simple Integer
                targetNum=int.Parse(numStr1);
                Console.WriteLine(targetNum);

                //Using Parse Floating Point Number
                targetNum=int.Parse(numStr2,NumberStyles.Float);
                Console.WriteLine(targetNum);

                //Use Parse Try Number Thousands Marker
                targetNum=int.Parse(numStr3,NumberStyles.AllowThousands);
                Console.WriteLine(targetNum);

                //Use Parse Try Number Thousands & Decimal Marker
                targetNum=int.Parse(numStr4,NumberStyles.Float|NumberStyles.AllowThousands);
                Console.WriteLine(targetNum);

                //Boolean Example
                Console.WriteLine($"{bool.Parse("True")}");

                //Floating Point Example
                Console.WriteLine($"{float.Parse("1.235"):F2}");


            }catch{
                Console.Write("Conversion Failed");
            }

            //Try Parse
            bool succeeded=false;

            succeeded=Int32.TryParse(numStr1,out targetNum);

            if(succeeded){
                Console.WriteLine($"{targetNum}");
            }
        } 
    } 
}
