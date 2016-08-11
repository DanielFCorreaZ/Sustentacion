/*
8. Escribir un programa utilizando la estructura Switch, que reciba dos números de dos cifras,
tome el primer número digitado y dependiendo del valor del último digito haga:
0: Diga cuál es mayor 5: Calcule la división
1: Diga cuál es menor 6: Diga si el primero es divisible por el segundo
2: Calcule la suma 7: Diga si el segundo es divisible por el prime
3: Calcule la resta 8: calcule la raíz cuadrada del primer número
4: Calcule la multiplicación 9: Imprima en pantalla “Que punto tan fácil 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication8 {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        
    Scanner lector = new Scanner (System.in);
    int pri,seg,u,aux;
    System.out.println("Ingrese el primer numero de dos cifras");
    pri=lector.nextInt();
    System.out.println("Ingrese el segundo numero de dos cifras");
    seg=lector.nextInt();
    u=pri%10;
    switch (u)
    {
        case 0 : if(pri==seg)
                 System.out.println("Son iguales");
                 else
                   if(pri>seg)
                       System.out.println("El mayor es "+pri);
                   else
                       System.out.println("El mayor es "+seg);
                 break;
        case 1 : if(pri==seg)
                 System.out.println("Son iguales");
                 else
                   if(pri>seg)
                       System.out.println("El menor es "+seg);
                   else
                       System.out.println("El menor es "+pri);
                 break;
        case 2 : aux=pri+seg;            
                System.out.println("La suma es "+aux);
        			break;
        case 3 : aux=pri-seg;
                System.out.println("La resta es "+aux);
        			break;
        case 4 : aux=pri*seg;
                System.out.println("el producto es "+aux);
        			break;
        case 5 : aux=pri/seg;
                System.out.println("La division es "+aux);
        			break;
        case 5 : aux=seg%pri;
                if(aux==)
                System.out.println("La division es "+aux);
        			break;
        default: System.out.println("Numero invalido");
        			break;			
    }
    
    
    System.out.println();
    }
}
