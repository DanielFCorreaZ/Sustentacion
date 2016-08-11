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
public class CLIENT extends PERSONAL_DATE {
   private double saldo=0,retiro=0;
   Scanner lector = new Scanner (System.in);
   public void Actua_Data(){ 
       System.out.println("Digite la nueva direccion: ");
        setDir(lector.next());
        System.out.println("Digite el nuevo tel: ");
        setTel(lector.next());
   }
   public void Consig(){
    System.out.println("Digite el valor a consignar: ");
    saldo=lector.nextDouble();
   }
   public void Retiro(){
    System.out.println("Digite el valor a retirar: ");
    retiro=lector.nextDouble();
    if(retiro>saldo)
       System.out.println("Saldo insuficiente");
    else 
        saldo=saldo-retiro;
   }
   public void Consu_Saldo(){
     System.out.println(" Su Saldo es: "+saldo);  
   }
}
