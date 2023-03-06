/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package ejercicio9_java_intro;

import java.util.Scanner;

public class Ejercicio9_Java_Intro {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa una frase o palabra que inicie con A ");
        String fraseU = leer.nextLine();
        fraseU = fraseU.toUpperCase();
        String literal = fraseU.substring(0,1);
        
        if (literal.equals("A")) { 
            System.out.println("C O R R E C T O");
        } else {
            System.out.println("I N C O R R E C T O");
        }
    }
}
