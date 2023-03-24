package Tarea;

/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:22/03/2023                   *
 * Fecha de modificacion:22/03/2023               *
 * Descrpcion: Programa que calcula el número de
 * la suerte de una persona a partir de su fecha de
nacimiento.
 *************************************************/

import java.util.Scanner;

public class Ejercicio13 {
	
	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner sc = new Scanner(System.in);
	        
	        // Pedir la fecha de nacimiento del usuario
	        System.out.print("Ingresa tu fecha de nacimiento en formato dd/mm/yyyy: ");
	        String fechaNacimiento = sc.nextLine();
	        
	        // Separar el día, mes y año de la fecha de nacimiento
	        String[] partesFecha = fechaNacimiento.split("/");
	        int dia = Integer.parseInt(partesFecha[0]);
	        int mes = Integer.parseInt(partesFecha[1]);
	        int anio = Integer.parseInt(partesFecha[2]);
	        
	        // Sumar los dígitos del día, mes y año de la fecha de nacimiento
	        int sumaDigitos = sumarDigitos(dia) + sumarDigitos(mes) + sumarDigitos(anio);
	        
	        // Calcular el número de la suerte
	        int numeroSuerte = sumarDigitos(sumaDigitos);
	        
	        // Mostrar el resultado al usuario
	        System.out.println("Tu número de la suerte es: " + numeroSuerte);
	    }
	    
	    // Método para sumar los dígitos de un número entero
	    public static int sumarDigitos(int numero) {
	        int suma = 0;
	        while (numero > 0) {
	            suma += numero % 10;
	            numero /= 10;
	        }
	        return suma;
	    }
}

