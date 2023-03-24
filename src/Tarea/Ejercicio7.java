/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion: Programa lea la longitud de los    *
 * catetos de un triángulo rectángulo y calcule   *
 *  la longitud de la hipotenusa según el         *
 *  teorema de Pitágoras.                         *                    
 **************************************************/

package Tarea;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in); 
		
		System.out.println("Ingresa el primer cateto del triangulo ");
		double cateto1 = sc.nextDouble();
		
		System.out.println("Ingresa el segundo catero del triangulo");
		double cateto2 = sc.nextDouble();
		
	  double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	  
	  System.out.println("La longitud de la hipotenusa es: " + hipotenusa );
		
		
	}
	
}
