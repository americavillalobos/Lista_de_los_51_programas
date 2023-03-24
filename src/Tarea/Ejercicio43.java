/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Programa Java que muestre los números
 *  desde 1 hasta N utilizando las instrucciones
for, while y do .. while
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio43 {

	    public static void main(String[] args) {
	        
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Ingresa el número N: ");
	        int n = entrada.nextInt();
	        
	        // For loop
	        System.out.println("Usando for loop:");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        // While loop
	        System.out.println("Usando while loop:");
	        int j = 1;
	        while (j <= n) {
	            System.out.print(j + " ");
	            j++;
	        }
	        System.out.println();
	        
	        // Do-while loop
	        System.out.println("Usando do-while loop:");
	        int k = 1;
	        do {
	            System.out.print(k + " ");
	            k++;
	        } while (k <= n);
	        
	        entrada.close();
	    }
	}



