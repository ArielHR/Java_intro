/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicio8_java_intro;

import java.util.Scanner;

public class Ejercicio8_Java_Intro {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa una frase");
        String fraseU = leer.nextLine();
        int longitud = fraseU.length();
        
        if (longitud == 8) {
            System.out.println("C O R R E C T O");
        } else {
            System.out.println("I N C O R R E C T O");
        }
    }
    
}
