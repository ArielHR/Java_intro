/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejercicio5_java_intro;

import java.util.Scanner;

public class Ejercicio5_Java_Intro {


    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num1;
       System.out.println("Ingresa un número entero");
       num1 = leer.nextInt();
       int d ; 
       int doble;
        doble = (num1 * 2);
       int triple ;
        triple = (num1  * 3);
       double raiz;
        raiz = Math.sqrt(num1);
       System.out.println("El doble de este número es " + doble);
       System.out.println("El triple de este número es " + triple);
       System.out.println("La raíz cuadrada de de este número es " + raiz);
       
    }
    
}
