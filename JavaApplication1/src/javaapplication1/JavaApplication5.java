/*
 La nota final del curso de Desarrollo de aplicaciones móviles está dividido en 5 partes: Quices
y seguimiento 20%, Prácticas de laboratorio 30%, Exposiciones 10%, Proyecto I 15% y
Proyecto Final el 25%, desarrolle un programa en java que permita calcular la nota final de
un estudiante del curso. Después de calcular la nota final el programa imprimirá lo siguiente
dependiendo de la nota:
a. Si la nota está entre 0 y 1 imprime “Estas en el lugar equivocado”
b. Si la nota está entre 1.1 y 2 imprime “Remal”
c. Si la nota está entre 2.1 y 3 imprime “Es posible recuperarse”
d. Si la nota está entre 3.1 y 4 imprime “Normalito”
e. Si la nota está entre 4.1 y 4.5 imprime “Muy Bien”
f. Si la nota está entre 4.6 y 5 imprime “Excelente estudiante”

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        
    Scanner lector = new Scanner (System.in);
    double seguimiento,parcial1,parcial2,proy1,proy2,nota;
    String[] estado;
    System.out.println("Ingrese la nota de los quices y seguimiento");
    seguimiento=lector.nextDouble();
    System.out.println("Ingrese la nota de las practicas de laboratorio");
    parcial1=lector.nextDouble();
    System.out.println("Ingrese la nota de las expociciones");
    parcial2=lector.nextDouble();
    System.out.println("Ingrese la nota del proyecto 1");
    proy1=lector.nextDouble();
    System.out.println("Ingrese la nota del proyecto final");
    proy2=lector.nextDouble();
    nota=seguimiento*0.2+parcial1*0.3+parcial2*0.1+proy1*0.15+proy2*0.25;
    
    if (nota<=1)
        System.out.println("Estas en el lugar equivocado");
    else
        if (1<nota && nota<=2)
          System.out.println("Remal");
        else 
            if (2<nota && nota<=3)
                System.out.println("Es posible recuperarse");
            else 
                if (3<nota && nota<=4)
                    System.out.println("Normalito");
                else 
                    if (4<nota && nota<=4.5)
                        System.out.println("Muy Bien");
                    else 
                        if (4.5<nota && nota<=5)
                            System.out.println("Excelente estudiante");

    }
}
