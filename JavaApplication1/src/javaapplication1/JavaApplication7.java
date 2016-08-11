/*
 Una oficina de seguros ha reunido datos concernientes a todos los accidentes de tránsito
ocurridos en el área metropolitana en el último año. Por cada conductor involucrado en un
accidente se toman los siguientes datos: año de nacimiento, sexo (1: Femenino, 2: Masculino),
registro del carro (1: Medellín, 2: Otras ciudades). Hacer un programa en java que muestre:
a) El porcentaje de conductores menores de 25 años
b) El porcentaje de conductores del sexo femenino.
c) El Porcentaje de conductores cuyos carros están registrados fuera de Medellín.

 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author drai11
 */
public class JavaApplication7 {
   
public static void main(String[] args){ 
        // TODO code application logic here
     
    Scanner lector = new Scanner (System.in);
    int a,b=1,c=0,d=0,e=0;
    int edades[],sexo[],city[],por[];

    System.out.println("Digite el numero de personas a registrar");
    a=lector.nextInt();
    edades= new int[a];
    sexo= new int[a];
    city= new int[a];
    por= new int[3];
    for(int i=0; i<=a-1; i++){
         System.out.println("ingrese edad de persona "+b); 
         edades[i]=lector.nextInt();
         System.out.println("ingrese el sexo de la persona: 2:masculino 1:femenino "+b); 
         sexo[i]=lector.nextInt();
         System.out.println("ingrese la ciudad del accidente: 1.Medellín 2.otra ciudad "+b); 
         city[i]=lector.nextInt();
         b++;
    } 
    for(int i=0; i<=a-1; i++){
         if(edades[i]<25)
            c++;
         if(sexo[i]==1)
             d++;
         if(city[i]==2)
              e++;
       } 
    por[0]=(c*100)/a;
    por[1]=(d*100)/a;
    por[2]=(e*100)/a;
    System.out.println("Porcentaje de conductores menores de 25 años "+por[0]+"%");
    System.out.println("Porcentaje de conductores del sexo femenino "+por[1]+"%");
    System.out.println("Porcentaje de conductores cuyos carros están registrados fuera de Medellín "+por[2]+"%");
    }

}
    
