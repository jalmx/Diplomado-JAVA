/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashMap;

/**
 *
 * @author josef
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        map.put("name", "Juan");
        map.put("correo", "juan@correo.com");
        map.put("telefono", "921458741");
        
        System.out.println(map.get("name"));
        System.out.println(map.get("correo"));
    }
    
}
