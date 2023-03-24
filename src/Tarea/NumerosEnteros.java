/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion:Programa Java que lea dos números   *
 * enteros por teclado y los muestre por pantalla *                                   *
 *************************************************/
package Tarea;

import java.util.Scanner;

public class NumerosEnteros {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		System.out.println("Ingresa el primer numero tiene que ser entero ");
		int num1 = numeros.nextInt();
		System.out.println("Ingresa el segundo numero");
		int num2 = numeros.nextInt();
		System.out.println("Los numeros que ingresaste son los siguientes " + num1 + "," + num2);
	}

}
