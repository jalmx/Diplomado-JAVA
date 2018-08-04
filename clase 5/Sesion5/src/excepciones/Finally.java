/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author josef
 */
public class Finally {

    
    public static void main(String[] args) {
        Object o= null;
        
        try{
            System.out.println("Antes del erro");
            o.getClass();
            System.out.println("Despues del error");
            
        }catch(ArithmeticException | NullPointerException e){
            
            System.out.println("Ocurrio un erro");
            
        }finally{
            
            System.out.println("Se ejecuta siempre");
            
        }
    }
    
}
