/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Contar los números positivos introducidos por teclado
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio51 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de números: ");
	        int n = scanner.nextInt();

	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese un número: ");
	            int num = scanner.nextInt();
	            if (num > 0) {
	                count++;
	            }
	        }

	        System.out.println("La cantidad de números positivos es: " + count);
	    }
	}



