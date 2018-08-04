/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author josef
 */
public class Matematicas {
    
    public static void suma(int x, int y){
        
        int resultado = x +y;
        
        if(resultado < 0){
            throw new ArithmeticException("El resultado es negativo: " + resultado);
        }else{
            System.out.println("El resultado es: " + resultado);
        }
        
    }
    
    public static void resta(int x, int y) throws Exception{
        int resultado = x -y;
        
        if(resultado == 0){
            
            throw new ArithmeticException("Estas dando valores iguales");
            
        }else{
            
            System.out.println("La resta es: " + resultado);
        }
        
    }
    
}
