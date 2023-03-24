/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Calcular el mayor de tres números enteros en Java.
 *************************************************/
package Tarea;

public class Ejercicio33 {
	public static void main(String[] args) {
	    int num1 = 10;
	    int num2 = 20;
	    int num3 = 30;

	    if (num1 >= num2 && num1 >= num3) {
	      System.out.println(num1 + " es el número más grande.");
	    } else if (num2 >= num1 && num2 >= num3) {
	      System.out.println(num2 + " es el número más grande.");
	    } else {
	      System.out.println(num3 + " es el número más grande.");
	    }
	  }

}
