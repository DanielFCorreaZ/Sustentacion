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
public class PERSONAL_DATE {
    private String nombre, apellido,edad,cedula,fecha,dir,tel;

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    public void Loading_Data(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Digite el nombre: ");
        nombre= lector.next();
        System.out.println("Digite el apellido: ");
        apellido= lector.next();
        System.out.println("Digite el edad: ");
        edad= lector.next();
        System.out.println("Digite el cedula: ");
        cedula= lector.next();
        System.out.println("Digite el fecha de nacimiento: ");
        fecha= lector.next();
        System.out.println("Digite la direccion: ");
        dir= lector.next();
        System.out.println("Digite el telefono: ");
        tel= lector.next();
    }
    public void Data_Show(){
        System.out.println(" Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad+" Cedula: "+cedula+" Fecha de nacimiento: "+fecha+" Direccion: "+dir+" Telefono: "+tel);
    }
           
            }



