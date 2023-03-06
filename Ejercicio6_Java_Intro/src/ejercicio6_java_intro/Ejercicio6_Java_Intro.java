/*
Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicio6_java_intro;

import java.util.Scanner;

public class Ejercicio6_Java_Intro {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numU;
        System.out.println("Ingresa un número entero");
        numU = leer.nextInt();
        if (numU % 2 == 0) { 
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
            
        }
    }
    
}
