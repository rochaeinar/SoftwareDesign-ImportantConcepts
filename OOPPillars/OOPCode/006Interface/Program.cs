using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _006Interface
{
    class Program
    {
        static void Main(string[] args)
        {
            Playable sony = new Phone("z2", "Sony", "4G");
            Playable tablet = new Tablet("s7", "samsung");
            Playable playstation = new Playstation("5");

            sony.Play();
            tablet.Play();

            playstation.Play();
        }
    }
}
