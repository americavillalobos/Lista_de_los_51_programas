/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion: Programa que calcula el área de un *
 * triángulo a partir de la longitud de sus lados.*                                   
 *************************************************/

package Tarea;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la base ");
		double base = sc.nextDouble();
		
		System.out.println("Ingrese la altura");
		double altura = sc.nextDouble();
		
		double area = (base * altura) /2;
		
		System.out.println("El area del triangulo es: " + area);
	}

}
