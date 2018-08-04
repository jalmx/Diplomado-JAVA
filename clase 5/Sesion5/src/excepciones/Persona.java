/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author josef
 */
public class Persona {
    
    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        
        if(edad <= 0){
            throw new PersonaException(edad);
        }else{
            this.edad = edad;
        }
        
    }

    /**
     *
     * @return el nombre de la <strong>persona</strong>
     */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
}
