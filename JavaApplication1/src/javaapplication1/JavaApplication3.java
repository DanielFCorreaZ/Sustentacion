/*
 Dado el valor del lado de un triángulo equilátero, haga un algoritmo que calcule su perímetro,
su altura y su área. 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        
    Scanner lector = new Scanner (System.in);
    double lado,lado1,v,v1,v2,altura,perimetro,raiz,area;
    System.out.println("Ingrese el lado del triangulo equilatero");
    lado=lector.nextDouble();
    v=Math.pow(lado, 2);
    lado1=lado/2;
    v1=Math.pow(lado1, 2);
    v2=v-v1;
    altura=Math.sqrt(v2);
    perimetro=3*lado;
    raiz=Math.sqrt(3);
    area=(raiz/4)*v;
    System.out.println("La altura es "+altura + "El perimetro es "+perimetro + "El area es "+area );
    }
}
