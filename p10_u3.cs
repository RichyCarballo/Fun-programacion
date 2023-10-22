using System;

namespace MyApp // p10_u3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ht, hex;
            double pago, sueldosem = 0;
            Console.WriteLine("¿Cuantas horas trabajaste?");
            ht = Convert.ToInt32(Convert.ToDouble(Console.ReadLine()));
            Console.WriteLine("¿Cuanto es el pago por hora?");
            pago = Convert.ToInt32(Convert.ToInt32(Console.ReadLine()));

            if (ht <= 40)
            {
                sueldosem = ht * pago;
                Console.WriteLine("Recibiras un total de $" + sueldosem);
            }
            else
            {
                hex = ht - 40;
                sueldosem = 40 * pago + hex * (pago * 2);
                Console.WriteLine("Por trabajar " + hex + " horas extra, usted recibe un total de $" + sueldosem);


            }
        }
    }
}