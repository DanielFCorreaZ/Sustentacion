/*
 Escriba un algoritmo que permita calcular la hipotenusa de un triángulo rectángulo utilizando
el teorema de Pitágoras.

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication2 {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        
    Scanner lector = new Scanner (System.in);
    double lado,lado1,v,v1,v2,hipo;
    System.out.println("Ingrese el cateto A");
    lado=lector.nextDouble();
    System.out.println("Ingrese el cateto B");
    lado1=lector.nextDouble();
    v=Math.pow(lado, 2);
    v1=Math.pow(lado1, 2);
    v2=v+v1;
    hipo=Math.sqrt(v2);
    System.out.println("La hipotenusa es "+hipo);
    }
}
