/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion: Programa que lea un número entero y muestre si el número es múltiplo de 10
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio19 {
	
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Ingrese un número entero: ");
	        int numero = entrada.nextInt();
	        if (numero % 10 == 0) {
	            System.out.println(numero + " es múltiplo de 10");
	        } else {
	            System.out.println(numero + " no es múltiplo de 10");
	        }
	    }
	}


