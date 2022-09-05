/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejidad;

/**
 *
 * @author luis
 */
public class Ejercicio6 {

 
    static int aSaber(int[] v, int n){
        int i;
        int result;
        int tamaño=10;
        result = 0;
        i = tamaño-1; 
        while(i >= 0){
            result = result + v[i]; 
            i = i-2; //x
           
        }
       return result; 
       
    }
      public static void main(String[] args) {
        // TODO code application logic here
    }
}
