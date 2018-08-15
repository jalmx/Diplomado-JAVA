
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josef
 */
public class Suma {

    
    public static void main(String[] args) {
        
        try{
            
            System.out.println(5/1);
            
        }catch(ArithmeticException e){
            
             System.out.println("No se puede dividir entre cero");
             
        }
        
        Scanner sc = new Scanner(System.in);
        int valor;
        
        try{
        
            System.out.println("Dar un valor entero");
            valor = sc.nextInt();
            
            System.out.println("El valor dado es: " + valor);
            
        }catch(Exception e){
            
            System.out.println("Diste un valor que no es entero");
            
        }
        
    }
    
}
