using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Protected
{
    class Program
    {
        static void Main(string[] args)
        {
            MobileDevice sony = new Phone("z2", "Sony", "4G");
            MobileDevice tablet = new Tablet("s7", "samsung");

            sony.Play();
            tablet.Play();
        }
    }
}
