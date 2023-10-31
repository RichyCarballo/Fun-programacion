/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p19_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P19_u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, cn, n=0, i=0, M=0, m=0; // i= igual M= Mayor m= menor
        System.out.println("Ingrese la cantidad de numeros: ");
        cn = sc.nextInt();
        
        for(c=1; c<=cn; c++)
        {
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
            if (n==0)
            {
                i++;
            }else if (n>0)
            {
                M++;
            }else if (n<0)
            {
                m++;
            }
        }
            System.out.println("Numeros iguales a cero: " + i);
            System.out.println("Numeros mayores a cero: " + M);
            System.out.println("Numeros menores a cero: " + m);

    }
}
