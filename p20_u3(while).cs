using System;

namespace p20_u3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c = 1, a = 1, ah = 3;

            while (c <= 365)
            {
                Console.WriteLine("Su ahorro es de: " + ah);
                ah = ah * 3;
                a = ah + a;
                c++;
            }
            Console.WriteLine("Su ahorro anual es: " + a);
        }
    }

}
