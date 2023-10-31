using System;

namespace p18_u3 
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c;
            double s = 1500, a = 1, t = 1;
            for (c = 1; c <= 6; c++)
            {
                Console.WriteLine("Sueldo por año: " + s);
                a = s * 0.10;
                s = s + a;
            }
            t = t + s;
            Console.WriteLine("El sueldo a cabo dentro de 6 años es: " + t);
        }
    }
}