/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p13_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P13_u3 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int c, num;
        for (c=1; c<=100; c++)
        {
        System.out.println("Ingrese la cantidad de valores totales: ");
        num = sc.nextInt();
       
        if (num>0)
        {
            System.out.println("Positivo");
        }else
        {
            System.out.println("Negativo");
        }
    }
}
}