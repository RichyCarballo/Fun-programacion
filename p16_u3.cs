using System;

namespace p16_u3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i = 1, hora, pago, sueldo;
            while (i <= 20)
            {
                Console.WriteLine("Ingrese la cantidad de horas trabajadas: ");
                hora = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Ingrese el pago de las horas: ");
                pago = Convert.ToInt32(Console.ReadLine());
                sueldo = hora * pago;
                Console.WriteLine("Su sueldo semanal es: " + sueldo);
                i++;
            }
        }
    }
}