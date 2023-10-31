/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p16_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P16_u3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int c=1, hora, pago, sueldo;
        while (c<=20)
        {
            System.out.println("Ingrese la cantidad de horas trabajadas: ");
            hora= sc.nextInt();
            System.out.println("Ingrese el pago de las horas: ");
            pago= sc.nextInt();
            sueldo= hora * pago;        
            System.out.println("Su sueldo semanal es: " + sueldo);
            c++;
        }
    }
}
