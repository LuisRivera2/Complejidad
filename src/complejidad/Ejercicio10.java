package complejidad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Ejercicio10 {
    final static byte[] n = {4,2,5,1,6,0,6,9,5,4,5,0};
    static int numero_a_buscar = 1, i= 0;
    static boolean encontrado = false; 
    public static void main(String[] args){
        while(encontrado==false){
            if(n[i]==numero_a_buscar){
                System.out.println("El número coincidio en la posición "+i+".");
                encontrado = true;
            }
            i++;
        }
    }
            
    
}
