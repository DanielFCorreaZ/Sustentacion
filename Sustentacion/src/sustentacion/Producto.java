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
public class Producto {
private String nombre;
private int cant,vent=0;
private double precio;
Scanner lector = new Scanner (System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre1() {
        System.out.println("Ingrese el nombre del Producto");
        nombre = lector.next();
    }

    public int getCant() {
        return cant;
    }

    public void setCant1() {
        System.out.println("Ingrese la cantidad de productos");
        cant = lector.nextInt();
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    

    public double getPrecio() {
        return precio;
    }

    public int getVent() {
        return vent;
    }

    public void setVent(int vent) {
        this.vent += vent;
    }

    public void setPrecio1() {
        System.out.println("Ingrese el precio por unidad del producto");
        precio = lector.nextDouble();
    }


}
