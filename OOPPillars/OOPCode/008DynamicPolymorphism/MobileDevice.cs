using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _008DynamicPolymorphism
{
    abstract class MobileDevice
    {
        private string model;
        protected string brand;

        public MobileDevice(string model, string brand)
        {
            this.model = model;
            this.brand = brand;
        }

        public string FullModel {
            get
            {
                return string.Format("{0} {1}", this.brand, this.model);
            }
        }

        public virtual void ShowBrand()
        {
            Console.WriteLine(string.Format("the brand of the device is: {0}", this.brand));
        }

        public abstract void DisplayApplication();

    }
}
