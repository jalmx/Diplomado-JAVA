/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author josef
 */
public class PruebaCanino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Salchicha s = new Salchicha();
        s.setNombre("Super salchicha");
        s.setRaza("Salchicha achocolatada");
        
        Canino c = new Canino(s);
        
        System.out.println(c.getNombre());
        System.out.println(c.getRaza());
        
    }
    
}
