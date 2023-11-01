/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p22_u3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class P22_u3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
         int suma=0, numero;
         
         do{
             System.out.println("Ingrese el numero: ");
             numero = sc.nextInt();
             suma=suma+numero;
             
             
             
         }while(numero!=0);
         System.out.println("Su resultado es: "+suma);
    }
}
