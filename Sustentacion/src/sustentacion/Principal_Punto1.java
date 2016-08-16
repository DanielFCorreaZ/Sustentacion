/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sustentacion;

import java.util.Scanner;

/**
 *
 * @author drai16
 */
public class Principal_Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner lector = new Scanner (System.in);
 int j=0,op,a=0,b;
 double total=0;
 String name;
 Producto productos[]= new Producto[100]; // se pueden almacenar por lo menos 101 articulos
    
do{    
   System.out.println("Digite el numero de la accion a realizar: "); 
   System.out.println("1.Agregar Producto");
   System.out.println("2.Buscar Producto");
   System.out.println("3.Eliminar producto");
   System.out.println("4.Mostrar Inventario");
   System.out.println("5.Realizar Venta");
   System.out.println("6.Mostrar Ganancias totales");
   System.out.println("0.Salir"); 
   op=lector.nextInt();
switch(op){
    case 0: break;
    case 1: 
            productos[j]= new Producto();
            productos[j].setNombre1();
            productos[j].setCant1();
            productos[j].setPrecio1();
            j++;
        break;
    case 2: System.out.println ("Ingrese el nombre del producto a buscar ");
            name= lector.next();
            a=0;
            for(int i=0; i<j; i++){
               if (name.equals(productos[i].getNombre())) {
                  System.out.println ("El porducto con nombre "+productos[i].getNombre()+" se tiene en bodega un total de "+productos[i].getCant()+" Unidades. Tiene un valor de "+productos[i].getPrecio()+" pesos");
               
                   a=1;}
            }
          if (a!=1)  
          System.out.println ("No se encuentra el producto "+name+" en bodega");
          
        break;
    case 3: System.out.println ("Ingrese el nombre del producto a eliminar ");
            name= lector.next();
            a=0;
            for(int i=0; i<j; i++){
               if (name.equals(productos[i].getNombre())) {
                  productos[i]= new Producto();
               
                   a=1;}
            }
          if (a!=1)  
          System.out.println ("No se encuentra el producto "+name+" en bodega");
        break;
    case 4: System.out.println ("Los productos en bodega son: ");
            for(int i=0; i<j; i++){
             System.out.println ("El porducto con nombre "+productos[i].getNombre()+" se tiene en bodega un total de "+productos[i].getCant()+" Unidades. Tiene un valor de "+productos[i].getPrecio()+" pesos");   
            }
        break;    
    case 5:  System.out.println ("Ingrese el nombre del producto a comprar ");
            name= lector.next();
            a=0;
            for(int i=0; i<j; i++){
               if (name.equals(productos[i].getNombre())) {
       
                   System.out.println ("¿Que cantidad desea llevar?");
       
                  b=lector.nextInt();
                  productos[i].setVent(b);
                  productos[i].setCant(productos[i].getCant()-b);
                  total+=b*productos[i].getPrecio();
           
                  a=1; }
            }
          if (a!=1)  
          System.out.println ("No se encuentra el producto "+name+" en bodega");
        break;
    case 6:for(int i=0; i<j; i++){
         System.out.println ("Del porducto con nombre "+productos[i].getNombre()+" se vendio "+productos[i].getVent()+" Unidades. Con ganancias de "+productos[i].getPrecio()*productos[i].getVent()+" pesos");       
    }
        System.out.println ("El total de dinero ingresado es "+total+" pesos");
        break;
    
    default: System.out.println("Numero incorrecto"); 
}  
}while(op!=0);    
}

}  
