/*
 En la U de A hay una máquina dispensadora que tiene 4 productos etiquetados con los
números 1, 2, 3 y 4, cada uno con un valor de $500, $800, $300 y $900, respectivamente.
Defina un algoritmo que lea el número de producto que ingresa el usuario y que le muestre
su precio.

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication6 {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        
    Scanner lector = new Scanner (System.in);
    int seg;
    System.out.println("Ingrese el numero del producto a comprar");
    seg=lector.nextInt();
    switch (seg)
    {
        case 1 : System.out.println("El producto vale 500 pesos");
        			break;
        case 2 : System.out.println("El producto vale 800 pesos");
        			break;
        case 3 : System.out.println("El producto vale 300 pesos");
        			break;
        case 4 : System.out.println("El producto vale 900 pesos");
        			break;
        default: System.out.println("Numero invalido");
        			break;			
    }
    
    
    System.out.println();
    }
}
