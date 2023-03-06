/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejercicio10_java_intro;

import java.util.Scanner;

public class Ejercicio10_Java_Intro {


    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una cifra positiva");
        int numU = leer.nextInt();
        int i = 0 ;
        while (i < numU) {
            System.out.println("Ingresa un número hasta que la suma de los mismos supere la cifra inicial");
            int numS = leer.nextInt();
            i = (i + numS);
        }
        
        System.out.println("La suma ha superado el limite inicial " + "(" + i + ")");
        
        
    }
    
}
