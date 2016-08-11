/*
 En un curso se practican 4 evaluaciones con los siguientes porcentajes: 25%, 20%, 25% y
30%. Para cada estudiante se informa el código y las 4 notas. Hacer un programa que calcule
la nota definitiva de cada estudiante, el promedio de notas definitivas del curso y el
porcentaje de perdedores. Sugerencia: Asuma que el curso está compuesto por N
estudiantes, usted es libre de asignar el valor de N, 50 o 10 por ejemplo

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication12 {
public static void main(String[] args){ 
        // TODO code application logic here
        
    Scanner lector = new Scanner (System.in);
    double no25,no20,no252,no30,nofinal[],acum=0,acum1=0,pro1,pro2;
    nofinal= new double[5];
    System.out.println("Este programa calculara las notas definitivas y promedios de dichas notas para 5 estudiantes de un curso");
    for(int i=0;i<5;i++){
    System.out.println("Ingrese la nota de 25% del estudiante "+(i+1));
    no25=lector.nextDouble();
    System.out.println("Ingrese la nota de 20% del estudiante "+(i+1));
    no20=lector.nextDouble();
    System.out.println("Ingrese la nota de 25% del estudiante "+(i+1));
    no252=lector.nextDouble();
    System.out.println("Ingrese la nota de 30% del estudiante "+(i+1));
    no30=lector.nextDouble();
    nofinal[i]=no25*0.25+no252*0.25+no20*0.20+no30*0.30;
    System.out.println("La nota definitiva del estudiante "+(i+1)+" es= "+nofinal[i]);
    acum=acum+nofinal[i];
    if(nofinal[i]<3)
        acum1++;
    }
    pro1=acum/5;
    pro2=(acum1*100)/5 ;      
    System.out.println("El promedio de nota final es "+pro1+" el promedio de estudiantes perdedores es "+pro2 );
    }
}
