using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _008DynamicPolymorphism
{
    class Program
    {
        static void Main(string[] args)
        {
            MobileDevice sony = new Phone("z2", "Sony", "4G");
            MobileDevice tablet = new Tablet("s7", "samsung");

            sony.DisplayApplication();
            tablet.DisplayApplication();
        }
    }
}
