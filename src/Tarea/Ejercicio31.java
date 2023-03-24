/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Programa que lea dos números por teclado
 *  y muestre el resultado de la división del
primero por el segundo. Se debe comprobar que 
el divisor no puede ser cero.
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio31 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }

}
