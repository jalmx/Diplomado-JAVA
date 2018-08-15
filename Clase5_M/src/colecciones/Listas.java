/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class Listas {

    public static void main(String[] args) {
        
        ArrayList<String> lista= new ArrayList<>();
        
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        lista.add("elemento nuevo");
        
        System.out.println("Elemento: " + lista.get(0));
        
        System.out.println("Tamaño de la lista: " + lista.size());
        
        //lista.remove(0);
        
        for(int i =0; i< lista.size(); i++){
            
            System.out.println(lista.get(i) + " " +i);
            
        }
        
        System.out.println("---------------------");
        
        int i =0;
        
        for(String valor: lista){
            System.out.println(valor + " " +i);
            i++;
        }
    }
    
}
