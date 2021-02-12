using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _007StaticPolymorphism
{
    class Program
    {
        static void Main(string[] args)
        {
            Phone sony = new Phone("z2", "Sony", "4G");
            Phone xiaomi = new Phone("mia2", "xiaomi", "4G");
            Tablet tablet = new Tablet("s7", "samsung");

            sony.WatchVideo("sdcard/movie.mp4");
            xiaomi.WatchVideo("sdcard/movie.mp4", "sdcard/subtitles");
            tablet.WatchVideo(new Uri("https://youtube.com"));
        }
    }
}
