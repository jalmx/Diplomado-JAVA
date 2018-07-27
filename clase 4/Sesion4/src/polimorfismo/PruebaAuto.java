/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author josef
 */
public class PruebaAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Auto auto = new Auto();
        Auto vocho = new Vocho();
        Auto tsuru = new Tsuru();
        
        
        auto.mensaje();
        vocho.mensaje();
        tsuru.mensaje();
    }
    
}
