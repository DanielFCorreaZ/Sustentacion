/*
 Realizar un programa que tenga una clase llamada PERSONAL_DATE y permita almacenar
los datos personales de una persona: Nombre, Apellidos, Edad, Número de Cedula, Fecha de
Nacimiento, Dirección y Teléfono. Las operaciones a implementar son:
 Una función Loading_Data(): solicita al usuario los datos de una persona
 Una función Data_Show(): permite ver la información de la persona.
 Implementar un programa para un banco que permita administrar la cuenta de sus
   usuarios. Para esto defina una clase llamada CLIENT que contiene los datos personales
   del punto anterior (numeral 2) y además tenga el saldo de la cuenta. Las operaciones a
   implementar son las dos del numeral anterior y ademásFunción Actualizar_datos():
   Permite al usuario modificar sus datos personales.
 Función Consignación(): Permite a determinado usuario consignar dinero en su cuenta.
 Función Retiro(): Permite al usuario retirar dinero de su cuenta.
 Función Consultar_Saldo(): Permite al usuario verificar el saldo de la cuenta.
El programa debe mostrar un menú con varias opciones que permita seleccionar la opción
deseada.

 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author drai11
 */
public class JavaClases3 {
    
    
public static void main(String[] args){ 
        // TODO code application logic here
    int op;
    Scanner lector = new Scanner (System.in);
    CLIENT client = new CLIENT();
do{    
   System.out.println("Digite el numero de la accion a realizar: "); 
   System.out.println("1.Ingresar datos");
   System.out.println("2.Mostrar datos");
   System.out.println("3.Actualizar datos");
   System.out.println("4.Consignar");
   System.out.println("5.Retirar");       
   System.out.println("6.Consultar saldo");
   System.out.println("0.Salir"); 
   op=lector.nextInt();
switch(op){
    case 0: 
        break;
    case 1:  client.Loading_Data();
        break;
    case 2:  client.Data_Show();
        break;
    case 3:  client.Actua_Data();
        break;    
    case 4:  client.Consig();
        break;
    case 5:  client.Retiro();
        break;
    case 6:  client.Consu_Saldo();
        break; 
    default: System.out.println("Numero incorrecto"); 
}  
}while(op!=0);    
}

}
    
