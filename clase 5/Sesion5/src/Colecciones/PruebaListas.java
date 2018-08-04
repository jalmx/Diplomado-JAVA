/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author josef
 */
public class PruebaListas {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaString = new ArrayList<>();
        
        listaString.add("mesaje 1");//0
        listaString.add("mesaje 2");//1
        listaString.add("mesaje 3");//2
        listaString.add("mesaje 1");//0
        listaString.add("mesaje 2");//1
        listaString.add("mesaje 3");//2
        listaString.add("mesaje 1");//0
        listaString.add("mesaje 2");//1
        listaString.add("mesaje 3");//2
        listaString.add("mesaje 1");//0
        listaString.add("mesaje 2");//1
        listaString.add("mesaje 3");//2
        
        listaString.remove(1);//remuve el elemento de la índice 1
        
        String ele = listaString.get(0);//obtiene el elemento de la posición
        System.out.println("El elemento en la posicion 0 es: " + ele);
        
        int tamaniLista = listaString.size();//el tamaño del arrayList
        System.out.println("El tamaño de la lista es: " + tamaniLista);
        
        for(int i = 0; i < listaString.size(); i++){
            System.out.println(
                                    listaString.get(i)
            );
        }
        System.out.println("----------------------------");
        
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("lista 2");
        lista2.add("lista 2");
        lista2.add("lista 2");
        lista2.add("lista 2");
        lista2.add("lista 2");
        
        listaString.addAll(lista2);
        for(int i = 0; i < listaString.size(); i++){
            System.out.println(
                                    listaString.get(i)
            );
        }
        
        System.out.println("----------------");
        
        List<String> l = Arrays.asList("mensaje", "mensaje2");
        
        for(int i=0; i< l.size(); i++){
            System.out.println(l.get(i));
        }
    }
    
}
