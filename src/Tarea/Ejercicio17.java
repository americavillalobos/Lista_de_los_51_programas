/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion: 7. Programa Java que lea un número entero y calcule si es par o impar.
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio17 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un número entero: ");
	        int numero = sc.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println(numero + " es par");
	        } else {
	            System.out.println(numero + " es impar");
	        }
	    }
	}



