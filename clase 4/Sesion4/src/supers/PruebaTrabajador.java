/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supers;

/**
 *
 * @author josef
 */
public class PruebaTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona = new Persona();
        Trabajador trabajador = new Trabajador();
        
        persona.setNombre("Juan");
        System.out.println(persona.getNombre());
        
        trabajador.setNombre("Carlos");
        System.out.println(trabajador.getNombre());
    }

}
