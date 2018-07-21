
package objetos2;

import java.util.Random;
import java.util.Scanner;

public class PruebaAuto {

    public static void main(String[] args) {
        Auto auto = new Auto();
        
        if(auto.isEncendido()){
            System.out.println("El auto está encendido");
        }else{
            System.out.println("El auto está apagado");
        }
        
        System.out.println(auto.getNombre());
        
        auto.arrancar();
        System.out.println("Estado del auto: " + auto.isEncendido());
        
        auto.apagar();
        System.out.println("Estado del auto: " + auto.isEncendido());
        
        auto.aceleracion(" todo el punch");
        auto.aceleracion(3.3, 6);
        
        auto.darPasajeros("Juan", "Maria","Lupe");
        
        Auto jetta = new Auto("Jetta");
        
        System.out.println(jetta.getNombre());
        
        System.out.println(new Random().nextInt(10));
    }
    
}
