using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _005Abstract
{
    class Program
    {
        static void Main(string[] args)
        {
            Phone sony = new Phone("z2", "Sony", "4G");
            Tablet tablet = new Tablet("s7", "samsung");

            sony.ShowBrand();
            tablet.ShowBrand();
        }
    }
}
