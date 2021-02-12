using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _004Inheritance
{
    class Program
    {
        static void Main(string[] args)
        {
            Phone sony = new Phone("z2", "Sony", "4G");
            Console.WriteLine(sony.FullModel);
        }
    }
}
