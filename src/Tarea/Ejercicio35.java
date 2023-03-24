/**************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez *
 * Fecha de creacion:23/03/2023                   *
 * Fecha de modificacion:23/03/2023               *
 * Descrpcion:Programa que lea una variable entera 
 * mes y compruebe si el valor corresponde a un
   mes de 30, 31 o 28 días. Se mostrará además 
   el nombre del mes. Se debe comprobar
 que el valor introducido esté comprendido entre 1 y 12.
 *************************************************/
package Tarea;

import java.util.Scanner;

public class Ejercicio35 {
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      System.out.print("Introduce un número de mes (1-12): ");
      int mes = sc.nextInt();
      
      String nombreMes;
      int numDias;
      
      switch(mes) {
          case 1:
              nombreMes = "enero";
              numDias = 31;
              break;
          case 2:
              nombreMes = "febrero";
              numDias = 28;
              break;
          case 3:
              nombreMes = "marzo";
              numDias = 31;
              break;
          case 4:
              nombreMes = "abril";
              numDias = 30;
              break;
          case 5:
              nombreMes = "mayo";
              numDias = 31;
              break;
          case 6:
              nombreMes = "junio";
              numDias = 30;
              break;
          case 7:
              nombreMes = "julio";
              numDias = 31;
              break;
          case 8:
              nombreMes = "agosto";
              numDias = 31;
              break;
          case 9:
              nombreMes = "septiembre";
              numDias = 30;
              break;
          case 10:
              nombreMes = "octubre";
              numDias = 31;
              break;
          case 11:
              nombreMes = "noviembre";
              numDias = 30;
              break;
          case 12:
              nombreMes = "diciembre";
              numDias = 31;
              break;
          default:
              System.out.println("El valor introducido no corresponde a un mes válido.");
              return;
      }
      
      System.out.println("El mes de " + nombreMes + " tiene " + numDias + " días.");
  }


}
