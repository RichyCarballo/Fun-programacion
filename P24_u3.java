/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p24_u3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class P24_u3 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingresa un número entero: ");
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println(num + " es par.");
            } else {
                System.out.println(num + " es impar.");
            }
        } while (true);
    }
}