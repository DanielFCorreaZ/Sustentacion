/*
 9. Generar los números del 1 al 10 utilizando un ciclo que vaya de 10 a 1.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication9 {
public static void main(String[] args){ 
        // TODO code application logic here
     
    Scanner lector = new Scanner (System.in);
   int aux=1;

            
            for(int i=10; i>0; i--){
                System.out.print(aux+" ");
                aux++;
            } 
    }

}