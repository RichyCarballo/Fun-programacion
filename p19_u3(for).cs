using System;

namespace p19_u3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c, cn, n = 0, i = 0, M = 0, m = 0;
            Console.WriteLine("Ingrese la cantidad de numeros: ");
            cn = Convert.ToInt32(Console.ReadLine());

            for (c = 1; c <= cn; c++)
            {
                Console.WriteLine("Ingrese su numero: ");
                n = Convert.ToInt32(Console.ReadLine());
                if (n == 0)
                {
                    i++;
                }
                else if (n > 0)
                {
                    M++;
                }
                else if (n < 0)
                {
                    m++;
                }
            }
            Console.WriteLine("Numeros iguales a cero: " + i);
            Console.WriteLine("Numeros mayores a cero: " + M);
            Console.WriteLine("Numeros menores a cero: " + m);
        }
    }
}
