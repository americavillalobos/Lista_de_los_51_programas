/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion: Programa quite a una variable N sus
 *  m últimas cifras.
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio15 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Ingresa un número entero: ");
	        int n = sc.nextInt();
	        
	        System.out.print("Ingresa la cantidad de cifras que quieres quitar: ");
	        int m = sc.nextInt();
	        
	        int resultado = (int) (n / Math.pow(10, m));
	        
	        System.out.println("El número resultante es: " + resultado);
	    }

	}
	


