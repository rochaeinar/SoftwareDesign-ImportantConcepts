using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _011Internal
{
    public abstract class MobileDevice
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

        public void Play()
        {
            PlayGameHelper.Verify();
            Console.WriteLine(string.Format("Playing", this.brand));

            InitDatabase();
            LoadOobFiles();
            LoadStatusGame();
            ShowMainPage();
        }

        protected abstract void InitDatabase();
        protected abstract void LoadOobFiles();
        protected abstract void LoadStatusGame();
        protected abstract void ShowMainPage();

    }
}
