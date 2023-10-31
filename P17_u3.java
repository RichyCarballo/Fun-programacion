/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p17_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P17_u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char salir;

        do
        {
            System.out.println("Bienvenido a una sala de ejecucion");
            System.out.println("Escriba n para no condenar a muerte");
            salir = sc.next().charAt(0);
    }while(salir !='n');
    }
}
