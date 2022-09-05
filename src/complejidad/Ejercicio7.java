package complejidad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Ejercicio7 {
    final static byte[] n = {4,2,5,1,6,0,6,9,5,4,5,0};
    static int resultado = 0;
    public static void main(String[] args){
        resultado =(n.length)*8;
        resultado +=3;
        System.out.println("El resultado es: "+resultado);    
            
    }
}
