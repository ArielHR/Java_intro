/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1._java_intro;

import java.util.Scanner;

public class Ejercicio1_Java_Intro {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingresa el primer número a sumar");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo a sumar");
        num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("El resultado de la suma de los numeros ingresados es de " + suma);
          
    }
}

