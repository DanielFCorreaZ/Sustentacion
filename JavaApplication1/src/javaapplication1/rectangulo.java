/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;




/**
 *
 * @author drai11
 */
public class rectangulo {
    private int ancho, alto;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    
    public void set_values(int a, int b){
        ancho=a;
        alto=b;
    }
    public int area(){
        return ancho*alto;
    }
    public int perimetro(){
        return (2*(ancho+alto));
    }
    
    
public void get_value(){ 
        
    System.out.println("Ancho: " +ancho+" Alto: "+alto);


    }


}
    
