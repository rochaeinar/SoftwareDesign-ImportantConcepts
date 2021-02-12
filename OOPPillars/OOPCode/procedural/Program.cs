using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace procedural
{
    class Program
    {
        static void Main(string[] args)
        {
            printBrand("Sony");

            printBrand("Samsung");

            printBrand("Xiaomi");
        }

        private static void printBrand(string brand)
        {
            Console.WriteLine("The brand is: " + brand);
        }
    }
}
