/*
 * 4. Implemente un programa utilizando clases que permite calcular el área de las siguientes
figuras trigonométricas: círculo, triangulo, cuadro y rectángulo. El programa debe visualizar
un menú para que el usuario seleccione la figura deseada, al entrar en dicho menú se solicitan
los datos necesarios al usuario para ejecutar el cálculo, después de esto debe volver al menú
inicial. 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaClases2 {
 public static void main(String[] args){ 
        // TODO code application logic here
    int op,a;
    Scanner lector = new Scanner (System.in);
do{    
   System.out.println("Digite el numero de la figura deseada "); 
   System.out.println("1.circulo");
   System.out.println("2.triangulo");
   System.out.println("3.cuadro");
   System.out.println("4.rectangulo");
   System.out.println("0.Salir"); 
   op=lector.nextInt();
switch(op){
    case 0: 
        break;
    case 1: circulo c1 = new circulo();
               
                System.out.println("Digite el radio");
                c1.setRadio(lector.nextInt());
                System.out.println("Area: " +c1.area());
        break;
    case 2:  rectangulo r1 = new rectangulo();
               System.out.println("Digite la base");
                r1.setAncho(lector.nextInt());
                System.out.println("Digite la altura");
                r1.setAlto(lector.nextInt());
                System.out.println("Area: " +r1.area()/2);
        break;
    case 3:   rectangulo r2 = new rectangulo();
               System.out.println("Digite el lado");
               a=lector.nextInt();
                r2.setAncho(a);
                r2.setAlto(a);
                System.out.println("Area: " +r2.area());
        break;    
    case 4:      rectangulo r3 = new rectangulo();
               System.out.println("Digite el ancho");
                r3.setAncho(lector.nextInt());
                System.out.println("Digite el alto");
                r3.setAlto(lector.nextInt());
                System.out.println("Area: " +r3.area());   
        break;
    default: System.out.println("Numero incorrecto"); 
}  
}while(op!=0);    
}

}
    
