/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descripcion:Programa que lee por teclado el    *
 * valor del radio de una circunferencia y calcula y *
 *muestra por pantalla la longitud y el área de    *
 *la circunferencia. Longitud de la circunferencia  *   
 *= 2*PI*Radio, Area de la circunferencia = PI*Radio^2 *
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del radio");
		double radio = sc.nextDouble();
		
		// se tinen que declarar las valiables la del valor de pi
		double pi = 3.1416;
		
		//las operaciones a realizar calcular la longitud y el area de la circuferencia 
		double longitud = 2 * pi * radio;
		double area = pi * radio * radio;
		
		System.out.println("La Longitud de la circuferencia es " + longitud);
		System.out.println("El area de la circuferencia es "  + area);
		
	}

}
