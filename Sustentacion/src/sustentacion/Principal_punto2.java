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
public class Principal_punto2 {
  public static void main(String[] args) {
      Scanner lector = new Scanner (System.in);
      int colum = 0, fila = 0, intens=0, t;
      
      System.out.println("Este programa analizara la matriz ingresada y calculara en que posiciones de dicha matriz se encuentra la intensidad correspondiente a una estrella");
      System.out.println("Ingrese la matriz de entrada, recuerde que los 2 primeros numeros deben ser menores que 10 y representan las filas y las columnas, respectivamente, de la matriz");
      System.out.println("Luego ingrese los numeros de la matriz con un espacio en blanco de separacion, empiece por el numero de la primera fila y la primera columna y siga con los numeros de dicha fila, luego, en el mismo orden, los de la siguiente fila ");
      fila = lector.nextInt();
      colum = lector.nextInt();
      int [][] matriz = new int[fila][colum]; 
      String [][] matrize = new String[fila+2][colum+2]; 
      for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                
                matriz[i][j] = lector.nextInt();
            }
        }
      
      System.out.println("Matriz ingresada:");
        for (int i = 0; i < fila; i++) { //calcula en numero de filas
            for (int j = 0; j < colum; j++) { //calcula el numero de columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
       for (int i = 0; i < fila; i++) { //calcula en numero de filas
            for (int j = 0; j < colum; j++) { //calcula el numero de columnas
                if(i==0 && j==0){
                intens+=matriz[i][j];
                intens+=matriz[i+1][j];        
                intens+=matriz[i][j+1];
                intens+=matriz[i+1][j+1];
                }
                if(i==0 && j<=colum){
                intens+=matriz[i][j];
               
                
                intens+=matriz[i+1][j-1];
                intens+=matriz[i+1][j];
                intens+=matriz[i][j-1];
                
                intens+=matriz[i][j+1];
                intens+=matriz[i+1][j+1];
                }
                if(i<=fila && j==0){
                intens+=matriz[i][j];
                intens+=matriz[i-1][j];
                
                
                intens+=matriz[i+1][j];
                
                intens+=matriz[i-1][j+1];
                intens+=matriz[i][j+1];
                intens+=matriz[i+1][j+1];
                }
                if(i<=fila && j<=colum){
                intens+=matriz[i][j];
                intens+=matriz[i-1][j];
                intens+=matriz[i-1][j-1];
                intens+=matriz[i+1][j-1];
                intens+=matriz[i+1][j];
                intens+=matriz[i][j-1];
                intens+=matriz[i-1][j+1];
                intens+=matriz[i][j+1];
                intens+=matriz[i+1][j+1];
                }
              if(intens/5>10){
                matrize[i+1][j+1]= "*";  
              }
              else{
                matrize[i+1][j+1]= " ";  
              }
              
            }
            
        } 
        
        
  }  
}
