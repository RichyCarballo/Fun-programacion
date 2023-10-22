/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p9_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P9_u3 {

    public static void main(String[] args) {
        
            Scanner sc= new Scanner(System.in);
            int horaentrada, horasalida, horatotal;
            double costo = 0;
            System.out.println("Utiliza el formato de 24 horas.");
            System.out.println("¿Cual fue la hora de entrada? ");
            horaentrada = sc.nextInt();
            System.out.println("¿Cual fue la hora de salida? ");
            horasalida = sc.nextInt();

            horatotal = horasalida - horaentrada;
            System.out.println("Usted estuvo " + horatotal + " horas en total");

            if (horatotal <= 2)
            {
                costo = horatotal * 5;
                System.out.println("Por las " + horatotal + " hrs que estuvo aqui, tiene que pagar $" + costo);
            }

            else if (horatotal <= 5)
            {
                costo = 2 * 5 + (horatotal - 2) * 4;
                System.out.println("Por las " + horatotal + " hrs que estuvo aqui, tiene que pagar $" + costo);
            }

            else if (horatotal <= 10)
            {
                costo = 2 * 5 + 3 * 4 + (horatotal - 5) * 3;
                System.out.println("Por las " + horatotal + " hrs que estuvo aqui, tiene que pagar $" + costo);
            }

            else
            {
                costo = 2 * 5 + 3 * 4 + 5 * 3 + (horatotal - 10) * 2;
                System.out.println("Por las " + horatotal + " hrs que estuvo aqui, tiene que pagar $" + costo);
            }

    }
}
