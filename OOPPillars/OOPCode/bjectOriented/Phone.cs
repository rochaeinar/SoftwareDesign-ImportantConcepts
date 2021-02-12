using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bjectOriented
{
    class Phone
    {
        private string brand;

        public Phone(string brand)
        {
            this.brand = brand;
        }

        public void ShowBrand()
        {
            Console.WriteLine(string.Format(
                "The brand is: {0}", 
                this.brand) 
                );
        }
    }
}
