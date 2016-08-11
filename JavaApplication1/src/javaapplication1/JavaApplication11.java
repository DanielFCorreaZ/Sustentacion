/*
Leer un número y calcularle el factorial a todos los enteros comprendidos entre 1 y el número leído.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication11 {
 public static void main(String[] args){ 
        // TODO code application logic here
     
    Scanner lector = new Scanner (System.in);
   int aux,aux1,aux2,a[];
                 
    System.out.println("ingrese el numero de una cifra ");
      aux=lector.nextInt();
      aux1=aux;
      a= new int[aux];
      for(int i=0; i<aux; i++){
          a[i]=1;
          for(int j=aux1; j>=1; j--){
             a[i]= a[i]*j;
            }
          System.out.println("factorial de "+aux1+" es= "+a[i]);
          aux1--;
           
            }
    
    }

}