/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p21_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P21_u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int c=1, t, num, cub; // t= total num= numero cub= cubo
        System.out.println("Ingrese la cantidad de numeros: ");
        t = sc.nextInt();
        
    while(c<=t)
       {
        System.out.println("Ingrese su numero: ");   
        num = sc.nextInt();
        if(num>0)
        {
            cub = num * num * num;
            System.out.println("El resultado de la operacion es: " + cub);
        }
        c++;
       }
    }
}
