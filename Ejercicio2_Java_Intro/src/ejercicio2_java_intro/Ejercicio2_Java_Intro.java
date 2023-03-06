/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejercicio2_java_intro;

import java.util.Scanner;

public class Ejercicio2_Java_Intro {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.nextLine();
        System.out.println("Tu nombre es "+ nombre);
    }
    
}
