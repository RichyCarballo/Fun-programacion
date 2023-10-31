/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p18_u3;

/**
 *
 * @author richy
 */
public class P18_u3 {

    public static void main(String[] args) {
         
        int c;
        double s=1500, a=1, t=1; //s= salario , t= total
        for (c=1; c<=6; c++)
        {
            System.out.println("Sueldo por año: " + s);
            a= s * 0.10;
            s= s + a;
        }        
        t = t + s;
        System.out.println("El sueldo a cabo dentro de 6 años es: " + t);
    }
}
