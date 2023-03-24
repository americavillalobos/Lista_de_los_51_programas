/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion: Programa que lea un número entero
 *  N de 5 cifras y muestre sus cifras desde el
principio.      *
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Ingrese un número entero de 5 cifras: ");
		        int numero = sc.nextInt();

		        int digito1 = numero / 10000;
		        int digito2 = (numero / 1000) % 10;
		        int digito3 = (numero / 100) % 10;
		        int digito4 = (numero / 10) % 10;
		        int digito5 = numero % 10;

		        System.out.println("Los dígitos del número son: " + digito1 + " " + digito2 + " " + digito3 + " " + digito4 + " " + digito5);
		

	}

}
