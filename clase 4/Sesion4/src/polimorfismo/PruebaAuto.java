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
        
//        auto.mensaje();
//        vocho.mensaje();
//        tsuru.mensaje();
        
        Auto[] autos = {auto, vocho, tsuru};
        
        for (int i = 0; i < autos.length; i++) {
            autos[i].mensaje();
        }
        
        Auto auto1 = new Vocho();
        Auto auto2 = new Tsuru();
        
        auto1.mensaje();
        auto2.mensaje();
        
    }
    
}
