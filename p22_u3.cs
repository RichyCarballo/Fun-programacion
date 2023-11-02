using System;

namespace p22_u3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int suma = 0, numero;

            do
            {
                Console.WriteLine("Ingrese el numero: ");
                numero = Convert.ToInt32(Console.ReadLine());
                suma = suma + numero;



            } while (numero != 0);
            Console.WriteLine("Su resultado es: " + suma);
        }
    }
}
    

    

