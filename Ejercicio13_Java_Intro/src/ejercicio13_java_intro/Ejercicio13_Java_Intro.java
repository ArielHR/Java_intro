/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

 */
package ejercicio13_java_intro;

import java.util.Scanner ; 

public class Ejercicio13_Java_Intro {


    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int numU,a,b,y;
       System.out.println("Ingresa el número de lado de la figura");
       numU = leer.nextInt();
       
       for (a = 0; a < numU ; a++) {
           System.out.print(" * ");
       }
       System.out.println();
       
       for (a= 0 ; a < numU - 2 ; a++){
           System.out.print(" * ");
           for (y=0 ; y < numU - 2 ; y++){
               System.out.print("   ");
           }
           System.out.println(" * ");
       }
       
       System.out.println();
       
       for (a = 0; a < numU ; a++) {
           System.out.print(" * ");
       }
       
    }
    
}
