/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p25u3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class P25u3 {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        char operator;
        double number1, number2, resultado;

        do {
            System.out.print("Introduzca un operador (+, -, *, /) o 'q' para cerrar: ");
            operator = input.next().charAt(0);

            if (operator == 'q') {
                break;
            }

            System.out.print("Escribe 2 numeros: ");
            number1 = input.nextDouble();
            number2 = input.nextDouble();

            switch (operator) {
                case '+':
                    resultado = number1 + number2;
                    break;
                case '-':
                    resultado = number1 - number2;
                    break;
                case '*':
                    resultado = number1 * number2;
                    break;
                case '/':
                    resultado = number1 / number2;
                    break;
                default:
                    System.out.println("Operador invalido!");
                    continue;
            }

            System.out.println(number1 + " " + operator + " " + number2 + " = " + resultado);
        } while (true);

        
    }
}
