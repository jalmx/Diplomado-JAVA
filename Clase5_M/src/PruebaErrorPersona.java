
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josef
 */
public class PruebaErrorPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{

        Persona persona = new Persona("Juan", 100);

        System.out.println(persona);

//        try {
            
//            persona.setEdad(-10);
            
            System.out.println(persona);
            
//        } catch (Exception ex) {
//            System.out.println("La edad no es posible");
//        }
        Thread.sleep(1000);
        System.out.println("despues de 1 seg");

    }

}
