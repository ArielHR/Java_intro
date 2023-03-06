/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package ejercicio.pkg3_java_intro;

import java.util.Scanner;

public class Ejercicio3_Java_Intro {


    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String frase;
     System.out.print("Ingresa una frase ");
     frase = leer.nextLine();
     System.out.println(frase.toUpperCase());
     System.out.println(frase.toLowerCase());
    }
    
}
