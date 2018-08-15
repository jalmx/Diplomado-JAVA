/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> nombre = new ArrayList<>();
  
        nombre.add("juan");
        nombre.add("jose");
        nombre.add("manuel");
        nombre.add("juan");
        nombre.add("jose");
        nombre.add("manuel");
        
        System.out.println(nombre.get(0));
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(2);
        numeros.add(5);
        numeros.add(7);
        
        System.out.println(numeros.get(0));
                
    }
    
}
