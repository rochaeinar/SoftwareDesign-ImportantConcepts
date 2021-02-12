using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _006Interface
{
    class Playstation: Playable
    {
        private string version;

        public Playstation(string version)
        {
            this.version = version;
        }

        public void Play()
        {
            Console.WriteLine("Playing with Playstation");
        }
    }
}
