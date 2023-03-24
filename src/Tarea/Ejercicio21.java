/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Programa que lea dos números y calcula cuál es el mayor
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio21 {
	
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);

	      System.out.print("Ingrese el primer número: ");
	      int num1 = input.nextInt();

	      System.out.print("Ingrese el segundo número: ");
	      int num2 = input.nextInt();

	      if (num1 > num2) {
	         System.out.println(num1 + " es mayor que " + num2);
	      } else if (num2 > num1) {
	         System.out.println(num2 + " es mayor que " + num1);
	      } else {
	         System.out.println("Ambos números son iguales");
	      }
	      
	      input.close();
	   }
	}



