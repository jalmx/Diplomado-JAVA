/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author josef
 */
public class Persona extends Object{
    
    private String nombre;
    private int edad;

    public Persona() {
        this("sin nombre");
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Es la clase Persona, tiene de nombre " + this.getNombre() 
                +" con una edad de " + this.getEdad();
    }
}
