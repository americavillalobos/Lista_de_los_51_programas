/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion: Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. 
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio25 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Ingrese un caracter: ");
	        char c = sc.next().charAt(0);

	        if (c >= 'A' && c <= 'Z') {
	            System.out.println("El caracter ingresado es una letra mayuscula.");
	        } else {
	            System.out.println("El caracter ingresado no es una letra mayuscula.");
	        }
	    }
	}



