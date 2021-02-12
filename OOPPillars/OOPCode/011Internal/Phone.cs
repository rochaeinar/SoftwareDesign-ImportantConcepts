using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _011Internal
{
    public class Phone: MobileDevice
    {
        private string networkType;

        public Phone(string model, string brand, string networkType): base(model, brand)
        {
            this.networkType = networkType;
        }

        protected override void InitDatabase()
        {
            Console.WriteLine("Init phone db");
        }

        protected override void LoadOobFiles()
        {
            Console.WriteLine("Load phone files");
        }

        protected override void LoadStatusGame()
        {
            Console.WriteLine("Load phone status files");
        }

        protected override void ShowMainPage()
        {
            Console.WriteLine("show phone maing game page");
        }
    }
}
