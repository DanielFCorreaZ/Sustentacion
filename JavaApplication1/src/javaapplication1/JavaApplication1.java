/*
Desarrolle un algoritmo que permita calcular el volumen y el área de un cubo.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        
    Scanner lector = new Scanner (System.in);
    double lado,volumen,area;
    System.out.println("Ingrese el lado del cubo");
    lado=lector.nextInt();
    volumen=Math.pow(lado, 3);
    area=6*lado*lado;
    System.out.println("El area del cubo es "+area+"El volumen es "+volumen);
    }
}
