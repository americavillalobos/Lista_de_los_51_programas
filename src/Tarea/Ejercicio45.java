/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Programa Java que lea dos números y 
 * muestre los números desde el menor hasta el
 * mayor
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio45 {
	
	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Ingrese el primer número: ");
	        int num1 = entrada.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int num2 = entrada.nextInt();

	        int menor = num1;
	        int mayor = num2;

	        if (num1 > num2) {
	            menor = num2;
	            mayor = num1;
	        }

	        System.out.println("Los números desde el menor hasta el mayor son:");

	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }
	    }
	}



