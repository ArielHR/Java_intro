/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ejercicio7_java_intro;

import java.util.Scanner;

public class Ejercicio7_Java_Intro {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String fraseS = "eureka";
        System.out.println("Ingresa la contraseña");
        String fraseU = leer.nextLine();
        if (fraseU.equals(fraseS)) {
            System.out.println("Mensaje Correcto");
        } else { 
            System.out.println("Mensaje Incorrecto");
        }
    }
    
}
