/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author drai11
 */
public class Principal {
public static void main(String[] args){ 
        // TODO code application logic here
    int a,b,area,per; 
    Scanner lector = new Scanner (System.in);
    rectangulo r1 = new rectangulo();
    
    System.out.println("Digite el ancho: ");
    a=lector.nextInt();
    r1.setAncho(a);
    System.out.println("Digite el alto: ");
    //b=lector.nextInt();
    r1.setAlto(lector.nextInt());
    //r1.set_values(a, b);
    //r1.get_value();
    System.out.println("Ancho: " +r1.getAncho()+" Alto: "+r1.getAlto()); 
    
    //area=r1.area();
    per=r1.perimetro();
   System.out.println("Area: " +r1.area()+" Perimetro: "+per);     
    }
}