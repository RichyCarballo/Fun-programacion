/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p6_u3;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P6_u3 {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
int Numero;
System.out.println("Ingrese un numero");
Numero = sc.nextInt();

if (Numero % 2 == 0)
    System.out.println("El número es par");
else
    System.out.println("El número es impar");
    }
}
