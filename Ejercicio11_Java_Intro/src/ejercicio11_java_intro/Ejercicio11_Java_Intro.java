/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicio11_java_intro;

import java.util.Scanner;

public class Ejercicio11_Java_Intro {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa un número");     
        int num1 = leer.nextInt();
        System.out.println("Ingresa un número"); 
        int num2 = leer.nextInt();
        int i;
        String exit;
        
        do {
          
          System.out.println("Elige una opción");
           System.out.println("");
           System.out.println("    MENÚ ");
           System.out.println(" 1. Sumar ");
           System.out.println(" 2. Restar ");
           System.out.println(" 3. Multiplicar ");
           System.out.println(" 4. Dividir ");
           System.out.println(" 5. Salir ");
           i = leer.nextInt();
          if (i == 5) {
              System.out.println("¿Está seguro que desea salir del programa (S/N)?");
              exit = leer.nextLine();
              if (exit.equalsIgnoreCase("S")) {
                break;
              }else if (exit.equalsIgnoreCase("N")) {
                 i = 0;
                 continue;
              }
            }
          switch (i) {
              case 1 : 
                  int suma = num1 + num2;
                  System.out.println("La suma de " + num1 + " y " + num2 + " es de " + suma);
                  System.out.println("");
                  continue;
              case 2 :
                  int resta = num1 - num2 ;
                  System.out.println("La resta de " + num1 + " y " + num2 + " es de " + resta);
                  System.out.println("");
                  continue;
              case 3 :
                  int multiplicar = num1 * num2 ;
                  System.out.println("La multiplicación de " + num1 + " y " + num2 + " es de " + multiplicar);
                  System.out.println("");
                  continue;
              case 4 :   
                  int dividir = num1 / num2 ;
                  System.out.println("La división de " + num1 + " y " + num2 + " es de " + dividir);
                  System.out.println("");
            }     
        } while ( i < 5) ; 
    }  
}

