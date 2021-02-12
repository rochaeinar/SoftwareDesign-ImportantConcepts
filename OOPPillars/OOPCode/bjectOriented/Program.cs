using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bjectOriented
{
    class Program
    { 
        static void Main(string[] args)
        {
            Phone sonyPhone = new Phone("Sony");
            Phone xiaomiPhone = new Phone("Xiaomi");

            sonyPhone.ShowBrand();
            xiaomiPhone.ShowBrand();
        }
    }
}
