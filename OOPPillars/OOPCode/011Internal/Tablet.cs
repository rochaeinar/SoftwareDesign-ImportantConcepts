using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _011Internal
{
    public class Tablet: MobileDevice
    {
        public Tablet(string model, string brand): base(model, brand)
        {
        }

        protected override void InitDatabase()
        {
            Console.WriteLine("Init tablet db");
        }

        protected override void LoadOobFiles()
        {
            Console.WriteLine("Load tablet files");
        }

        protected override void LoadStatusGame()
        {
            Console.WriteLine("Load tablet status files");
        }

        protected override void ShowMainPage()
        {
            Console.WriteLine("show tablet maing game page");
        }
    }
}
