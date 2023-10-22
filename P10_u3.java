/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p10_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P10_u3 {

    public static void main(String[] args) {
        
            Scanner sc= new Scanner(System.in);
            int ht, hex;
            double pago, sueldosem = 0;
            System.out.println("¿Cuantas horas trabajaste?");
            ht = sc.nextInt();
            System.out.println("¿Cuanto es el pago por hora?");
            pago = sc.nextInt();

            if (ht <= 40 )
            {
                sueldosem = ht * pago;
                System.out.println("Recibiras un total de $" + sueldosem);
            }
            else
            {
                hex = ht - 40;
                sueldosem = 40 * pago + hex * (pago * 2);
                System.out.println("Por trabajar " + hex + " horas extra, usted recibe un total de $" + sueldosem);


            }
    }
}
