using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _007StaticPolymorphism
{
    class Phone : MobileDevice
    {
        private string networkType;

        public Phone(string model, string brand, string networkType) : base(model, brand)
        {
            this.networkType = networkType;
        }

        public override void DisplayApplication()
        {
            throw new NotImplementedException();
        }
    }
}
