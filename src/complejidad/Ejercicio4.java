/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complejidad;

/**
 *
 * @author User
 */
public class Ejercicio4 {
    static int aSaber (int [] v , int n){
        int i;
        int result;
        int tamaño=10;
        result = 0;
        i = 0;
        while (i<tamaño) {
            result = result+v[i];
            i=i+1;   
        }
     return result;
    }
   public static  void main(String[]args){
       
   } 
}
