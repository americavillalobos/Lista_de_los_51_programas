/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion:Programa java que lee un numero     *
 * entero por teclado y obtiene y muestra por     *
 * pantalla el doble y el triple de ese numero    *
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		System.out.println("Introduce el primer numero para que te diga cual es su doble");
		int num1 = numeros.nextInt();
		int doble = num1 +num1;
		
		int triple = num1 + num1 + num1;
		
		System.out.println("El doble de tu numero es "      +doble        +      "El triple de tu numero es "       + triple);
		
		
		
	}

}
