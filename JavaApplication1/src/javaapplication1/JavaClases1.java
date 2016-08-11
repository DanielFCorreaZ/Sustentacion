/*
 13. Implementar un programa que utilice clases y que permita visualizar los primeros n términos
 de la serie Fibonacci. 
 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author drai11
 */
public class JavaClases1 {
private int n;
private int serie[];

    public void setN(int n) {
        this.n = n;
    }

    public int[] series(){
        serie = new int[n];
        serie[0]=0;
        if (n>1)
        serie[1]=1;
        for(int i=2; i<n; i++){
          serie[i]=serie[i-1]+serie[i-2];  
        }
        
        return serie;
    }

   
public static void main(String[] args){ 
        // TODO code application logic here
     
    Scanner lector = new Scanner (System.in);
    JavaClases1 r1 = new JavaClases1();
    int serie[],a;
    System.out.println("Digite el numero de digitos que desea mostrar : ");
    a=lector.nextInt();
    r1.setN(a);
    serie=r1.series();

            System.out.print("La serie fibonaccie es: ");
            for(int i=0; i<=a-1; i++){
                System.out.print(serie[i]+" "); 
            } 
    }

}
    
