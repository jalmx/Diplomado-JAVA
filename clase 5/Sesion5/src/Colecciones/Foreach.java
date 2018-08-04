/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> listaString = new ArrayList<>();
        
        listaString.add("mesaje 1");//0
        listaString.add("mesaje 2");//1
        listaString.add("mesaje 3");//2
        listaString.add("mesaje 1");//0
        listaString.add("mesaje 2");//1
        
        for(int i =0; i< listaString.size(); i++){
            System.out.println(listaString.get(i));
        }
        
        System.out.println("---------------");
        
        for(String nombre : listaString){
            System.out.println(nombre);
        }
        
        System.out.println("------------");
        
        String[] strings = {"valor1", "valor2","valor3"};
        
        for(String valor: strings){
            System.out.println(valor);
        }
    }
    
}
