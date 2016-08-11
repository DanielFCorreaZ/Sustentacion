/*
 Desarrollar un programa que calcule la nota definitiva de un estudiante en una asignatura, se
sabe que durante el semestre académico se manejan tres notas con sus respectivos
porcentajes así: seguimiento (50%), parcial I (25%) y parcial 2 (25%).

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaApplication4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        
    Scanner lector = new Scanner (System.in);
    double seguimiento,parcial1,parcial2,nota;
    System.out.println("Ingrese la nota del seguimiento");
    seguimiento=lector.nextDouble();
    System.out.println("Ingrese la nota del parcial 1");
    parcial1=lector.nextDouble();
    System.out.println("Ingrese la nota del parcial 2");
    parcial2=lector.nextDouble();
    nota=seguimiento*0.5+parcial1*0.25+parcial2*0.25;
    System.out.println("La nota definitiva es "+nota);
    }
}
