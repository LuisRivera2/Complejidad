/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complejidad;

/**
 *
 * @author User
 */
public class Ejercicio3 {
  static int suma(int[] v, int tamaño){
        int i;
        int result;
        result = 0;
        for (i = 0; i < tamaño-1; i++) {
            result = result + v[i];
        }
        return result;
    }
      public static void main(String[] args) {
        
    }
}