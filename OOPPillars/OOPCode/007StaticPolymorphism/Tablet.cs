using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _007StaticPolymorphism
{
    class Tablet : MobileDevice
    {

        public Tablet(string model, string brand): base(model, brand)
        {
        }

        public override void DisplayApplication()
        {
            throw new NotImplementedException();
        }

        public override void ShowBrand()
        {
            Console.WriteLine(string.Format("the brand of the Tablet is: {0}", base.brand));
        }
    }
}
