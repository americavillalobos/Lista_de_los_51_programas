/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:24/03/2023                   *
 * Fecha de modificacion:24/03/2023               *
 * Descrpcion:Programa que muestre los múltiplos 
 * de un número desde 1 hasta M
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio47 {
	
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduce un número: ");
	        int num = sc.nextInt();
	        
	        System.out.print("Introduce un límite M: ");
	        int M = sc.nextInt();
	        
	        System.out.println("Los múltiplos de " + num + " desde 1 hasta " + M + " son:");
	        
	        for (int i = 1; i <= M; i++) {
	            if (i % num == 0) {
	                System.out.println(i);
	            }
	        }
	        
	        sc.close();
	    }
	}


