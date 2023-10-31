using System;

namespace p21_u3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c = 1, t, num, cub;
            Console.WriteLine("Ingrese la cantidad de numeros: ");
            t = Convert.ToInt32(Console.ReadLine());

            while (c <= t)
            {
                Console.WriteLine("Ingrese su numero: ");
                num = Convert.ToInt32(Console.ReadLine());
                if (num > 0)
                {
                    cub = num * num * num;
                    Console.WriteLine("El resultado de la operacion es: " + cub);
                }
                c++;
            }
        }
    }
}