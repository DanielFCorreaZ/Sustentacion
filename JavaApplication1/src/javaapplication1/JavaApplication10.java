/*
 Leer un número de dos dígitos y determinar si pertenece a la serie de Fibonacci. 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication10 {
 public static void main(String[] args){ 
        // TODO code application logic here
     
    Scanner lector = new Scanner (System.in);
    int serie[],a,b=0;
    serie = new int[13];
        serie[0]=0;
        serie[1]=1;
        for(int i=2; i<13; i++){
          serie[i]=serie[i-1]+serie[i-2];  
        }
    System.out.print("Ingrese el numero de dos digitos a comparar");
    a=lector.nextInt();
    for(int i=0; i<13; i++){
          if(serie[i]==a)
            b=1;
            }
    if(b==1)
        System.out.print("El numero pertenece a la serie");
    else
        System.out.print("El numero no pertenece a la serie");
 }

}
    
