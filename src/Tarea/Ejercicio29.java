/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Programa para calcular si un año es bisiesto
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio29 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el año: ");
	        int anio = sc.nextInt();
	        boolean esBisiesto = false;
	        
	        if (anio % 4 == 0) {
	            if (anio % 100 == 0) {
	                if (anio % 400 == 0) {
	                    esBisiesto = true;
	                }
	            } else {
	                esBisiesto = true;
	            }
	        }
	        
	        if (esBisiesto) {
	            System.out.println(anio + " es un año bisiesto.");
	        } else {
	            System.out.println(anio + " no es un año bisiesto.");
	        }
	    }
}
