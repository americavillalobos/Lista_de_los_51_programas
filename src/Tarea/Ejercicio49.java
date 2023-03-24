/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Programa que pase de millas a kilómetros
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio49 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduce la cantidad de millas que quieres convertir a kilómetros: ");
	        double millas = sc.nextDouble();
	        
	        double kilometros = millas * 1.60934;
	        
	        System.out.println(millas + " millas son " + kilometros + " kilómetros.");
	    }
	}



