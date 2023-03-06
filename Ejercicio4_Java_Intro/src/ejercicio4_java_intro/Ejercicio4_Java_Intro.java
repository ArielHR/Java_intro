/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4_java_intro;

import java.util.Scanner;

public class Ejercicio4_Java_Intro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int celcius;
        System.out.print(" Ingresa los grados celcius a convertir");
        celcius = leer.nextInt();
        double convertidor = 32 + (9 * (celcius / 5));
        System.out.print(celcius + "º grados Celcius equivalen a " + convertidor + " grados Farenheit");
        
     
              
    }
    
}
