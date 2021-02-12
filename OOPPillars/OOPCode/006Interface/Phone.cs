using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _006Interface
{
    class Phone: MobileDevice, Playable
    {
        private string networkType;

        public Phone(string model, string brand, string networkType): base(model, brand)
        {
            this.networkType = networkType;
        }

        public override void DisplayApplication()
        {
            throw new NotImplementedException();
        }

        public void Play()
        {
            Console.WriteLine("Playing with Phone");
        }
    }
}
