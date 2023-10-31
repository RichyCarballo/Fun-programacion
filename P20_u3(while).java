/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p20_u3;

/**
 *
 * @author richy
 */
public class P20_u3 {

    public static void main(String[] args) {
        int c=1,a=1, ah=3; //a= año ah= ahorro 
        
    while(c<=365)
       {
        System.out.println("Su ahorro es de: " + ah);   
        ah = ah * 3;
        a = ah + a;
        c++;
       }
        System.out.println("Su ahorro anual es: "+ a);   
    }
}
