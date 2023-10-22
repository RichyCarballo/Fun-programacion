/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p7_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P7_u3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            double T;
            System.out.println("¿Qué temperatura hay hoy?");
            T = sc.nextInt();

            if (T >= 27)
            {
                System.out.println("¡Hace calor!");
            }
            else if (T < 27 && T >= 20)
            {
                System.out.println("¡Clima agradable!");
            }
            else
            {
                System.out.println("!clima fresco!");
                        
            }
    }       
}
