/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.util.Arrays;

/**
 *
 * @author josef
 */
public class PruebaTienda {

    public static void main(String[] args) {
        
        Tienda<String> tienda = new Tienda<>(5);
        
        tienda.addElement("sopa");
        tienda.addElement("frijo");
        tienda.addElement("arroz");
        tienda.addElement("jugo");
        tienda.addElement("refresco");
        tienda.addElement("sabrita");
        tienda.addElement("cacahuates");
        
        System.out.println(
                Arrays.toString(
                        tienda.getAll()
                )
        );
        
        Tienda t = new Tienda(3);
        
        t.addElement(2);
        t.addElement("hola");
        t.addElement(tienda);
        
         System.out.println(
                Arrays.toString(
                        t.getAll()
                )
        );
    }
    
}
