/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:  Programa que lea dos caracteres por teclado y compruebe si son iguales
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio27 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Ingresa el primer caracter: ");
	        char caracter1 = input.next().charAt(0);

	        System.out.print("Ingresa el segundo caracter: ");
	        char caracter2 = input.next().charAt(0);

	        if (caracter1 == caracter2) {
	            System.out.println("Ambos caracteres son letras minúsculas.");
	        } else {
	            System.out.println("Al menos uno de los caracteres no es una letra minúscula.");
	        }

	        input.close();
	    }
	}



